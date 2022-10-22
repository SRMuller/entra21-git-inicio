import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastoComponent } from './cadasto.component';

describe('CadastoComponent', () => {
  let component: CadastoComponent;
  let fixture: ComponentFixture<CadastoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CadastoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CadastoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
