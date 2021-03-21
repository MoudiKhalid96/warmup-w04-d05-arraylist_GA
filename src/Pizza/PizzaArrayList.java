package Pizza;

import java.util.*;

public class PizzaArrayList {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> ingredients = new ArrayList();
		
		String choice = "choice";
		while(!choice.toLowerCase().equals("done")){
			System.out.print("Write ingredients it to add to your pizza OR write \"done\" to checkout your order :");
			choice = input.next();
			
			if(!choice.toLowerCase().equals("done"))
				ingredients.add(choice);
			else
				break;
		}//end while loop
		
		System.out.println("\t\tType y or n to confirm");
		System.out.println("\t\tingredients of pizza " + ingredients);
		System.out.print("\t\tright? ");
		char answere = input.next().charAt(0);
		
		boolean isAgree = isAgree(answere);
		
		if(isAgree) {
			System.out.println("Have a nice day, your pizza will finish soon");
		}else {
			System.out.println("Sorry for that");
			while(isAgree == false) {
				choice = "choice";
				ingredients.clear();
				while(!choice.toLowerCase().equals("done")){
					System.out.print("Write ingredients it to add to your pizza OR write \"done\" to checkout your order :");
					choice = input.next();
					
					if(!choice.toLowerCase().equals("done"))
						ingredients.add(choice);
					else
						break;
				}//end while loop
				
				System.out.println("\t\tType y or n to confirm");
				System.out.println("\t\tingredients of pizza " + ingredients);
				System.out.print("\t\tright? ");
				answere = input.next().charAt(0);
				
				isAgree = isAgree(answere);
				
				if(isAgree) 
					System.out.println("Have a nice day, your pizza will finish soon");
			}
			
		}
		
		
	}//end of main method
	
	public static boolean isAgree(char choice) {
		
		if(choice == 'y' || choice == 'Y')
			return true;
		
		return false;
	}
	
}

