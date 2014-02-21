public class SetterTest {
    private String name;

    public SetterTest() {
        this.setName("Jane Doe");
    }

    public SetterTest(String name) {
        this.setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
