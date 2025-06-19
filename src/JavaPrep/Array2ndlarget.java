package JavaPrep;

public class Array2ndlarget {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		
		int largest =  Integer.MIN_VALUE;		
		int secondLargest= Integer.MIN_VALUE;
		
		for(int num:arr) {
			if(num>largest) {
				secondLargest=largest;
				largest=num;
			} else if(num>secondLargest && num!=largest) {
				secondLargest=num;
			}
		}
		
		if(secondLargest!=Integer.MIN_VALUE) {
			System.out.println("2nd largest num is-->"+secondLargest);
		}
		else {
			System.out.println("2nd largest num is-->"+secondLargest);
		}
		
		
	}

}
