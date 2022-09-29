import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RecentTransactionsComponent } from './recent-transactions.component';

describe('RecentTransactionsComponent', () => {
  let component: RecentTransactionsComponent;
  let fixture: ComponentFixture<RecentTransactionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RecentTransactionsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RecentTransactionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
