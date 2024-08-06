import java.util.ArrayList;
import java.util.List;

public class alllongestStrings {
    public static List<String> longest(String[] inputarray) {
        List<String> result = new ArrayList<String>();
        int maxlength = 0;
        for(String str : inputarray) {
            if (str.length() > maxlength) {
                maxlength = str.length();
            }
        }
        for(String str : inputarray){
            if(str.length() == maxlength){
                result.add(str);
            }
        }
        return result;
    }
    public static void main(String[] args){
        String[] inputarray = {"aba", "aa", "ad", "vcd", "aba"};
        List<String> result = longest(inputarray);
        System.out.println(result);
    }
}
