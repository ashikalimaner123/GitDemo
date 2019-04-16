package javaPractice;

public class SingleTon {
	private static SingleTon singleTon=null;
	
	private SingleTon()
	{
		
	}
	
	public static SingleTon getSingleTonObject()
	{
		if(singleTon==null)
		{
			singleTon=new SingleTon();
		}
		
		return singleTon;
	}

	public static void main(String[] args) {
		SingleTon ton=SingleTon.getSingleTonObject();
		
		System.out.println(ton.hashCode());
		
		SingleTon ton2=SingleTon.getSingleTonObject();
		
		
		System.out.println(ton2.hashCode());
	}

}
