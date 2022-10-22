import { HttpClient } from '@angular/common/http';
import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { AuthenticationService } from 'src/app/helpers/auth.service';
import { Item } from '../../types/types';
import { OrcamentoItem } from '../../types/types';
import { FormArray } from '@angular/forms';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-item-list',
  templateUrl: './item-list.component.html',
  styleUrls: ['./item-list.component.css']
})
export class ItemListComponent implements OnInit {

  @Output() OrcamentoSave = new EventEmitter<OrcamentoItem>();

  listItens: Item[] = []
  isGerandoOrcamento: boolean = false;
  listItemG: OrcamentoItem[] = [];

  constructor(
    private http: HttpClient,
    private authenticationService: AuthenticationService,
    private router: Router,
    private fb: FormBuilder,) { }

  ngOnInit(): void {
    this.http.get<Item[]>("/item").subscribe(itens => this.listItens = itens);
  }

  onSubmit = () => {
    this.listItemG.forEach((i) => this.http.post(`/ordemcompraitem`, { "id": i.id, "quantidade": i.quantidade }).subscribe());
  }

  gerarOrcamento = () => {
    this.listItemG = this.listItens.filter((item) => item.selected == true).map((i) => {
      return {"id": i.id, "descricao": i.descricao, "quantidade": 0, "id_empresa": i.id_empresa, "unidademedida": i.unidademedida} as OrcamentoItem;
    });
    this.isGerandoOrcamento = true;
  }

  selectItem = (item: Item, evt: any) => {
    item.selected = evt.currentTarget.checked;
  }

  setQtdeItem = (item: OrcamentoItem, evt: any) => {
    item.quantidade = evt.currentTarget.value;
  }

}
