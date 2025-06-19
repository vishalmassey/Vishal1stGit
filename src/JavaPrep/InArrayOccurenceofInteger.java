package JavaPrep;

public class InArrayOccurenceofInteger {

	public static void main(String[] args) {
		  int[] arr = { 2, 1, 3, 2, 4,2, 1, 2, 5};
		  
		  int count1=0;
		  int count2=0;
		  
		  for(int num:arr) {
			  if(num==1) {
				  count1++;
			  }else if (num==2) {
				  count2++;
			  }
		  }
		  
		  System.out.println("1 is comming --->"+count1);
		  System.out.println("2 is comming --->"+count2);

	}

}
