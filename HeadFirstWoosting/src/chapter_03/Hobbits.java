package chapter_03;
public class Hobbits {
	String name;
	public static void main(String [] args) {
		Hobbits [] h = new Hobbits[3];
		int z = 0;
//		while (z < 4 ) {			//REMOVED for FIX1
		while (z < 3 ) {			//ADDED   for FIX1
//			z = z + 1;				//REMOVED for FIX1
			h[z] = new Hobbits();
			h[z].name = "bilbo";
			
			if (z == 1) {
				h[z].name = "frodo";
			}
			if (z == 2) {
				h[z].name = "sam";
			}
			System.out.print(h[z].name + " is a ");
			System.out.println("good Hobbit name");
			z = z + 1;				//ADDED   for FIX1
		}
	}
}
