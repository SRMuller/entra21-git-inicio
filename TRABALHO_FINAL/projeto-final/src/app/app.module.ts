import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BasicAuthInterceptor } from './helpers/basic-auth.interceptor';
import { LoginComponent } from './login/login.component';
import { LandingPageComponent } from './landing-page/landing-page.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ReactiveFormsModule } from '@angular/forms';
import { FranquiasScreenComponent } from './franquias-screen/franquias-screen.component';
import { HashLocationStrategy, LocationStrategy } from '@angular/common';
import { CadastroClienteComponent } from './cadastro/cadastro-cliente/cadastro-cliente.component';
import { CadastroFornecedorComponent } from './cadastro/cadastro-fornecedor/cadastro-fornecedor.component';
import { CadastoComponent } from './cadasto/cadasto.component';
import { CadastroItemComponent } from './cadastro/cadastro-item/cadastro-item.component';
import { AreaFornecedorComponent } from './area-fornecedor/area-fornecedor.component';
import { AreaClienteComponent } from './area-cliente/area-cliente.component';
import { ItemListComponent } from './components/item-list/item-list.component';
import {AccordionModule} from 'primeng/accordion';     //accordion and accordion tab
import {MenuItem} from 'primeng/api';
import { OrcamentosListComponent } from './components/orcamentos-list/orcamentos-list.component';
import { OrdemCompraComponent } from './components/ordem-compra/ordem-compra.component';                  //api


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    LandingPageComponent,
    DashboardComponent,
    FranquiasScreenComponent,
    CadastoComponent,
    CadastroClienteComponent,  
    CadastroFornecedorComponent,
    CadastroItemComponent,
    AreaFornecedorComponent,
    AreaClienteComponent,
    ItemListComponent,
    OrcamentosListComponent,
    OrdemCompraComponent

  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule,
    AppRoutingModule
  ],
  providers: [
    {provide: LocationStrategy, useClass: HashLocationStrategy},
    { provide: HTTP_INTERCEPTORS, useClass: BasicAuthInterceptor, multi: true }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
