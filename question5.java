package Assessment1;

import java.util.*;

public class question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		String[] names=new String[n+1];
		for (int i=0;i<n+1;i++)
		{
			names[i]=sc.nextLine();
		}
		Arrays.sort(names);
		for(int i=0;i<n+1;i++)
		{
			System.out.println(names[i]);
		}

	}

}
