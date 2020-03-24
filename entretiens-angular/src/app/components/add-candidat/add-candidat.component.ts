import { Component, OnInit } from '@angular/core';
import { CandidatService } from 'src/app/services/candidat.service';
import { Router } from '@angular/router';
import { Candidat } from 'src/app/model/candidat.model';

@Component({
  selector: 'app-add-candidat',
  templateUrl: './add-candidat.component.html',
  styleUrls: ['./add-candidat.component.css']
})
export class AddCandidatComponent implements OnInit {

 public competences: any;
  public metiers: any;
  candidat: Candidat;

  constructor(private candidatService: CandidatService, private router: Router) {
    this.candidat = new Candidat();
  }

  ngOnInit() {
    this.showCompetences();
    this.showMetiers();
  }
  onSaveCandidat() {
    this.candidatService.saveCandidat(this.candidatService.host + '/add-candidat', this.candidat)
      .subscribe(res => {
        console.log(this.candidat);
        this.router.navigateByUrl('/candidats');
      }, err => {
        console.log(err);
      })
  }
  showCompetences() {
    this.candidatService.getCompetences()
      .subscribe(data => {
        this.competences = data;
        // console.log(this.competences);
      }, err => {
        console.log(err);
      })
  }
  showMetiers() {
    this.candidatService.getMetiers()
      .subscribe(data => {
        this.metiers = data;
        //console.log(this.metiers);
      }, err => {
        console.log(err);
      })
  }
}