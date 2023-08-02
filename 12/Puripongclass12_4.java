class Employee {
    private String name;

    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }
}

class MonthlyPaid_1 extends Employee {
    private int salary = 30000;

    public int getSalary() {
        return salary;
    }
}

class HourlyPaid_1 extends Employee {
    private int hourlyRate;

    public HourlyPaid_1(int rate) {
        hourlyRate = rate;
    }

    public int calculatePayment(int hoursWorked) {
        return hourlyRate * hoursWorked;
    }
}

public class Puripongclass12_4 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[8];

        employees[0] = new MonthlyPaid_1();
        employees[1] = new MonthlyPaid_1();
        employees[2] = new MonthlyPaid_1();
        employees[3] = new MonthlyPaid_1();

        employees[4] = new HourlyPaid_1(16);
        employees[5] = new HourlyPaid_1(16);
        employees[6] = new HourlyPaid_1(32);

        employees[0].setName("John");
        employees[1].setName("Alice");
        employees[2].setName("Bob");
        employees[3].setName("Carol");
        employees[4].setName("David");
        employees[5].setName("Eve");
        employees[6].setName("Frank");

        for (Employee employee : employees) {
            if (employee instanceof MonthlyPaid_1) {
                MonthlyPaid_1 monthlyPaid = (MonthlyPaid_1) employee;
                System.out.println(monthlyPaid.getName() + " - Monthly Salary: " + monthlyPaid.getSalary());
            } else if (employee instanceof HourlyPaid_1) {
                HourlyPaid_1 hourlyPaid = (HourlyPaid_1) employee;
                int hoursWorked = 16; // default value for hourly employees
                if (employee.getName().equals("David") || employee.getName().equals("Eve")) {
                    hoursWorked = 32; // David and Eve worked 32 hours
                }
                int payment = hourlyPaid.calculatePayment(hoursWorked);
                System.out.println(hourlyPaid.getName() + " - Hourly Payment: " + payment);
            }
        }
    }
}
