package Pizza;

import java.util.*;

public class PizzaArrayList {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> ingredients = new ArrayList();
		
		String choice = "choice";
		while(!choice.equals("done")){
			System.out.print("Write ingredients to add to your pizza OR write \"done\" to checkout your order :");
			choice = input.next();
			
			if(!choice.equals("done"))
				ingredients.add(choice);
			else
				break;
		}//end while loop
		
		System.out.println("This your ingredients to your pizza " + ingredients);
		
		
	}//end of main method
	
	public static boolean isAgree(char choice) {
		
		if(choice == 'y')
			return true;
		
		return false;
	}
	
}

