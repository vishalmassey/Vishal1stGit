package JavaPrep;

public class FindDuplicateInInArrays {

	public static void main(String[] args) {
		 int s[] ={1,2,3,2,3,4,4,5};
		 
		 for(int i=0;i<s.length;i++) {
			
			 for(int j=i+1;j<s.length;j++) {
				 if(s[i]==s[j]) {
					 
					 System.out.println("Duplicate is :>"+s[i]);		 
					
					 
				 }
			 }
			 
		 }

	}

}
