package javaPractice;

import org.omg.Messaging.SyncScopeHelper;

public class StrongNumber {

	public static void main(String[] args) {
		int k = 153, count = 0;
		int temp = k;
		int sum=0;

		while (temp > 0) {
			count++;
			temp = temp / 10;
		}
		System.out.println(count);
		
		
		
		while(k>0)
		{
			temp=k%10;
			sum=(int)(sum+Math.pow(temp, count));
			k=k/10;
		}
		System.out.println(sum);
		
		

	}

}
