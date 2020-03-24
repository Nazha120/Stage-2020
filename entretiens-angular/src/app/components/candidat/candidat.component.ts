import { Component, OnInit } from '@angular/core';
import { CandidatService } from '../../services/candidat.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-candidat',
  templateUrl: './candidat.component.html',
  styleUrls: ['./candidat.component.css']
})
export class CandidatComponent implements OnInit {
  candidats: any;
  public size: number = 3;
  public currentPage: number = 0;
  public totalPages: number;
  public pages: Array<number>;
  public currentKeyword: string = "";

  constructor(private candidatService: CandidatService, private router: Router) { }

  ngOnInit() {
    this.chercherCandidat();
  }
  onEditCandidat(c) {
    let url = c._links.self.href;
    this.router.navigateByUrl("/edit-candidat/" + btoa(url));
  }

  onChercher(form: any) {
    this.currentPage = 0;
    this.currentKeyword = form.keyword;
    this.chercherCandidat();

  }

  chercherCandidat() {
    this.candidatService.getCandidats(this.currentKeyword, this.currentPage, this.size)
      .subscribe(data => {
      //  this.totalPages = data["page"].totalPages;
        //this.pages = new Array<number>(this.totalPages);
        this.pages = new Array<number>(data["totalPages"]);
        this.candidats = data;
        console.log(this.pages);

      }, err => {
        console.log(err);
      })
  }
  /*
  onGetCandidats() {
    this.candidatService.getCandidats(this.currentPage, this.size)
      .subscribe(data => {
        this.totalPages = data["page"].totalPages;
        this.pages = new Array<number>(this.totalPages);
        this.candidats = data;
        console.log(data);
      }, err => {
        console.log(err);
      })
  }  */
  onPageCandidat(i) {
    this.currentPage = i;
    this.chercherCandidat();
  }
  onDeleteCandidat(c) {
    this.candidatService.deleteCandidat(c._links.self.href)
      .subscribe(data => {
        this.chercherCandidat();
      }, err => {
        console.log(err);
      }
      )
  }
}