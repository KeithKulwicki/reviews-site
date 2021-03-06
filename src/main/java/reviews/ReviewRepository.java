package reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	// Creating review map
	Map<Long, Review> reviewMap = new HashMap<Long, Review>();

	// Constructor
	public ReviewRepository() {

		// Constructor
		Review review = new Review(1, "Saving Private Ryan (1998)",
				"In the Last Great Invasion of the Last Great War, The Greatest Danger for Eight Men was Saving... One.",
				"R", "2h 49min", "Drama, War", "24 July 1998 (USA)", "Tom Hanks, Matt Damon, Tom Sizemore",
				"Steven Spielberg", "/images/SavingPrivateRyan1998.jpg", "https://www.youtube.com/embed/zwhP5b4tD6g");

		reviewMap.put(review.getId(), review);

		Review review2 = new Review(2, "The LEGO Movie (2014)",
				"Everything is awesome! The story of a nobody who saved everybody", "PG", "1h 40min",
				" Animation, Action, Adventure, Comedy, Family, Fantasy", "7 February 2014 (USA)",
				"Chris Pratt, Will Ferrell, Elizabeth Banks", "Phil Lord, Christopher Miller",
				"/images/TheLegoMovie2014.jpg", "https://www.youtube.com/embed/fZ_JOBCLF-I");

		reviewMap.put(review2.getId(), review2);

		Review review3 = new Review(3, "Batman (1989)",
				"Only one will claim the night. The Dark Knight of Gotham City begins his war on crime with his first major enemy being the clownishly homicidal Joker.",
				"PG-13", "2h 6min", "Adventure, Action", "23 June 1989 (USA)",
				"Michael Keaton, Jack Nicholson, Kim Basinger", "Tim Burton", "/images/Batman1989.jpg",
				"https://www.youtube.com/embed/F07Mf1kxUKY");

		reviewMap.put(review3.getId(), review3);

		Review review4 = new Review(4, "Batman: The Movie (1966)",
				"The Dynamic Duo faces four supervillains planning to hold the world for ransom.", "Approved",
				"1h 45min", "Adventure, Comedy, Crime, Family, Fantasy", "30 July 1966 (USA)",
				"Adam West, Burt Ward, Lee Meriwether", "Leslie H. Martinson", "/images/BatmanTheMovie1966.jpg",
				"https://www.youtube.com/embed/vvY5MgOgDUw");

		reviewMap.put(review4.getId(), review4);

		Review review5 = new Review(5, "Mallrats (1995)",
				"They're not there to shop. They're not there to work. They're just...there.", "R", "1h 34min",
				"Comedy, Romance", "20 October 1995 (USA)", "Shannen Doherty, Jeremy London, Jason Lee", "Kevin Smith",
				"/images/mallrats.jpg", "https://www.youtube.com/embed/eOd5zJLsZEc");

		reviewMap.put(review5.getId(), review5);

		Review review6 = new Review(6, "This Is Spinal Tap (1984)",
				"Does for rock and roll what The Sound of Music did for hills", "R", "1h 22min", "Comedy, Music",
				"2 March 1984 (USA)", " Rob Reiner, Michael McKean, Christopher Guest", "Rob Reiner",
				"/images/spinaltap.jpg", "https://www.youtube.com/embed/N63XSUpe-0o");

		reviewMap.put(review6.getId(), review6);

		Review review7 = new Review(7, "PCU (1994)", "Flunk 'em if they can't take a joke", "PG-13", "1h 19min",
				"Comedy", "29 April 1994 (USA)", "Jeremy Piven, Chris Young, Megan Ward", "Hart Bochner",
				"/images/pcu.jpg", "https://www.youtube.com/embed/aIpuS8vTBts?list=PLZ6zFb8Kwj0as8gUOJ2J67AQrYKcgh1pU");

		reviewMap.put(review7.getId(), review7);

		Review review8 = new Review(8, "A Clockwork Orange (1971)",
				"Being the adventures of a young man ... who couldn't resist pretty girls ... or a bit of the old ultra-violence ... went to jail, was re-conditioned ... and came out a different young man ... or was he?",
				"R", "2h 16min", "genre", "2 February 1972 (USA)", "Malcolm McDowell, Patrick Magee, Michael Bates",
				"Stanley Kubrick", "/images/clockworkorange.jpg", "https://www.youtube.com/embed/vN-1Mup0UI0");

		reviewMap.put(review8.getId(), review8);

		Review review9 = new Review(9, "Reservoir Dogs (1992)",
				"Four perfect killers. One perfect crime. Now all they have to fear is each other.", "R", "1h 39min",
				"Crime, Drama", "21 January 1992 (USA) (Sundance Film Festival)",
				"Harvey Keitel, Tim Roth, Michael Madsen", "Quentin Tarantino", "/images/resdogs.jpg",
				"https://www.youtube.com/embed/vayksn4Y93A");

		reviewMap.put(review9.getId(), review9);

		Review review10 = new Review(10, "Goodfellas (1990)",
				"In a world that's powered by violence, on the streets where the violent have power, a new generation carries on an old tradition.",
				"R", "2h 26min", "Crime, Drama ", "21 September 1990 (USA)", "Robert De Niro, Ray Liotta, Joe Pesci",
				"Martin Scorsese", "/images/goodfellas.jpg", "https://www.youtube.com/embed/h3QpxNI-PtE");

		reviewMap.put(review10.getId(), review10);

		// Review review# = new Review(
		// #,
		// "name",
		// "tag",
		// "rating",
		// "runtime",
		// "genre",
		// "release",
		// "stars",
		// "director",
		// "/images/XXX",
		// "https://www.youtube.com/embed/XXX");
		//
		// reviewMap.put(review#.getId(), review#);

	}

	// Method find all values in review map
	public Collection<Review> findAll() {
		return reviewMap.values();
	}

	// Find one review in the map
	public Review findOne(Long id) {
		return reviewMap.get(id);
	}
}