public class Employee08 {
    private int id;
    private Fullname08 name;
    private double salary;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Fullname08 getName() { return name; }
    public void setName(Fullname08 name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public void display() {
        System.out.print(id + " ");
        name.display();
        System.out.println(" " + salary);
    }
}