import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmployeelistComponent } from './components/employeelist/employeelist.component';
import { resumeComponent } from './components/resume/resume.component';

const routes: Routes = [
  {path: 'employeelist', component: EmployeelistComponent},
  {path: 'resume', component: resumeComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
