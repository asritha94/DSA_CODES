package Basics_DSA;
import java.util.Scanner;
public class BinarySearch {
	
	public static int binary(int a[],int k) {
		
		int f=0;
		int l=a.length-1;
		while(f<=l) {
	    int mid=(f+l)/2;
	    if(a[mid]==k) {
	    	    return mid;
	    }
	    else if(a[mid]<k) {
	    	    f=mid+1;
	    }
	    else {
	    	    l=mid-1;
	    }
		}
	    
	    return -1;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the sorted array elements: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Key Element: ");
		int k=sc.nextInt();
		int r=binary(a,k);
		if(r == -1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element "+k+" found at the index position: "+r);
		}
		sc.close();
		
	}

}
