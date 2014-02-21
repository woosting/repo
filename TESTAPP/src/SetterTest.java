public class SetterTest
{
    private String name;

    public SetterTest() {
    	this.name = "John Doe"; 
    }
 
    public SetterTest(String Name) {
    	this.name = Name; 
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