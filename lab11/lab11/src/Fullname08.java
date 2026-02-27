public class Fullname08 {
    private String firstname;
    private String lastname;

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public void display() {
        System.out.print(firstname + " " + lastname);
    }
}