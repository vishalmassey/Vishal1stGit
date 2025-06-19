package JavaPrep;

public class FindNumisPelindrome {

	public static void main(String[] args) {
		int num = 121;
		int rem= 0;
		int sum=0;
		int t;
		t=num;
		while(num>0) {
			rem= num%10;//2
			sum=(sum*10)+rem;//1
			num=num/10;//12
			
		}System.out.println(sum);
		if(t==sum) {
			System.out.println("is a pelindrome num");
		}else {
			System.out.println("is not a pelindrome num");
		}

	}

}
