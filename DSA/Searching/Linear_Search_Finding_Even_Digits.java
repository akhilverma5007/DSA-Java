package DSA.Searching;
public class Linear_Search_Finding_Even_Digits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        findEvenNumberDigits(nums);
        // findEvenNumberDigits2(nums);

    }

    static void findEvenNumberDigits(int[] nums) {
        for (int index = 0; index < nums.length; index++) {
            int num = nums[index];
            int digitCount = countDigits(num);

            if (digitCount % 2 == 0) {
                System.out.println(num + " has an even number of digits.");
            }
        }
    }

    static int countDigits(int num) {
        if (num == 0) return 1; // Special case for num = 0
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }


     // Simplest way
    // static void findEvenNumberDigits2(int[] nums){
    //     for (int index = 0; index < nums.length; index++) {
    //         // System.out.println(nums[index]);
    //         String numStr = String.valueOf(nums[index]);
    //         // System.out.println(numStr.length());

    //         if(numStr.length() % 2 == 0){
    //             System.out.println(numStr);
    //         }
    //     }
    // }

}


  