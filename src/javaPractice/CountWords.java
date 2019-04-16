package javaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountWords {

	public static void main(String[] args) {
		String str="This This is is done by Saket Saket";
		String[] strarr=str.split(" ");
		HashMap<String,Integer> hashmap=new HashMap<>();
		
		for(int i=0;i<strarr.length-1;i++)
		{
			if(hashmap.containsKey(strarr[i]))
			{
				int count=hashmap.get(strarr[i]);
				hashmap.put(strarr[i], count+1);	
			}
			else
			{
				hashmap.put(strarr[i], 1);
			}
		}
		
		System.out.println(hashmap);
		
		
		 Set<Entry<String, Integer>> thr =hashmap.entrySet();
		 hashmap.values();
		
		for(Map.Entry<String,Integer> t:thr)
		{
			System.out.println(t.getKey()+" "+t.getValue());
		}

	}

}
