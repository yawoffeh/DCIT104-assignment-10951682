//I certify that I yaw offeh dansoh did this work.
//Student-Id: 10951682
import java.util.*;

class Solution {
    static boolean isValid(int num){
        for (int j=2; j<num; j++){
            if (num%j == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int sum = 0;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the range of prime numbers you want: \n");
        int range = cin.nextInt();
        for (int i = 1; i<range; i++){
            boolean prime = isValid(i);
            if (prime){
                sum += i;
            }
        }
        System.out.println("The sum of the primenums within the range 0--" + range + " is " + sum);
    }
}
