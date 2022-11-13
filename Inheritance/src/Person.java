import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private double weight;
    private LocalDate birthDate;

    public Person() {

    }

    public Person(String firstName, String lastName, double weight, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void eating(double increment) {
        this.weight = this.weight + increment;
    }

    public void running(double decrement) {
        this.weight = this.weight - decrement;
    }


}
