import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { resumeComponent } from './resume.component';

describe('resumeComponent', () => {
  let component: resumeComponent;
  let fixture: ComponentFixture<resumeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ resumeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(resumeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
