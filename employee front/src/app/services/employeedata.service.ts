import { Injectable } from "@angular/core";
import { API_URL } from "../app.constants";
import { HttpClient } from "@angular/common/http";
import { Employee } from "../models/employee";

@Injectable({
  providedIn: "root"
})
export class EmployeedataService {
  constructor(private httpClient: HttpClient) {}

  getAllEmployees() {
    return this.httpClient.get<Employee[]>(`${API_URL}/employees`);
  }
}
