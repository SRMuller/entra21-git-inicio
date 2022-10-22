import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OrcamentosListComponent } from './orcamentos-list.component';

describe('OrcamentosListComponent', () => {
  let component: OrcamentosListComponent;
  let fixture: ComponentFixture<OrcamentosListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OrcamentosListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OrcamentosListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
