package Basics_DSA;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int arr[]= {2,4,11,15,17};
		int target=6;
		Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
        	    int comp=target-arr[i];
        	    if(map.containsKey(comp)) {
        	    	      System.out.println("index :"+map.get(comp)+" "+i);
        	    	      return;
        	    }
        	    map.put(arr[i],i);
        }
	}

}
