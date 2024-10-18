public class centuryfromYear {
    public static int centuryyear(int year){
        int century=  (year + 99) / 100;
        return century;
    }
    public static void main(String[] args){
        int result = centuryyear(100);
        System.out.println(result);
    }
}