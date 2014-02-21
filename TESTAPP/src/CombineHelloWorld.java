public class CombineHelloWorld {
	public static void main(String[] args) {
		
		contact.setName("John Doe");
	    System.out.println(PrintHello.main() + ", " + PrintWorld.main() + "! " + contact.getName());
		
        SetterTest contact = new SetterTest();              
		System.out.println(PrintHello.main() + ", " + PrintWorld.main() + "! " + contact.getName());
       
		
		SetterTest contact2 = new SetterTest("blaat");   
		System.out.println(PrintHello.main() + ", " + PrintWorld.main() + "! " + contact2.getName());
	

        
	}
}
