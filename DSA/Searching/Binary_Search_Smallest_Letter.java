package DSA.Searching;

public class Binary_Search_Smallest_Letter {
    public static void main(String[] args) {
        // Example following concept same as ceiling of a number
        // Q: Find Smallest Letter Greater Than Target

        char[] letters = {'a','e','g','i','k','o','r','z'};
        char target = 'f';
        System.out.println(smallestLetter(letters, target));
    }

    static int smallestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == letters[mid]){
                return mid;
            }
            else if(target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
    }
    // return start;
    return letters[start % letters.length];
}
}
