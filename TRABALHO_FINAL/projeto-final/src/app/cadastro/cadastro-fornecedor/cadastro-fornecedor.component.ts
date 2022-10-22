import { HttpClient } from '@angular/common/http';
import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthenticationService } from 'src/app/helpers/auth.service';
import { Empresa } from 'src/app/types/types';

@Component({
  selector: 'app-cadastro-fornecedor',
  templateUrl: './cadastro-fornecedor.component.html',
  styleUrls: ['./cadastro-fornecedor.component.css']
})
export class CadastroFornecedorComponent implements OnInit {


  @Output() cadastroSave = new EventEmitter<Empresa>();

  EmpresaForm = this.fb.group({
    razao_social:[''],
    cnpj:[''],
    telefone:[''],
    endereco:[''],
    fornecedor:[true],
    id_gerente:[0]
  });
  constructor(private router: Router,
    private http: HttpClient,
    private authenticationService: AuthenticationService,
    private fb: FormBuilder
    ) { }

  ngOnInit(): void {
    this.EmpresaForm.get("id_gerente")?.patchValue(this.authenticationService.userValue.id);
  }
  onSubmit = () => {
    this.http.post(`/empresa`, this.EmpresaForm.value);
  }

}
