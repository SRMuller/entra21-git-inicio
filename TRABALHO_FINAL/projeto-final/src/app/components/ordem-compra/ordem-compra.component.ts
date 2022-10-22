import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ActivatedRoute, Router } from '@angular/router';
import { AuthenticationService } from 'src/app/helpers/auth.service';
import { FormBuilder } from '@angular/forms';
import { OrdemCompra } from 'src/app/types/types';

@Component({
  selector: 'app-ordem-compra',
  templateUrl: './ordem-compra.component.html',
  styleUrls: ['./ordem-compra.component.css']
})
export class OrdemCompraComponent implements OnInit {


  @Output() ordemCompraSave = new EventEmitter<OrdemCompra>();

  OCForm = this.fb.group({
    descricao:[''],
    id_empresa:[''],

  })

  constructor(
    private http: HttpClient,
    private authenticationService: AuthenticationService,
    private router: Router,
    private fb: FormBuilder,
  ) { }

  ngOnInit(): void {
  }
  onSubmit = () => {
    this.http.post(`/ordecompra`, this.OCForm.value);


}

}
