public class CombineHelloWorld {
	public static void main(String[] args) {
		System.out.println(PrintHello.main() + ", " + PrintWorld.main() + "!");
		
		SetterTest x = new SetterTest();
		System.out.println(x.getName());
		
		SetterTest y = new SetterTest("Henk");
		System.out.println(y.getName());
		
		y.setName("Oh nee toch piet");
		System.out.println(y.getName());
	}
}