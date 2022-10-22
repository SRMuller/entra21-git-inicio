import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { FranquiasScreenComponent } from './franquias-screen/franquias-screen.component';
import { AuthGuard } from './helpers/auth.guard';
import { LandingPageComponent } from './landing-page/landing-page.component';
import { LoginComponent } from './login/login.component';
import { CadastoComponent } from './cadasto/cadasto.component';
import { CadastroClienteComponent } from './cadastro/cadastro-cliente/cadastro-cliente.component';
import { CadastroFornecedorComponent } from './cadastro/cadastro-fornecedor/cadastro-fornecedor.component';
import { CadastroItemComponent } from './cadastro/cadastro-item/cadastro-item.component';
import { AreaClienteComponent } from './area-cliente/area-cliente.component';
import { AreaFornecedorComponent} from './area-fornecedor/area-fornecedor.component';
import { ItemListComponent } from './components/item-list/item-list.component';
import { OrdemCompraComponent } from './components/ordem-compra/ordem-compra.component';


const routes: Routes = [
  { path: '', component: LandingPageComponent },
  { path: 'login', component: LoginComponent },
  { path: 'dashboard', component: DashboardComponent, canActivate: [AuthGuard] },
  { path: 'dashboard/franquias', component: FranquiasScreenComponent, canActivate: [AuthGuard] },
  { path: 'cadastro', component: CadastoComponent, canActivate: [AuthGuard] },
  { path: 'cadastro/cadastro-cliente', component: CadastroClienteComponent, canActivate: [AuthGuard]},
  { path: 'cadastro/cadastro-fornecedor', component: CadastroFornecedorComponent, canActivate: [AuthGuard]},
  { path: 'cadastro/cadastro-item', component: CadastroItemComponent, canActivate: [AuthGuard]},
  { path: 'area-cliente', component: AreaClienteComponent, canActivate: [AuthGuard]},
  { path: 'area-fornecedor', component: AreaFornecedorComponent, canActivate: [AuthGuard]},
  { path: 'components/item-list', component: ItemListComponent, canActivate: [AuthGuard]},
  { path: 'components/ordem-compra', component: OrdemCompraComponent, canActivate: [AuthGuard]},
  { path: '**', redirectTo: '/'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
