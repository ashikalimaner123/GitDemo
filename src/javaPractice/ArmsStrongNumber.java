package javaPractice;

public class ArmsStrongNumber {

	public static void main(String[] args) {
		//123
		
		int n=153,temp,count=0;
		int n1=n,temp1=n,sum=0;
		
           while(n>0)
           {
        	  count++; 
        	  n=n/10;
           }
           System.out.println(count);
           
           
           
           while(n1>0)
           {
        	   temp=n1%10;
        	   
        	   sum=(int) (sum+Math.pow(temp, count));
        	   n1=n1/10;
        	   
           }
           
           
           System.out.println(sum);
	}

}
