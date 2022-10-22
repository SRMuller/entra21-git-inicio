import { HttpClient } from '@angular/common/http';
import { Component,EventEmitter, OnInit, Input, Output, OnChanges, SimpleChanges } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthenticationService } from '../helpers/auth.service';
import { Empresa } from '../types/types';


@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  @Output() cadastroSave = new EventEmitter<Empresa>();

  
   
  constructor(
    private router: Router,
    private http: HttpClient,
    private authenticationService: AuthenticationService,
    private fb: FormBuilder
  ) {
  }
  ngOnInit(): void {
  }
  logout = () => {
    this.authenticationService.logout();
  }

}
