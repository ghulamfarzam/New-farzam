package tek.dragons.week.ten.day_one;

public class Book {

	// Encapsulated Book
	// ID - numbers
	// name

	private long id;
	private String name;

	public Book(String name) {
		// generate Random ID and assign name from parameter.
		this.id = (long) (Math.random() * 10000);
		this.name = name;
	}

	public Book(long id, String name) {
		this.id = id;
		this.name = name;
	}
	// Setter is not returning anything.
	// getters do not get parameters.

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
