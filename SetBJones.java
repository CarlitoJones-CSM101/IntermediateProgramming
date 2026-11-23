package jones;
import java.util.ArrayList;
import java.util.Scanner;
public class SetBJones {
	public static void main(String[] args) {
		 Scanner jonesinput = new Scanner(System.in);
		// 1. Accept 6 product names and their corresponding stock quantities
	    // 2. Display all products with their quantities
		// 3. Identify the product with the highest stock 
		// 4. Identify the product with the lowest stock.
		// 5. Search for a product and display its corresponding quantity.
		//6 Count how many products are running low( stock quantity of 5 or below.)
		// 7. REmove a product and its corresponding stock quantity from both Array Lists
		// 8. Display the updated inventory
		
		// First Array List
		ArrayList<String> JonesProduct = new ArrayList<>();
		JonesProduct.add("Keyboard");
		JonesProduct.add("Mouse");
		JonesProduct.add("Monitor");
		JonesProduct.add("Printer");
		JonesProduct.add("Headset");
		JonesProduct.add("Webcam");
		
		//Second Array List
		ArrayList<Integer> JonesQuantity = new ArrayList<>();
		JonesQuantity.add(15);
		JonesQuantity.add(6);
		JonesQuantity.add(3);
		JonesQuantity.add(20);
		JonesQuantity.add(9);
		JonesQuantity.add(6);
		// Products
        System.out.println("Products  \t" + "Quantity");
		for (int i = 0; i< JonesProduct.size(); i++) {
				
				for (int j = 0; j< JonesQuantity.size(); j++) {
					
					}
				System.out.println( JonesProduct.get(i)+ "   \t" +JonesQuantity.get(i));
				
			}

	    // highest and lowest
	     int jonesmax = JonesQuantity.get(0);
	     int jonesmin = JonesQuantity.get(0);

	     for (int i = 0; i < JonesQuantity.size(); i++) {
	            if (JonesQuantity.get(i) > jonesmax) {
	                jonesmax = JonesQuantity.get(i);
	                
	            }

	            if (JonesQuantity.get(i) < jonesmin) {
	                jonesmin = JonesQuantity.get(i);
	            }
	        
	        }
	     //Printing for the highest and lowest
	    
	     
	     
	     System.out.println("Highest Stock: "+  + jonesmax);
	     System.out.println("Lowest Stock:" + jonesmin);
        // Search Product
        System.out.println("Search:");
        String jonessearch = jonesinput.nextLine();
        int jonesstock = 0;

        for (int jonesstocck = 0; jonesstock < JonesQuantity.size(); jonesstock++) {
            if (JonesQuantity.get(jonesstock) == jonesstock) {
                jonesstock = JonesQuantity.get(jonesstock);
            }
        }
       
       System.out.println("Search Product Result : " +(jonessearch +" " + jonesstock));
       
        
        System.out.print("Enter product to remove: ");
        
        // Remove a product and its corresponding stock quantity
        String jonesremove = jonesinput.nextLine();
        boolean jonesremoved =
                JonesProduct.remove(String.valueOf(jonesremove));
       
        /// Printing of the removed items
		int totalProducts = 5;
        if (jonesremoved) {
             for (int i = 0; i< JonesProduct.size(); i++) {
				
				for (int j = 0; j< JonesQuantity.size(); j++) {
					
				
					}
				
				System.out.println( JonesProduct.get(i)+ "   \t" +JonesQuantity.get(i));
		;
			}
             System.out.println("Total Products:" + totalProducts);
        } else {
            System.out.println("Product not found.");
        }

        }
         
        
	
}
