package video_Rental_Inventory_System;

import java.util.Scanner;

public class Videolauncher {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		VideoStore videostore = new VideoStore();
		int choice=0;
		do
		{
			System.out.println("MAIN MENU\n=========" +
			"\n1.Add Videos" +
			"\n2.Check Out Video" +
			"\n3.Return Video" +
			"\n4.Receive Rating" +
			"\n5.List Inventory" +
			"\n6.Exit");
			System.out.print("Enter your choice (1..6):");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			   case 1: System.out.print("Enter the name of the video you want to add: ");
			   		   videostore.addVideo(sc.nextLine());
			   		   break;
			   case 2: System.out.print("Enter the name of the video you want to check out: ");
	   		   		   videostore.doCheckout(sc.nextLine());
	   		   		   break;
			   case 3: System.out.print("Enter the name of the video you want to return: ");
		   		   	   videostore.doReturn(sc.nextLine());
		   		   	   break;
			   case 4: System.out.print("Enter the name of the video you want to rate: ");
			   		   String name = sc.nextLine();
			   		   System.out.print("Enter the rating for this video: ");
			   		   int rating = sc.nextInt();
			   		   videostore.receiveRating(name, rating);
			   		   break;
			   case 5: videostore.listInventory();
			           break;
			   case 6: System.out.println("Exiting...!! Thanks for using the application.");
			           break;
			   default: System.out.println("Enter valid choice...!!!");
			}
		}while(choice<6);
		sc.close();
		
	}
	
}
