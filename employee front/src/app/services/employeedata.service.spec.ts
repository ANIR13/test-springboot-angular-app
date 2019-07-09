import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';

import { EmployeedataService } from './employeedata.service';

describe('EmployeedataService', () => {
  beforeEach(() => TestBed.configureTestingModule({
    providers: [EmployeedataService],
    imports: [
      HttpClientTestingModule
    ]
  }));

  it('should be created', () => {
    const service: EmployeedataService = TestBed.get(EmployeedataService);
    expect(service).toBeTruthy();
  });
});
