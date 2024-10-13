public class employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName () {
        return firstName + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void SetSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary() {
        return salary * 12;
    }
    public int raiSeSalary(int percentage) {
        this.salary +=this.salary*percentage/100;
        return this.salary;


    }
    @Override
    public String toString() {
        return "employee [id=" + id + ", Name=" + firstName + " " + lastName + ", Salary="+salary+"]";


    }


}
