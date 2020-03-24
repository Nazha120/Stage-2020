import { Component, OnInit } from '@angular/core';
import { CandidatService } from 'src/app/services/candidat.service';
import { Router, ActivatedRoute } from '@angular/router';
import { Candidat } from 'src/app/model/candidat.model';

@Component({
  selector: 'app-edit-candidat',
  templateUrl: './edit-candidat.component.html',
  styleUrls: ['./edit-candidat.component.css']
})
export class EditCandidatComponent implements OnInit {
private currentCandidat: Candidat;
  url: string;

  constructor(private router: Router, private activatedRoute: ActivatedRoute,private candidatSerice: CandidatService) { }

  ngOnInit() {
    this.url = atob(this.activatedRoute.snapshot.params.id);
    this.candidatSerice.getCandidat(this.url)
    .subscribe(data => {
       this.currentCandidat = data;
    }, err=>{
    console.log(err);
    })
  }
onUpdateCandidat(value: any){
  this.candidatSerice.updateCandidat(this.url, value)
 .subscribe(data => {
      alert('Mise à jour effectué avec succes.');
      this.router.navigateByUrl('/candidats');
    }, err=>{
    console.log(err);
    })
}
}
