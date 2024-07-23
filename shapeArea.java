public class shapeArea {
    public static int area(int a){
        int area = a * a + (a-1) * (a-1);
        return area;
    }
    public static void main(String[] args) {
        int result = area(2);
        System.out.println(result);
    }
}
