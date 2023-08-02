class Employee {
    private String name;

    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Employee: " + name;
    }
}

class MonthlyPaid extends Employee {
    private int salary = 30000;

    public String toString() {
        return super.getName() + " - Salary: " + salary;
    }
}

class HourlyPaid extends Employee {
    private int hourlyRate;

    public HourlyPaid(int rate) {
        hourlyRate = rate;
    }

    public String toString() {
        return super.getName() + " - Hourly Rate: " + hourlyRate;
    }
}

public class Puripongclass12_3 {
    public static void main(String[] args) {
        Employee m1 = new MonthlyPaid();
        Employee m2 = new HourlyPaid(50);
        m1.setName("Pornchai");
        m2.setName("Siriporn");
        System.out.println(m1);
        System.out.println(m2);
    }
}
