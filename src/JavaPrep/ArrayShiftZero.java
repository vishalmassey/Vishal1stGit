package JavaPrep;

import java.util.Arrays;

public class ArrayShiftZero {

	public static void main(String[] args) {
		System.out.println("*******************Move All Zero Towords Right Side********************");
		int[] arr= {1,2,0,3,5,0,4,6};
		int len=arr.length;
		
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(arr[i]!=0 && arr[j]==0) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println("*******************Move All Zero Towords Left Side********************");
		
		int[] arr1= {1,2,0,3,5,0,4,6};
		int len1=arr1.length;
	
		for(int i=0;i<len1;i++) {
			for(int j=0;j<len1;j++) {
				if(arr1[i]==0 && arr1[j]!=0) {
					int temp = arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
	
	
	
	
	}

}
