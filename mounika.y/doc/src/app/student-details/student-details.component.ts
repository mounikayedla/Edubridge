import { Component, OnInit } from '@angular/core';
import {Validators, FormBuilder, FormGroup} from '@angular/forms';
 import { RouterModule, Routes ,Router,ActivatedRoute} from '@angular/router';
 

 // Services
 import { StudentService } from '../services/student/student.service';
 import { routerTransition } from '../../../services/config/config.service';
import { animation } from '@angular/animations';
import { animationFrameScheduler } from 'rxjs';
import { ToastrService } from 'ngx-toastr';
@Component({
  selector: 'app-student-details',
  templateUrl: './student-details.component.html',
  styleUrls: ['./student-details.component.css'],
  animations:[routerTransition],
  host: {'[@routerTransition]': ''}


})
export class StudentDetailsComponent implements OnInit {
  index:any;
  studentDetail:any;
  StudentDetails:any;
  constructor(private router: Router, private route: ActivatedRoute, private studentService:StudentService,private toastr: ToastrService) { 
    this.route.params.subscribe(paraams =>{
     this.index = paraams['id'];
     if(this.index && this.index !=null && this.index !=undefined){
       this.getStudentDetails(this.index);
     }
    });
   }
 
  

  ngOnInit(): void {

  
  getStudentDetails(index:number){
    let getStudentDetail = this.studentService.getStudentDetails(index);
    if(getStudentDetail) {
      this.studentDetail = getStudentDetail.studentData;
      this.toastr.success(getStudentDetail.message,"Success");
    }
  }

}
}