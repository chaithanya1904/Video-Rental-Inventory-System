package video_Rental_Inventory_System;

import java.util.ArrayList;

public class VideoStore {
	
	private ArrayList<Video> store = new ArrayList<>();
	
	public void addVideo(String name)
	{
		store.add(new Video(name));
		System.out.println("Video "+name+" added successfully.");
	}
	
	public void doCheckout(String name) 
	{
		if(store.size()==0) {
			System.out.println("Store is Empty!!!");
			return;
		}
		boolean checkout = false;
		for(Video video : store) {
			if(!video.getCheckoutStatus() &&  video.getName().equals(name)) {
				checkout=true;
				video.doCheckout();
				System.out.println("Video "+name+" checked out successfully.");
			}
		}
		if(!checkout) {
			System.out.println("Video is Unavailable");
		}
	}
	
	public void doReturn(String name)
	{
		for(Video video : store) {
			if(video.getName().equals(name)) {
				video.doReturn();
				System.out.println("Video "+name+" returned successfully");
			}
		}
	}
	
	public void receiveRating(String name, int rating)
	{
		if(store.size()==0) {
			System.out.println("Store is Empty!!!");
			return;
		}
		for(Video video : store) {
			if(video.getName().equals(name)) {
				video.receiveRating(rating);
				System.out.println("Raitng "+rating+" has been mapped to the Video "+name);
			}
		}
	}
	
	public void listInventory()
	{
		if(store.size()==0) {
			System.out.println("Store is Empty!!!");
			return;
		}
		System.out.println("---------------------------------------------------------------------------");
		System.out.printf("\t%-20s\t|\t%-10s\t|\t%-15s\n","Video Name","Checkout Status","Rating");
		System.out.println("---------------------------------------------------------------------------");
		for(Video video : store)
		{
			System.out.printf("\t%-20s\t|\t%-10s\t|\t%-15s\n",video.getName(),video.getCheckoutStatus(),video.getRating());
		}
		System.out.println("---------------------------------------------------------------------------");
	}
	
}
