import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { AdminComponent } from './admin/admin.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { LoginComponent } from './login/login.component';
import { ProductListComponent } from './product-list/product-list.component';
import { RecentTransactionsComponent } from './recent-transactions/recent-transactions.component';
import { RegistrationComponent } from './registration/registration.component';
import { TransactionsComponent } from './transactions/transactions.component';

const routes: Routes = [
  {path:'login', component:LoginComponent},
  {path:'register', component:RegistrationComponent},
  {path:'dashboard', component:DashboardComponent},
  {path:'admin', component:AdminComponent},
  {path:'forgot-password',component:ForgotPasswordComponent},
  {path:'admin-login',component:AdminLoginComponent},
  {path:'transactions', component:TransactionsComponent},
  {path:'recent-transactions',component:RecentTransactionsComponent},
  {path:'product-list',component:ProductListComponent},
  {path: '**', component:LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
