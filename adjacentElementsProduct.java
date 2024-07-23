public class adjacentElementsProduct {

    public static int maxproduct(int[] a){
        int max_product = Integer.MIN_VALUE;
        for(int i=0;i< a.length - 1; i++){
            int product = a[i]*a[i+1];
            if(product >= max_product){
                max_product = product;
            }
        }
        return max_product;
    }
    public static void main(String[] args) {
        int input[] = {3, 6, -2, -5, 7, 3};
        int result = maxproduct(input);
        System.out.println(result);
    }
}
