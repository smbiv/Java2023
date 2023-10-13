package edu.seminars.oop.comment;

public class EmployeeServiceGood {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceGood() {
        this.employeeRepository = new EmployeeRepository();
    }

    public void fillEntityAndSaveToDb() {
        var employee = parseDataIntoEntity();
        saveEntityIntoDb(employee);
    }

    public Employee parseDataIntoEntity() {
        String fullName = "Иванов Иван Иванович";
        int ageInYears = 1994;
        String position = "Должность";
        String organizationId = "8365aa15-27b1-4319-9c19-092adbf2ec6a";

        return new Employee(fullName, ageInYears, position, organizationId);
    }

    private void saveEntityIntoDb(Employee employee) {
        System.out.println("Здесь был код" + employee);
    }


}
