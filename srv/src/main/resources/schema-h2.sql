
DROP VIEW IF EXISTS EmployeeService_EmployeeProjects;
DROP VIEW IF EXISTS EmployeeService_Projects;
DROP VIEW IF EXISTS EmployeeService_ContactDetails;
DROP VIEW IF EXISTS EmployeeService_Salaries;
DROP VIEW IF EXISTS EmployeeService_Addresses;
DROP VIEW IF EXISTS EmployeeService_Positions;
DROP VIEW IF EXISTS EmployeeService_Departments;
DROP VIEW IF EXISTS EmployeeService_Employees;
DROP TABLE IF EXISTS my_company_EmployeeProjects;
DROP TABLE IF EXISTS my_company_Projects;
DROP TABLE IF EXISTS my_company_ContactDetails;
DROP TABLE IF EXISTS my_company_Salaries;
DROP TABLE IF EXISTS my_company_Addresses;
DROP TABLE IF EXISTS my_company_Positions;
DROP TABLE IF EXISTS my_company_Departments;
DROP TABLE IF EXISTS my_company_Employees;

CREATE TABLE my_company_Employees (
  employeeID INTEGER NOT NULL,
  firstName NVARCHAR(255),
  lastName NVARCHAR(255),
  dateOfBirth DATE,
  department_departmentID INTEGER,
  position_positionID INTEGER,
  address_addressID INTEGER,
  salary_salaryID INTEGER,
  contactDetails_contactID INTEGER,
  projects_employeeProjectID INTEGER,
  PRIMARY KEY(employeeID)
); 

CREATE TABLE my_company_Departments (
  departmentID INTEGER NOT NULL,
  name NVARCHAR(255),
  description NVARCHAR(255),
  PRIMARY KEY(departmentID)
); 

CREATE TABLE my_company_Positions (
  positionID INTEGER NOT NULL,
  title NVARCHAR(255),
  description NVARCHAR(255),
  PRIMARY KEY(positionID)
); 

CREATE TABLE my_company_Addresses (
  addressID INTEGER NOT NULL,
  street NVARCHAR(255),
  city NVARCHAR(255),
  state NVARCHAR(255),
  postalCode NVARCHAR(255),
  country NVARCHAR(255),
  PRIMARY KEY(addressID)
); 

CREATE TABLE my_company_Salaries (
  salaryID INTEGER NOT NULL,
  employee_employeeID INTEGER,
  amount DECFLOAT,
  currency NVARCHAR(255),
  startDate DATE,
  endDate DATE,
  PRIMARY KEY(salaryID)
); 

CREATE TABLE my_company_ContactDetails (
  contactID INTEGER NOT NULL,
  employee_employeeID INTEGER,
  email NVARCHAR(255),
  phone NVARCHAR(255),
  PRIMARY KEY(contactID)
); 

CREATE TABLE my_company_Projects (
  projectID INTEGER NOT NULL,
  name NVARCHAR(255),
  description NVARCHAR(255),
  employees_employeeProjectID INTEGER,
  PRIMARY KEY(projectID)
); 

CREATE TABLE my_company_EmployeeProjects (
  employeeProjectID INTEGER NOT NULL,
  employee_employeeID INTEGER,
  project_projectID INTEGER,
  startDate DATE,
  endDate DATE,
  PRIMARY KEY(employeeProjectID)
); 

CREATE VIEW EmployeeService_Employees AS SELECT
  Employees_0.employeeID,
  Employees_0.firstName,
  Employees_0.lastName,
  Employees_0.dateOfBirth,
  Employees_0.department_departmentID,
  Employees_0.position_positionID,
  Employees_0.address_addressID,
  Employees_0.salary_salaryID,
  Employees_0.contactDetails_contactID,
  Employees_0.projects_employeeProjectID
FROM my_company_Employees AS Employees_0; 

CREATE VIEW EmployeeService_Departments AS SELECT
  Departments_0.departmentID,
  Departments_0.name,
  Departments_0.description
FROM my_company_Departments AS Departments_0; 

CREATE VIEW EmployeeService_Positions AS SELECT
  Positions_0.positionID,
  Positions_0.title,
  Positions_0.description
FROM my_company_Positions AS Positions_0; 

CREATE VIEW EmployeeService_Addresses AS SELECT
  Addresses_0.addressID,
  Addresses_0.street,
  Addresses_0.city,
  Addresses_0.state,
  Addresses_0.postalCode,
  Addresses_0.country
FROM my_company_Addresses AS Addresses_0; 

CREATE VIEW EmployeeService_Salaries AS SELECT
  Salaries_0.salaryID,
  Salaries_0.employee_employeeID,
  Salaries_0.amount,
  Salaries_0.currency,
  Salaries_0.startDate,
  Salaries_0.endDate
FROM my_company_Salaries AS Salaries_0; 

CREATE VIEW EmployeeService_ContactDetails AS SELECT
  ContactDetails_0.contactID,
  ContactDetails_0.employee_employeeID,
  ContactDetails_0.email,
  ContactDetails_0.phone
FROM my_company_ContactDetails AS ContactDetails_0; 

CREATE VIEW EmployeeService_Projects AS SELECT
  Projects_0.projectID,
  Projects_0.name,
  Projects_0.description,
  Projects_0.employees_employeeProjectID
FROM my_company_Projects AS Projects_0; 

CREATE VIEW EmployeeService_EmployeeProjects AS SELECT
  EmployeeProjects_0.employeeProjectID,
  EmployeeProjects_0.employee_employeeID,
  EmployeeProjects_0.project_projectID,
  EmployeeProjects_0.startDate,
  EmployeeProjects_0.endDate
FROM my_company_EmployeeProjects AS EmployeeProjects_0; 

