import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-resume',
  templateUrl: './resume.component.html',
  styleUrls: ['./resume.component.css']
})
export class resumeComponent implements OnInit {

  myName: string = 'AKROUH';
  myfName: string = 'Mohamed';
  phone: string = '062425538';
  adress: string = 'Hai essalam , n 17 , bloc d1 - AL Hoceima ';

  constructor() { }

  ngOnInit() {
    console.log(this.myName);
  }

}
