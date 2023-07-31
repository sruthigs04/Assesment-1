package Assessment1;

import java.util.*;

public class question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		ArrayList<Integer> arr = new ArrayList<Integer> ();
		int n=0,j=0;
		n=sc.nextInt();
		int arr[] = new int[n];
		for (int i=0; i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count=1,maxx=0,current=0,max_index=0;
		for(int i=0;i<n;i++)
		{
			for(j=current+1;j<current+arr[current]+1;j++)
			{
//			System.out.println("j: "+j);
				if (arr[j]>=maxx) 
				{
					maxx=arr[j];	
					max_index=j;
				}
				
			}			
		current=max_index;
//		System.out.println(current+" "+maxx+" "+max_index);
		count+=1;
		if ((arr[max_index]+max_index)>=n-1)	
			break;
		}
		System.out.println(count);

	}

}
