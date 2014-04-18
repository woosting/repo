package chapter_01;
public class BeerSong {
	public static void main(String[] args) {
	}

	public static void singBeerSong(StringBuilder songBuilder, int numberOfBottles) {
		if (numberOfBottles > 0) {
			songBuilder.append("1 bottle of beer on the wall\n");
			songBuilder.append("1 bottle of beer.\n");
			songBuilder.append("Take one down.\n");
			songBuilder.append("Pass it around.\n");
		}
		songBuilder.append("No more bottles of beer on the wall\n");
	}
}