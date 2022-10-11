import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HighlitgthComponent } from './highlitgth.component';

describe('HighlitgthComponent', () => {
  let component: HighlitgthComponent;
  let fixture: ComponentFixture<HighlitgthComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HighlitgthComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HighlitgthComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
