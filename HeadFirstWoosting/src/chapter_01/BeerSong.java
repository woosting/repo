package chapter_01;
public class BeerSong {
	public static void main(String[] args) {
		singBeerSong(3);
	}

	public static void singBeerSong(int numberOfBottles) {
		int beerNum = numberOfBottles;
		String word = "bottles";
		
		while (beerNum > 0) {
			if (beerNum == 1) {
				word = "bottle"; // singular, as in ONE bottle.
			}
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			beerNum = beerNum - 1;
			if (beerNum > 0) {
				
				if (beerNum == 1) {										// Plural fix - START
					word = "bottle"; // singular, as in ONE bottle.		// Plural fix
				} 														// Plural fix - END
				
				System.out.println(beerNum + " " + word
						+ " of beer on the wall");
			} else {
				System.out.println("No more bottles of beer on the wall");
			}
		}
	}
}