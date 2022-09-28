import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { TransactionsComponent } from './transactions/transactions.component';

const routes: Routes = [
  {path : 'admin' , component:AdminComponent},
  {path : 'transaction', component: TransactionsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
