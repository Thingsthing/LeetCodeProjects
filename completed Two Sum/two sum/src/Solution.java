//Cho Cheung
//07/25/2022
//LeetCode Project
//Two Sum


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        //array for user numbers input
        int[] numsInput = new int[] {3,2,4};
        //target number
        int target = 20;
        //array to hold the two numbers that add up to target number
        int[] result = getTwoSum(numsInput, target);
        //display the two resulting numbers
        System.out.println(result[0] + " " + result[1]);
    }
    //takes the user input array and find the numbers that add up to the target number
    public static int[] getTwoSum(int[] nums, int target) {
        //creates hashmap for all the numbers in the numsInput array
        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        //loop thru the array
        for (int i = 0; i < nums.length; i++) {
            //see what number need to be found
            int targetNumber = target - nums[i];
            //compares the targetNumber with the hashmap to see if it's there
            if(visitedNumbers.containsKey(targetNumber)) {
                //if targetNumber is in hashmap then return array location and targetNumber
                return new int[] {i, visitedNumbers.get(targetNumber)};
            }
            visitedNumbers.put(nums[i], i);
        }
        throw new IllegalArgumentException("no matches found");
    }
}
