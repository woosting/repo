public class CombineHelloWorld {
	public static void main(String[] args) {
        SetterTest contact = new SetterTest();
		System.out.println(PrintHello.main() + ", " + PrintWorld.main() + "! " + contact.getName());
        contact.setName("John Doe");
        System.out.println(PrintHello.main() + ", " + PrintWorld.main() + "! " + contact.getName());
	}
}
