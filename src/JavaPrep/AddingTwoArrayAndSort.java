package JavaPrep;

import java.util.Arrays;

public class AddingTwoArrayAndSort {
	public static void main(String[] args) {
	       int [] a= {1, 3, 5} ;
	       int [] b = {2, 4, 6};
   
	       int [] sort = new int[a.length+b.length];
	       
	       for(int i=0;i<a.length;i++){
	            sort[i]=a[i];
	       }
	       
	        for(int j=0;j<b.length;j++){
	           sort[a.length+j]= b[j];
	        }
	        
	        Arrays.sort(sort);
	        for(int num:sort){
	            System.out.print(num+" ");
	        }

	}
	

}
