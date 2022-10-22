import { HttpClient } from '@angular/common/http';
import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthenticationService } from 'src/app/helpers/auth.service';
import { Item} from 'src/app/types/types';

@Component({
  selector: 'app-cadastro-item',
  templateUrl: './cadastro-item.component.html',
  styleUrls: ['./cadastro-item.component.css']
})
export class CadastroItemComponent implements OnInit {

  @Output() ItemSave = new EventEmitter<Item>();

  ItemForm = this.fb.group({
    descrcao:[''],
    ativo:[true],
    id_empresa:[0],
    unidademedida:['']
  })

  constructor(private router: Router,
    private http: HttpClient,
    private authenticationService: AuthenticationService,
    private fb: FormBuilder
    ) { }

  ngOnInit(): void {
    this.ItemForm.get("id_empresa")?.patchValue(this.authenticationService.userValue.id);
  }
  onSubmit = () => {
    this.http.post(`/item`, this.ItemForm.value);


}
}
