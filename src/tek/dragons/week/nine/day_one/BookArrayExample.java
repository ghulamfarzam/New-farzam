package tek.dragons.week.nine.day_one;
import java.util.ArrayList; 

public class BookArrayExample {

	public static void main(String[] args) {
		//Create an Array of Book
		
		ArrayList<Book> books = new ArrayList<>();
		
		Book book1 = new Book("Horry Potter 1");
		books.add(book1);
		
		Book book2 = new Book("Horry Potter 2");
		books.add(book2);
		
		
		System.out.println(books.size());
		
		for(int i = 0; i < books.size(); i++) {
			Book returnObj = books.get(i);
			System.out.println(returnObj.getBookName());
		}
	}

}
