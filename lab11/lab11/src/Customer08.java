public class Customer08 {
    private int id;
    private Fullname08 name;
    private String tel;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Fullname08 getName() { return name; }
    public void setName(Fullname08 name) { this.name = name; }

    public String getTel() { return tel; }
    public void setTel(String tel) { this.tel = tel; }

    public void display() {
        System.out.print(id + " ");
        name.display();
        System.out.println(" " + tel);
    }
}