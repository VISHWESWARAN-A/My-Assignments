package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {22,3981,-19,82,0,45,37,};
		int x=nums.length;
		Arrays.sort(nums);
		System.out.println("minimum no is " +nums[0]);
		System.out.println("maximum no is " +nums[x-1]);
		

	}

}
