package tek.dragons.week.ten.day_one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookTester {

	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();
		Book book1 = new Book("Harry Potter 1");
		bookList.add(book1);
		
		Book book2 = new Book("Harry Potter 2");
		bookList.add(book2);
		
		Book book3 = new Book(112233, "Harry Potter 3");
		bookList.add(book3);
		
		Book bood4 = new Book("Speaking Skills");
		bookList.add(bood4);
		
		//to sort a list of POJO Objects we have to use Comparators. 
		//Lambda Function for sorting 
		
		bookList.sort(Comparator.comparing(Book::getId).reversed());
		
		for(Book bookObj : bookList) {
			System.out.println("ID: " + bookObj.getId() + " name: " + bookObj.getName());
			System.out.println();
		}
		
		

	}

}
