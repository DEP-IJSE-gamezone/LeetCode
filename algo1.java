import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

void main(){
//check two sum
    int[] result;
    int[] nums = {2,7,11,15};
    final var SCANNER = new Scanner(System.in);
    do{
        System.out.printf("Enter value to search ");
        int target=SCANNER.nextInt();
        result=twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }while (true);
}

int[] twoSum(int[] nums, int target){
    int[] result=new int[2];
    for (int i = 0; i < nums.length; i++) {
        for (int j = i+1; j < nums.length ; j++) {
            if(nums[i]+nums[j] == target){
                result[0]=i;
                result[1]=j;
                return result;
            }
        }
    }
    return null;
}