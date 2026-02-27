public class Test08 {
    public static void main(String[] args) {
        Employee08 e1 = new Employee08();
        Customer08 c1 = new Customer08();
        Fullname08 f1 = new Fullname08();
        Fullname08 f2 = new Fullname08();

        f1.setFirstname("Jane");
        f1.setLastname("Smith");

        f2.setFirstname("Robert");
        f2.setLastname("Peterson");

        e1.setId(111);
        e1.setName(f2);
        e1.setSalary(20000);

        c1.setId(101);
        c1.setName(f1);
        c1.setTel("0879208767");

        c1.display();
        e1.display();
    }
}