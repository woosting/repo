public class Person {
    private String name;

    public Person() {
        this.setName("John Doe");
    }

    public Person(String name) {
        this.setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
