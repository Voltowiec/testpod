import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Objects;

public class Employee {

    String name;
    int age;
    int salary;


    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                salary == employee.salary &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Jan Kowalski", 32,2345);
        Employee e2 = new Employee("Ewa Adamska", 17,2300);
        Employee e3 = new Employee("Jan Kowalski", 32,2345);

        Manager m1 = new Manager("Jan Kowalski", 32,2345,600);

        for (int i = 0; i <100_000 ; i++) {
            if (!e1.equals(e3)) {
                System.out.println("Coś jest nie tak!!!");
            }
        }

        if (e1.equals(m1)) {
            System.out.println("Ta sama osoba!!!");
        }
        else {
            System.out.println("Różne osoby");
        }
    }

}

class Manager extends Employee {


    int bonus;

    public Manager(String name, int age, int salary, int bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return age == manager.age &&
                salary == manager.salary &&
                bonus == manager.bonus &&
                Objects.equals(name, manager.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), bonus);
    }


}
