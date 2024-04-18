package DSA.Searching;
import java.util.Arrays;
public class Linear_Search_Searching_In_String {

    public static void main(String[] args) {
 
        String[] str_array = {"one", "two", "three", "four", "five", "six"};
        String target = "three";
        String name = "Akhil Verma";

        int solution = searchInStrings(str_array, target);
        System.out.println(solution);
        System.out.println(Arrays.toString(name.toCharArray()));
        boolean sol = searchInStrings_character(name, 'k');
        System.out.println(sol);
        }
    
    static int searchInStrings(String[] str, String target){
        if(str.length == 0){
            return -1;
        }
        for(int i = 0; i < str.length; i++){
            String element = str[i];
            if(element.contains(target)){
                return i;
            }
        }
        return -1;
    }

    static boolean searchInStrings_character(String name, char target){
        if(name.length() == 0){
            return false;
        }
       for(char ch : name.toCharArray()){
        if(target == ch){
            return true;
        }
    }
    
    return false;
    
}
}