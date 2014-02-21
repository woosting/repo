public class SetterTest {
    private String name;

    public SetterTest() {
        this.name = "Jane Doe";
    }

    public SetterTest(String name_inp) {
        this.name = name_inp;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
