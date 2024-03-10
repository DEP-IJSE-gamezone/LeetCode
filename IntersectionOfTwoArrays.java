import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        IntersectionOfTwoArrays ob=new IntersectionOfTwoArrays();
       int[] nums11 = {1, 2, 2, 1};
        int[] nums22 = {2, 2};
        System.out.println(Arrays.toString( ob.intersection(nums11,nums22)));

        int[] nums1 = {4,5,9};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString( ob.intersection(nums1,nums2)));

        int[] nums13 = {4,0,9};
        int[] nums23 = {0,0};
        System.out.println(Arrays.toString( ob.intersection(nums13,nums23)));


    }

     int[] intersection(int[] nums1, int[] nums2) {
        int length = nums1.length < nums2.length ? nums1.length : nums2.length;
        int[] nums = new int[length];
        int index = 0;
        boolean isExist, isDuplicate;
        outer:
        for (int i = 0; i < nums1.length; i++) {
            isExist = false;
            inner:
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    index++;
                    isExist = true;
                    break inner;
                }
            }
            // add element to identical array
            if (isExist) {
                for (int j = 0; j < index; j++) {
                    if (nums1[i] == nums[j] && nums[j]!=0) {
                        index--;
                        continue outer;
                    }
                }
                nums[index - 1] = nums1[i];
            }
        }
        //get the return array
        int numsCopy[] = new int[index];
        for (int i = 0; i < index; i++) {
            numsCopy[i] = nums[i];
        }
        return numsCopy;
    }
}
