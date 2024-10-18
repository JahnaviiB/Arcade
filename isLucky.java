public class isLucky {
    public static boolean isLucky(int n) {
        String n1 = Integer.toString(n);
        int l = n1.length();

        if(l%2 == 0){
            return false;
        }

        int f_sum = 0;
        int s_sum = 0;
        int half_sum = l/2;

        for(int i=0; i<half_sum; i++){
            f_sum = f_sum + n1.charAt(i);
        }

        for (int j=half_sum;j<l;j++){
            s_sum = s_sum + n1.charAt(j);
        }

        return f_sum == s_sum;
    }
    public static void main(String[] args) {
        boolean result = isLucky(1234);
        System.out.println(isLucky(1230));
        System.out.println(result);
    }
}
