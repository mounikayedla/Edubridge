import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AvailableornmComponent } from './availableornm.component';

describe('AvailableornmComponent', () => {
  let component: AvailableornmComponent;
  let fixture: ComponentFixture<AvailableornmComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AvailableornmComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AvailableornmComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
