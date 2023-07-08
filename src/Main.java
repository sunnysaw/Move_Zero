import java.util.Scanner;
public class Main {
    public static int[] moveZeros(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 0; j < nums.length - 1 - i; j++){
                if(nums[j] <= 0){
                    int swap = nums[j + 1];
                    nums[j+1] = nums[j];
                    nums[j] = swap;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = {0, 1, 0, 3, 12};
        int[] tnum = moveZeros(num);
        for(int i = 0; i < num.length ; i++) {
            System.out.print(" " + tnum[i]);
        }
        }
    }
