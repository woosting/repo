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
}
