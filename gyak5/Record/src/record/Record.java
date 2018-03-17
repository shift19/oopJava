package record;

public class Record {
	private String author;
	private String title;
	private double duration;

	public Record(String author, String title, double duration) {
		this.author = author;
		this.title = title;
		this.duration = duration;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getDetails() {
		return author + ": " + title + ", " + duration + " min";
	}

	public int isLonger(Record r) {
		if (duration > r.getDuration()) {
			return 1;
		} else if (duration < r.getDuration()) {
			return -1;
		} else {
			return 0;
		}
	}

	public boolean sameAuthor(String s) {
		return author.equalsIgnoreCase(s);
	}

}
