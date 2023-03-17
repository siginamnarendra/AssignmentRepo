package marketNetwork;
import java.util.Scanner;
public class UserInterface {

	static int ui=1,option;
	static void UserInterfaceM()
	{
		int looping=0;
		do
		{
			System.out.println("                          Welcome to the **True'Market pvt Ltd**");
			System.out.println();
			System.out.println();
			System.out.println("  1)Member Registration ");
			System.out.println("  2)Member Purchase ");
			System.out.println("  3)Display the Members at each level");
			System.out.println("  4)Display Commission");
			System.out.println();
			System.out.print(" Please select any of the options (1, 2, 3, 4) which ever you want to proceed  ");
		
			option=sc.nextInt();

			switch(option)
			{
				 case 1:
				 System.out.println("Enter your Name");
				 String name=sc.next();
				 System.out.println("Enter your ParentID");
				 long ParentID=sc.nextLong();

				 NewMember user = new NewMember(name, ParentID);
				 user.parentAddress = NewMember.FindParent(NewMember.root, ParentID);
				 System.out.println("parent is: "+user.parentAddress.name);
				 if(user.parentAddress==null)
				 {
					 System.out.println("The parent does not exist.");
				 }
				 else
				 {
					user.parentAddress.ChildrenList.add(user);
					Commission.addCommision(user.parentAddress, 100000.0);
				 }	 
				 System.out.println("Your Account got created. Your Id is: "+(user.UserID)+"  All the Best!");
				 System.out.println();
					break;

				 case 2:
				 System.out.println("Enter User ID: ");
				long userid = sc.nextLong();
				NewMember p = NewMember.FindParent(NewMember.root, userid);
				Purchase.purchaseDisplay(p.parentAddress);	

					break;

				case 3:
				NewMember.printing(NewMember.root);
				break;

				case 4:
				System.out.println("Enter userId to find commission");
				userid = sc.nextInt();
				System.out.println(NewMember.FindParent(NewMember.root, userid).Commission);
				break;

				default:
					looping=1;
					System.out.println("Please enter valid ID(1 or 2 or 3) ");
					break;
			}
		}while(looping==1);
		if(option!=2)
		{
			System.out.println("Please enter '1' for Main menu and '0' for exit");
			ui=sc.nextInt();
		}

	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		while(ui==1||ui==2)
		{
			if(ui==1)
			{
				UserInterfaceM();
			}
			else
			{
				System.out.println("Enter User ID: ");
				long userid = sc.nextLong();
				NewMember p = NewMember.FindParent(NewMember.root, userid);
				Purchase.purchaseDisplay(p.parentAddress);
			}
		}
		System.out.println("You are logged Out");
	}
}