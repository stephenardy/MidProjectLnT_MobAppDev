package Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Integer Choose = 0;
		
		
		do {
			System.out.println("1. Input Menu");
			System.out.println("2. View Menu");
			System.out.print(">>");
			
			try {
				Choose = input.nextInt();
			}catch (Exception e) {
				Choose = -1;
			} input.nextLine();
			
			
			if (Choose == 1) {
				new Input();
				input.nextLine();
			} else if (Choose == 2) {
				new View();
				input.nextLine();
			} else {
				System.out.println("Invalid choose");
			}						

		} while (Choose != 2);
	}

}
