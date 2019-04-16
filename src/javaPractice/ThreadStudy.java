package javaPractice;
public class ThreadStudy  {
	
	public void duniya()
	{
		System.out.println("Ye duniya ye mehefil mere kaam ke nahi mere kaam ke nahi");
	}
	
	

	public static void main(String[] args) {
		/*ThreadStudy threadStudy=new ThreadStudy();
		threadStudy.start();*/
		
		Runnable t1=()->
			{
			System.out.println("hi");
			};
			
			//new Thread(t1).start();
			
			Lamda t=()->{
				System.out.println("Are bhai lamda toh mast hai");
			};
			t.bhai();
		
	}
}


