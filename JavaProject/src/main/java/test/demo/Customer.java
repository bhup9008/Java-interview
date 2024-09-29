package test.demo;

public class Customer {

    private int id;
    private String name;
    private String lastName;
    private String dept;
    private Double salary;

    public Customer(int id, String name, String lastName, String dept, Double salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dept = dept;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

   /* @Override
    public int compareTo(Object o) {
        Customer c1=(Customer) o;
        Customer c2=(Customer) o;
        return c1.id-c2.id;
    }*/
}
