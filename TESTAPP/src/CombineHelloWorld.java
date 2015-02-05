public class CombineHelloWorld {
	public static void main(String[] args) {
	
		Person contact1 = new Person();  
		contact1.setName("Johan van Berkel");
	    		
        Person contact2 = new Person();              
		       
		Person contact3 = new Person("blaat");   
			
		System.out.println(PrintHello.main() + ", " + PrintWorld.main() + "! " + contact1.getName());
		System.out.println(PrintHello.main() + ", " + PrintWorld.main() + "! " + contact2.getName());
		System.out.println(PrintHello.main() + ", " + PrintWorld.main() + "! " + contact3.getName());
        
	}
}