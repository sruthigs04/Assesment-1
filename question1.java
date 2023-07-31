package Assessment1; 

import java.util.*;

public class question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=0;
		System.out.println("Enter a starting distance (between 5 km and 8 km");
		start = sc.nextInt(); 
		while(start<5 || start>8) {
			System.out.println("Sorry, Choose between 5 km and 8 km");
			System.out.println("Enter a starting distance (between 5 km and 8 km");
			start = sc.nextInt(); 
		}
		if(start>=5 && start<=8)
		for(int i=start;i>0;i--) {
			System.out.println("Distance to run : "+i);
			if (i==start-1)
				System.out.println("Good start, keep it up!");
			if (i==2)
				System.out.println("Almost there!");
		}
		System.out.println("Done for the day!");					
	}

}
