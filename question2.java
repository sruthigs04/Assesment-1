package Assessment1;

import java.util.*;

public class question2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();		
		int profit=0,sum=0;
		for(int i=0;i<n;i++)
		{
			sum=arr[i];
			for(int j=i+1;j<n;j++)
			{
				sum+=arr[j];
				if (sum>profit)
					profit=sum;
			}
		}
		System.out.println(profit);
	}

}
