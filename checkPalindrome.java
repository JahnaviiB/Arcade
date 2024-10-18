public class checkPalindrome {
    public static boolean IsPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){

        String input = "aabaa";
        Boolean result = IsPalindrome(input);
        System.out.println(result);
    }
}
