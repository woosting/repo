package chapter_01;
public class BeerSong {
	public static void main(String[] args) {
		StringBuilder songBuilder = new StringBuilder();
		singBeerSong(songBuilder, 5);
		System.out.println(songBuilder);
	}

	public static void singBeerSong(StringBuilder songBuilder, int numberOfBottles) {
		int beerNum = numberOfBottles;
		String word = "bottles";
		
		while (beerNum > 0) {
			if (beerNum == 1) {
				word = "bottle"; // singular, as in ONE bottle.
			}
			songBuilder.append(beerNum + " " + word + " of beer on the wall.\n");
			songBuilder.append(beerNum + " " + word + " of beer.\n");
			songBuilder.append("Take one down.\n");
			songBuilder.append("Pass it around.\n");
			beerNum = beerNum - 1;
			if (beerNum > 0) {
				
				if (beerNum == 1) {										// Plural fix - START
					word = "bottle"; // singular, as in ONE bottle.		// Plural fix
				} 														// Plural fix - END
				
				songBuilder.append(beerNum + " " + word
						+ " of beer on the wall!\n");
			}
		}
		songBuilder.append("No more bottles of beer on the wall!\n");
		if (beerNum < 0) {
			int OwedBeerNum = Math.abs(beerNum);
			if (OwedBeerNum == 1) {
				word = "bottle"; // singular, as in ONE bottle.
			}
			songBuilder.append("B.t.w. you owe me " + OwedBeerNum + " " + word + " to put on the wall...\n");
		}
	}
}