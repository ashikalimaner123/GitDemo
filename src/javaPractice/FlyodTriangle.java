package javaPractice;

public class FlyodTriangle {
	static int k=0;
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print(k+1);
				System.out.print(" ");
				k++;
			}
			System.out.print("\n");
		}
	}

}
