package chapter_01;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBeerSong {

	@Test
	public void testEmptyWallOfBeer() {
		StringBuilder songBuilder = new StringBuilder();
		BeerSong.singBeerSong(songBuilder, 0);
		
		String expectedSong =
				"No more bottles of beer on the wall\n";
		assertEquals(expectedSong, songBuilder.toString());
	}

	/**
	 * Test that a negative amount of beers also means that the wall is empty.
	 * This choice was made because this was the easiest implementation.
	 * Normally I would test that an exception is thrown on these types of
	 * input, because it probably means that something is wrong (it is not
	 * logical to request a song about a negative number of bottles).
	 */
	@Test
	public void testWallWithNegativeBeers() {
		StringBuilder songBuilder = new StringBuilder();
		BeerSong.singBeerSong(songBuilder, -1);
		
		String expectedSong =
				"No more bottles of beer on the wall\n";
		assertEquals(expectedSong, songBuilder.toString());
	}
}
