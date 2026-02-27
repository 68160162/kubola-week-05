public class Test07 {
    public static void main(String[] args) {
        Employee07 e1 = new Employee07();
        Customer07 c1 = new Customer07();
        Fullname07 f1 = new Fullname07();
        Fullname07 f2 = new Fullname07();

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

        System.out.println(
                c1.getId() + " " +
                        c1.getName().getFirstname() + " " +
                        c1.getName().getLastname() + " " +
                        c1.getTel()
        );

        System.out.println(
                e1.getId() + " " +
                        e1.getName().getFirstname() + " " +
                        e1.getName().getLastname() + " " +
                        e1.getSalary()
        );
    }
}