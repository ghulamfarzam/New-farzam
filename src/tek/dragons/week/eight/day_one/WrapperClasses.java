package tek.dragons.week.eight.day_one;

public class WrapperClasses {
	/* There are 8 primitive data type. byte, short, int, long, float, double, boolean, char
	 * Wrapper classes are built on top of primitive data types. 
	 * byte --> Byte
	 * short --> Short
	 * int --> integer 
	 * long --> Long
	 * float --> Float
	 * double --> Double
	 * char --> Character
	 * boolean --> Boolean 
	 * 
	 * Primitive data type are stored on Stack memory 
	 * Wrapper class all the values are stored on heap memory because they need more memory. 
	 */

		
			int a = 1990; 
			String name = "Mohammad";
			int value = Integer.parseInt("100");
			Integer number = 100; 
			
			public void doAdding(String first, String second) {
				double firstParsed = Double.parseDouble(first);
				double secondParsed = Double.parseDouble(second);
				double result = firstParsed + secondParsed;
				System.out.println(result);
			}
			public static void main(String[] args) {
				Polymorphism obj = new Polymorphism();
				obj.doAdding(100.2, 22.1);
			}
			
		}

