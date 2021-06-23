package edu.cnm.deepdive;

/*
Given an array of ints, return true if every element is a 1 or a 4.

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
 */

public class CodingBatOnlyThe14 {

  private static int[] one = {1, 4, 1, 4};
  private static int[] two = {1, 4, 2, 4};
  private static int[] three = {1, 1};

  public static void main(String[] args) {
    System.out.println("Given the array [1, 4, 1, 4], the result will be " + only14(one) + "." );
    System.out.println("Given the array [1, 4, 2, 4], the result will be " + only14(two) + "." );
    System.out.println("Given the array [1, 1], the result will be " + only14(three) + "." );
  }

  public static boolean only14(int[] nums) {

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 1 && nums[i] != 4) {
        return false;
      }
    }
    return true;
  }

}
