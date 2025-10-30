package assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentScores {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Step 1: Read the size of the array
	        int n = sc.nextInt();
	        int[] scores = new int[n];

	        // Step 2: Read array elements
	        for (int i = 0; i < n; i++) {
	            scores[i] = sc.nextInt();
	        }

	        // Step 3: Convert array to ArrayList
	        ArrayList<Integer> scoreList = new ArrayList<Integer>();
	        for (int score : scores) {
	            scoreList.add(score);
	        }

	        // Step 4: Display elements
	        System.out.println("Elements in the ArrayList:");
	        for (Integer s : scoreList) {
	            System.out.println(s);
	        }

	        sc.close();
	    }
}
