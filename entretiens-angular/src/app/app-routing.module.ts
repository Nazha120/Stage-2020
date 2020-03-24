import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CandidatComponent } from './components/candidat/candidat.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { AddCandidatComponent } from './components/add-candidat/add-candidat.component';
import { EditCandidatComponent } from './components/edit-candidat/edit-candidat.component';

const routes: Routes = [
  { path: 'dashboard', component: DashboardComponent },
  { path: 'candidats', component: CandidatComponent },
  { path: 'add-candidat', component: AddCandidatComponent },
    { path: 'edit-candidat/:id', component: EditCandidatComponent },
  { path: '', redirectTo: 'dashboard' , pathMatch: 'full' },

];


@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }
