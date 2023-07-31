package Assessment1;

import java.util.*;

public class question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		int sum=0,jsum=0,check=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			jsum=0;
			for(int j=i+1;j<n;j++)
			{
				jsum+=arr[j];
			}
			if (sum==jsum) {
				System.out.println("true");
				check+=1;
				break;
			}
		}
		if(check==0)
		System.out.println("false");
		
	}

}
