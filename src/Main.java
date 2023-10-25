import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print(recursionStar(10, 10));
    }

    static int add(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int sum = 0;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            sum = sum + nums[start] + nums[end];
            start++;
            end--;
        }
        if ((nums.length) % 2 == 0) {
            return sum;
        } else {
            return sum - nums[mid];
        }
    }

    static String recursionStar(int m, int n) {
        if (n < 1){
            return "";
        }
        else{
            for (int i = n; i > 0; i--) {
                System.out.print("*");
            }
        }
        System.out.println();
        return recursionStar(m, n - 1);
    }
}