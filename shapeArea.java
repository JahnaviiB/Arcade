public class shapeArea {
    public static int areas(int a){
        int area = a * a + (a-1) * (a-1);
        return area;
    }
    public static void main(String[] args) {
        int result = areas(2);
        System.out.println(result);
    }
}
