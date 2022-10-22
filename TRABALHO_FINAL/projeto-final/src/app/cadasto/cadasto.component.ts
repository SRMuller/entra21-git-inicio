import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cadasto',
  templateUrl: './cadasto.component.html',
  styleUrls: ['./cadasto.component.css']
})
export class CadastoComponent implements OnInit {

  constructor(
    private router: Router,
  ) {}

  ngOnInit(): void {
  }
  

}
