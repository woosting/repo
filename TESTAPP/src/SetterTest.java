public class SetterTest
{
    private String name;

    public void main(String[] args) {
        this.setName("John Doe");
        System.out.println(this.getName());
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}