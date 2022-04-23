import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-aboutus',
  templateUrl: './aboutus.component.html',
  styleUrls: ['./aboutus.component.css']
})
export class AboutusComponent implements OnInit {
  imgpath1='assets/Images/JANE DOE.jpg';
  imgpath2='assets/Images/MIKE ROSS.jpg';
  imgpath3='assets/Images/JOHN DOE.png';
  constructor() { }

  ngOnInit(): void {
  }

}
