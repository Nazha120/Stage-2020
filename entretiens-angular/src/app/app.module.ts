import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { CandidatComponent } from './components/candidat/candidat.component';
import { AddCandidatComponent } from './components/add-candidat/add-candidat.component';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { TemplateComponent } from './components/template/template.component';
import { EditCandidatComponent } from './components/edit-candidat/edit-candidat.component';

@NgModule({
  declarations: [
    AppComponent,
    CandidatComponent,
    AddCandidatComponent,
    DashboardComponent,
    TemplateComponent,
    EditCandidatComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
