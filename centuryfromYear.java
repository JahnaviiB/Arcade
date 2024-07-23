public class centuryfromYear {
    public static int solution(int year){
        int century=  (year + 99) / 100;
        return century;
    }
    public static void main(String[] args){
        int result = solution(100);
        System.out.println(result);
    }
}