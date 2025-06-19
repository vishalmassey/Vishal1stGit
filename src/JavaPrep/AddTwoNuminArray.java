package JavaPrep;

import java.util.HashSet;

public class AddTwoNuminArray {
	
	public static void main(String[] args) {
		
		//int i[] = {3,9,3,4,-7,6,3,2};

		int[] i = {2, 7, 11, 15, 10, 30, 40, 20, 25, 35, 43, 48};
        int target = 40;
        HashSet<Integer> seen = new HashSet<>();

        for (int num : i) {
            int complement = target - num;

            if (seen.contains(complement)) {
                System.out.println("Pair found: " + num + " + " + complement + " = " + target);
            }

            seen.add(num); // Important to update the seen numbers
        }
        
    }
}