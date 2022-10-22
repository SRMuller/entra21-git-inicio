import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from './helpers/auth.service';
import { User } from './types/types';
import { Empresa } from './types/types';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent{
  user: User | null = null;
  empresa: Empresa | boolean = false;
  apiURL: any;

    constructor(
        private router: Router,
        private authenticationService: AuthenticationService,
        private http: HttpClient
    ) {
        this.authenticationService.user.subscribe(x => this.user = x);
        this.http.get<Empresa>(`${ this.apiURL }/enpresa.fornecedor`)
           .subscribe(y => this.empresa = y);
    }

    logout() {
        this.authenticationService.logout();
    }
}
function logout() {
  throw new Error('Function not implemented.');
}

