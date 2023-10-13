package edu.seminars.oop.comment;

public class EmployeeServiceBad {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceBad() {
        this.employeeRepository = new EmployeeRepository();
    }

    public void fillEntityAndSaveToDb() {
        // Мы парсим данные и формируем энтити
        String fullName = "Иванов Иван Иванович";
        int ageInYears = 34;
        String position = "Должность";
        String organizationId = "8365aa15-27b1-4319-9c19-092adbf2ec6a";

        Employee employee = new Employee(fullName, ageInYears, position, organizationId);

        // Сохраняем энтити в БД
        System.out.println("Здесь был код" + employee);
    }
}
