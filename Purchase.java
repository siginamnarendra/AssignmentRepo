package marketNetwork;

import java.util.Scanner;

public class Purchase {

	static Scanner sc = new Scanner(System.in);
	public static void purchaseDisplay(NewMember par) 
	{
			
			System.out.println();
			System.out.println("The available items are listed below: ");
			System.out.println();
			System.out.println("A. Washing Power     Cost: Rs.3,000/- ");
			System.out.println("B. Suppliments		 Cost: Rs.5,000/-");
			System.out.println("C. Protien capsules	 Cost: Rs.2,500/-");
			
			System.out.println();
			int qty, total;
			
			String p="Washing Power",q="Suppliments",r="Protien capsules";

			 System.out.println("Press ProductID(A/B/C) to Buy Items and 'Exit' to Exit to Main Menu");
				int looping=0;
				do
				{
					
					String option  = sc.next().toUpperCase();
					switch(option)
					{
						case "A":
						System.out.println();
						System.out.println("Enter the Quantity");
						qty = sc.nextInt();
						total = qty*3000;
						System.out.println();						
						System.out.println("you have purchased "+qty+" "+p+"'s with amount :"+total);
						Commission.addCommision(par,3000);
						System.out.println();
						break;

						case "B":
						System.out.println();
							System.out.println("Enter the Quantity");
							qty = sc.nextInt();
							total = qty*5000;
							System.out.println();
							System.out.println("you have purchased "+qty+" "+q+"'s with amount :"+total);
							Commission.addCommision(par,5000);
							System.out.println();
							break;

						case "C":
						System.out.println();
							System.out.println("Enter the Quantity");
							qty = sc.nextInt();
							total = qty*2500;
							System.out.println();
							System.out.println("you have purchased "+qty+" "+r+"'s with amount :"+total);
							Commission.addCommision(par,2500);
							System.out.println();
							break;

						default:
							looping=1;
							System.out.println();
							System.out.println("Please enter valid ID(A/B/C) ");
							System.out.println();
							break;
							
					}
				}while(looping==1);
				System.out.println("Enter '1' for Main menu or '2' for purchase menu and '0' for 'SignOut' for Purchase Menu");
				UserInterface.ui=sc.nextInt();
				System.out.println();
				System.out.println();
	}
}
