public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Employee\tSalary");
        for (Employee employee : employees) {
            System.out.printf("%-10s\t%,.2f\n", employee.getFullname(), employee.getSalary());
        }
    }
}