package javaPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Shivam
 *
 */
public class Streams extends Exception {
	
	public Streams()
	{
		super("Exception");
	}
	public static void main(String[] args) throws Streams, ClassNotFoundException, SQLException, IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        List<Integer> values=Arrays.asList(5,5,5,5,3,4,5,90);
		
        List<Integer> values2=Arrays.asList(5,5,5,5,3,4,5,90);
        
        Collections.reverse(values);
		System.out.println(values.stream().filter(i->i%5==0).reduce(0,Integer::sum));
		
		//System.out.println(values.stream().findFirst().map(i->i*2).ifPresent(values->(values.get(0))));
		values.forEach(System.out::println);
		
		String a="10";;;
		
		long k=10;
		
		double t=100;
		
		char g='A';
		int h=g;
		//System.err.println(h);
		
		
		Integer o=10;
		
		float s;
		
		/*String new1="Welcome";
		String new2=new String("Welcome");
		System.out.println(new1.hashCode());
		System.out.println("Before k"+new2.hashCode());
		String i=new2.intern();
		System.out.println(i.hashCode());*/
		
		System.out.println("-------------------String--------------------------");
		String value="asHikbli Neha";
		String value2="ashika";
		
		System.out.println("hello"+value.compareTo(value2));
		System.out.println(value.substring(1));
		
		char [] arr=new char[12];
		arr=value.toCharArray();
		for(int i=0;i<value.length()-1;i++)
		{
			if(arr[i]!=' ')
			if(arr[i]<91)
			{
				arr[i]=(char) ((char)arr[i]+32);
			}else
			{
				arr[i]=(char) ((char)arr[i]-32);
			}
		}
		char[] brr=new char[12];
	    System.arraycopy(arr, 0, brr, 0, 12);
		String df=new String(brr);
		System.out.println(df);
		String value3=value.concat(value2);
		System.out.println(value3);
		
		System.out.println(value3.contains(value2));
		System.out.println(value3.equals(value2));
		
		System.out.println(String.join("-", value,value2));
		
		
		
		
		
		String value4="Hi I m in punenu";
		
		
	System.out.println(value4.split("\\s",2)[1]);
		
		
		System.out.println(value.replace("Neha", "Ashikali"));
		System.out.println(value);
		//hi();
		
		ArrayList<String> arrlist=new ArrayList<>();
		arrlist.add("ashik");
		arrlist.add("maner");
		arrlist.add("tg");
		
		ArrayList<String> arrlist2=new ArrayList<>();
		arrlist2.add("ashik");
		arrlist2.add("maner");
		arrlist2.add("t2");
		
		System.out.println(arrlist.get(0));
		
		System.out.println(arrlist.contains("ashik"));
		
//		System.out.println(arrlist.removeIf(arr5->arr5.length()==2 && arr5.equals("tg")));
//		arrlist.forEach(System.out::println);
		System.out.println(arrlist.retainAll(arrlist2));
		
		
		Iterator<String> itr=arrlist2.iterator();
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		ListIterator<String> itrlist=arrlist2.listIterator();		
		while(itrlist.hasNext())
		{
			System.out.println(itrlist.next());
		}
		
		arrlist.get(0).contains("");
		
		
		System.out.println("----------------------------------------");
		
		arrlist.stream().map(arr2->arr2.contains("ashik")).forEach(System.out::println);
		
		
		
		LinkedList<String> list=new LinkedList<>();		
		
		list.add("aaa");
		list.add("bbb");
		
		
		//list.get(0);
		//list.remove("bbbb");
		
		list.hashCode();
		
		
		
		HashSet<String> hash=new HashSet<>();
		System.out.println("----------------------------------------------------------------------");
		hash.add("1234");
		System.out.println(hash.add(null));
				
				
		LinkedHashSet<String> link=new LinkedHashSet<>();
		
		TreeSet<String> set=new TreeSet<>();
		
		//System.out.println(set.add(null));
		System.out.println("----------------------------------------------------------------------");
		
		HashMap<String,String> map=new HashMap<>();
		
		map.put("1","ashik");
		map.put("2", "maner");
		
		Set<Entry<String, String>> mm=	map.entrySet();
		
		mm.stream().map(m->m.getKey().replace("1","3")).forEach(System.out::println);
		
		map.values().stream().forEach(System.out::println);
		
		System.out.println(map.replace("2", "Champion"));
		
		
		map.values().stream().forEach(System.out::println);
		
		
		Hashtable<String,String> hashTable=new Hashtable<>();
		
		hashTable.put("1","Neha");
		hashTable.put("2","Love");
		hashTable.put("3","Ashik");
		
		System.out.println(hashTable.containsKey("1"));
		
		
//	Set<Entry<String,String>>gg=hashTable.entrySet();
//		
//		
//	Class.forName("oracle.jdbc.driver.OracleDriver");
//	
//	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","System");
//	
//	Statement st=con.createStatement();
//	
//	ResultSet rst=st.executeQuery("Select * from Emp");
//	
//	while(rst.next())
//	{
//		System.out.println(rst.getInt(0)+""+rst.getString(2));
//	}
//		
//		PreparedStatement stm=con.prepareStatement("insert into emp values(?,?)");
//		
//		
//		stm.setString(0, "Ashikali");
//		
//		stm.setString(1, "Neha");
//		
//		
//		stm.executeUpdate();
		
		
		LocalDate dte=LocalDate.now();
		System.out.println(dte.plusDays(1));
		System.out.println(dte.plusDays(2));
						
		
System.out.println(ZoneId.getAvailableZoneIds());
				
		System.out.println(LocalDate.now(ZoneId.of("Africa/Nairobi")));	
		
		
		
		File file=new File("C:\\Users\\Shivam\\Desktop\\Hi.txt");
		
		
		BufferedReader br=new BufferedReader(new FileReader(file));
		String str;
		while((str=br.readLine())!=null)
{
	System.out.println(str);
}
		
		
		
		Scanner sc=new Scanner(new File("C:\\Users\\Shivam\\Desktop\\Hi.txt"));
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		
	Reflections reflection=new Reflections();
	
		
		
	Class classes=reflection.getClass();
		
	
	Method[] arrr=classes.getDeclaredMethods();
	
		for(Method rt:arrr)
		{
			rt.setAccessible(true);			
			if(rt.getName().equals("setName"))
			{
				classes.getDeclaredMethod(rt.getName(),String.class);

				rt.invoke(reflection, "Ashikali");
			}
			else
				if(rt.getName().equals("getName"))
				{
					System.out.println(rt.invoke(reflection));
				}
			
			
			
		}
		
		
		
		for(Field fie:classes.getDeclaredFields())
		{
			fie.setAccessible(true);
			System.out.println(fie.getName());
		}
		
		Float.parseFloat("0.0");
		
		int i=10;
		long k1=i;
		
		int go=(int)k1;
		System.out.println(go);
		
		double v=0.0;
		
		int j=(int)v;
		
		
		char er='A';
		
		
		
		int iq=(int)er;
		System.out.println(iq);
		
		String value12="k";
		
		boolean value13=Boolean.parseBoolean(value12);
		
		System.out.println(value13);
		
		
		
		
		
		
		
	}
	
	public static void hi() throws Streams
	{
		int i=1/0;
		throw new Streams();
	}
	

}
