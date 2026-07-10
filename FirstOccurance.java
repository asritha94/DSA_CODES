package Basics_DSA;

public class FirstOccurance {

	public static void main(String[] args) {
		int a[]= {2,3,3,5,6,6};
		int low=0;
		int high=a.length-1;
		
		int target=3;
		int result=-1;
		while(low<=high) {
		 int mid=(low+high)/2;
		if(target==a[mid]) {
			result=mid;
			high=mid-1;
		 }
		else if(target<a[mid]) {
			high=mid-1;
		 }
		else {
			low=mid+1;
		   }
		}
		System.out.println("First Occurance:"+result);
	}

}
