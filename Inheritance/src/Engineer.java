import java.time.LocalDate;

public class Engineer extends Person {
    private double salary;

    public Engineer() {

    }

    public Engineer(double salary) {
        this.salary = salary;
    }

    public Engineer(String firstName, String lastName, double weight, LocalDate birthDate, double salary) {
        super(firstName, lastName, weight, birthDate);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        if (salary == 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public double raise(double rate) {
        this.salary = this.salary + (this.salary * rate / 100);
        return this.salary;
    }
}
