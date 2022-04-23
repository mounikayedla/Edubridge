import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { enableProdMode } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/animations;

// Services
import { AuthService } from './services/auth/auth.service';
import { UserService } from './services/user/user.service';
import { StudentService } from './services/student/student.service';

// Pipes
import { FilterPipe } from './pipes/filter.pipe';
import { PhonePipe } from './pipes/phone.pipe';
//components
import { StudentListComponent } from './components/student/list/student-list.component';
import { StudentDetailsComponent } from './components/student/details/student-details.component';
import { StudentAddComponent } from './components/student/add/student-add.component';
import { LoginComponent } from './components/login/login.component';
import { HomeComponent, homeChildRoutes } from './components/home/home.component';
import { StudentHighlightDirective } from './directives/student-highlight.directive';



const routes : Routes = [
  {
    path: '',
    component: HomeComponent,
    children :homeChildRoutes,
    canActivate : [AuthService]
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: '**',
    redirectTo: ''
  }
  ];




@NgModule({
  declarations: [
    AppComponent,
    StudentListComponent,
	StudentDetailsComponent,
	StudentAddComponent,
	LoginComponent,
	HomeComponent,
	FilterPipe,
	PhonePipe,
	StudentHighlightDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
	FormsModule,
	ReactiveFormsModule,
	BrowserAnimationsModule,
	ToastrModule.forRoot({ 
		timeOut: 3000,
		positionClass: 'toast-bottom-right',
		preventDuplicates: true,
  }),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
