package tek.dragons.week.eight.day_three;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ThrowsInExceptions {
	//throws ==> it used to pass the exception to method signature and any other class using the method, have to handle it. 
	//throw
	
	
	public static void readFile() throws FileNotFoundException, ArithmeticException{
		String fileDirectory = "c/myfolder/mytex.txt";
		File file = new File(fileDirectory);
		InputStream inputStream = new FileInputStream(file);
		
	}
	public static void main(String[] args) {
		try {
			readFile();
		}catch(FileNotFoundException exception) {
			System.out.println("There is no file in that directory");
			//Useful methods available in exception family
			//we can use multiple throws. 
			
			System.out.println(exception.getMessage());
			System.out.println(exception.getCause());
			exception.printStackTrace();
		}catch(ArithmeticException exception) {
			System.out.println("Arithmetic exception happened");
		}
	}


}
