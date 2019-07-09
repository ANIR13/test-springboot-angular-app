import { Component, OnInit } from "@angular/core";
import { Employee } from "../../models/employee";
import { EmployeedataService } from "src/app/services/employeedata.service";

@Component({
  selector: "app-employeelist",
  templateUrl: "./employeelist.component.html",
  styleUrls: ["./employeelist.component.css"]
})


export class EmployeelistComponent implements OnInit {

  employees: Employee[];
  message: string;

  constructor(private employeeDataService: EmployeedataService) {}

  ngOnInit() {
    this.refreshEmployees();
  }

  refreshEmployees() {
    this.employeeDataService.getAllEmployees().subscribe(
      response => {
        console.log(response);
        this.employees = response;
      },
      error => {
        console.log(error);
      }
    );
  }
}
