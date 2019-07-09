import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeelistComponent } from './employeelist.component';
import { EmployeedataService } from '../../services/employeedata.service';
import { HttpClientTestingModule } from '@angular/common/http/testing';

describe('EmployeelistComponent', () => {
  let component: EmployeelistComponent;
  let fixture: ComponentFixture<EmployeelistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeelistComponent ],
      providers: [EmployeedataService],
      imports: [
        HttpClientTestingModule
      ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeelistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
