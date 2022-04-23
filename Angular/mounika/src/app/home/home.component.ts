import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
 
  imgpath11='assets/Images/EARRINGS.jpg';
  imgpath12='assets/Images/NECKLACE.jpg';
  imgpath13='assets/Images/CHAIN.jpg';
  imgpath14='assets/Images/BANGLE.jpg';
  imgpath15='assets/Images/RING.jpg';
  
  constructor() { }

  ngOnInit(): void {
  }

}
