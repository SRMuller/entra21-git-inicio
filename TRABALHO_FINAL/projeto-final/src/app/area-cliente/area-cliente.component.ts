import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-area-cliente',
  templateUrl: './area-cliente.component.html',
  styleUrls: ['./area-cliente.component.css']
})
export class AreaClienteComponent implements OnInit {

  constructor(private router: Router,) { }

  ngOnInit(): void {
  }

}
