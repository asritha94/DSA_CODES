package Basics_DSA;
import java.util.HashMap;
import java.util.Map;

public class PairDifference {

	public static void main(String[] args) {
		int arr[]= {2,4,11,15,17};
		int k=7;
		Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
        	    int num=arr[i];
        	    if(map.containsKey(num-k)) {
        	    	      System.out.println("pair found");
        	    	      System.out.println("Index: "+map.get(num-k)+" "+i);
        	    	      System.out.println("Values: "+(num-k)+" "+num);
        	    	      return;
        	    }
        	    if(map.containsKey(num+k)) {
        	    	     System.out.println("pair found");
        	    	     System.out.println("index: "+map.get(num+k)+" "+i);
        	    	     System.out.println("Values: "+(num+k)+" "+num);
                 return;
        	    }
        	    map.put(arr[i],i);
        }
		System.out.println("No pair found");
	}

}
