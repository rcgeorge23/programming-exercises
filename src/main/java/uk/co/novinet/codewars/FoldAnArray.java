package uk.co.novinet.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FoldAnArray {
/*
	Fold 1-times:
	[1,2,3,4,5] -> [6,6,3]
	
	A little visualization (NOT for the algorithm but for the idea of folding):
	
	 Step 1         Step 2        Step 3       Step 4       Step5
	                     5/           5|         5\          
	                    4/            4|          4\      
	1 2 3 4 5      1 2 3/         1 2 3|       1 2 3\       6 6 3
	----*----      ----*          ----*        ----*        ----*
	
	
	Fold 2-times:
	[1,2,3,4,5] -> [9,6]	
 */
	
	public static int[] foldArray(int[] array, int runs) {
		List<Integer> numbers = Arrays.stream(array).mapToObj(integer -> (int) integer).collect(Collectors.toList());
		float midIndex = (float) (numbers.size()) / 2;
		List<Integer> firstHalf = numbers.subList(0, (int) Math.ceil(midIndex));
		List<Integer> secondHalf = numbers.subList((int) Math.ceil(midIndex), numbers.size());
		Collections.reverse(secondHalf);
		List<Integer> result = new ArrayList<Integer>();
		
		for (int i = 0; i < firstHalf.size(); i++) {
			Integer secondHalfNumber = i < secondHalf.size() ? secondHalf.get(i) : 0; 
			result.add(firstHalf.get(i) + secondHalfNumber);
		}
		
		int[] resultArray = result.stream().mapToInt(i -> i).toArray();
		
		if (runs == 1) {
			return resultArray;
		} else {
			return foldArray(resultArray, runs - 1);
		}
	}
}
