package reviews;

public class Review {

	// Instance variables
	private long id;
	private String title;
	private String imageUrl;
	private String reviewCategory;
	private String content;
	private String date;
	private String synopsis;
	private String rating;
	private String runtime;
	private String director;
	private String videoClip;

	// Constructor
	public Review(long id, String title, String synopsis, String rating, String runtime, String reviewCategory,
			String date, String content, String director, String imageUrl, String videoClip) {
		this.id = id;
		this.title = title;
		this.synopsis = synopsis;
		this.rating = rating;
		this.runtime = runtime;
		this.reviewCategory = reviewCategory;
		this.date = date;
		this.content = content;
		this.director = director;
		this.imageUrl = imageUrl;
		this.videoClip = videoClip;
	}

	// Getters
	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	public String getSynopsis() {
		return synopsis;
	}	
	
	public String getRating() {
		return rating;
	}

	public String getRuntime() {
		return runtime;
	}	
	
	public String getReviewCategory() {
	return reviewCategory;
	}
	
	public String getDate() {
		return date;
	}	
	
	public String getContent() {
		return content;
	}	
	
	public String getDirector() {
		return director;
	}	
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public String getVideoClip() {
		return videoClip;
	}
	// public String toString() {
	// return "Id: "+ id + "Title: " + title;
	// }

}