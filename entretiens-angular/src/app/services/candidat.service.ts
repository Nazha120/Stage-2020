import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Candidat } from '../model/candidat.model';
import {map} from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class CandidatService {

public host: string = "http://localhost:8080";

  constructor(private httpClient: HttpClient) { }

  public getMetiers() { 
    return this.httpClient.get(this.host + '/metiers');
  }
    public getCompetences() { 
    return this.httpClient.get(this.host + '/competences');
  }
  /*
  public getCandidats(page: number, size: number) { 
    return this.httpClient.get(this.host + '/candidats?page='+page+'&size='+size);
  }  */
    public getCandidats(mc: string, page: number, size: number){
    return this.httpClient.get(this.host + '/candidatByName?mc=' + mc +'&page='+page+'&size='+size)
    .pipe();
  }
    public deleteCandidat(url){
    return this.httpClient.delete(url);
  }
  public saveCandidat(url, data): Observable<Candidat>{
        return this.httpClient.post<Candidat>(url, data);
  }
    public getCandidat(url): Observable<Candidat> { 
    return this.httpClient.get<Candidat>(url);
  }
  public updateCandidat(url, data): Observable<Candidat> { 
    return this.httpClient.put<Candidat>(url, data);
  }
}
