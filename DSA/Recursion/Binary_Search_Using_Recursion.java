package DSA.Recursion;

public class Binary_Search_Using_Recursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        int target = 5; 
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int start, int end){
        if (start > end) {
            return -1;
        }
        int medium = start + (end - start) / 2;
        if (arr[medium] == target) {
            return medium;
        }
        if (target < arr[medium]) {
            return search(arr, target, start, medium - 1);
        }
        return search(arr, target, medium + 1, end);
    }
}
