package video_Rental_Inventory_System;

public class Video {

	 private String videoName;
	 boolean checkout;
	 int rating;
	 
	 public Video(String name) 
	 {
		 this.videoName = name;
	 }
	 
	 public String getName() 
	 {
		 return this.videoName;
	 }
	 public void doCheckout()
	 {
		 this.checkout = true;
	 }
	 public void doReturn()
	 {
		 this.checkout = false;
	 }
	 public void receiveRating(int rating)
	 {
		 this.rating = rating;
	 }
	 public int getRating()
	 {
		 return this.rating;
	 }
	 public boolean getCheckoutStatus() 
	 {
		 return this.checkout;
	 }

}
