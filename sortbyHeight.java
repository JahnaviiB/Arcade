import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortbyHeight {
    public static int[] sortbyHeight(int[] a){
        List<Integer> heights = new ArrayList<>();
        for(int h:a){
            if(h != -1){
                heights.add(h);
            }
        }
        Collections.sort(heights);

        int index = 0;
        int[] result = new int[a.length];

        for(int i=0;i<a.length;i++){
            if(a[i] == -1){
                result[i] = -1;
            }
            else{
                result[i] = heights.get(index);
                index++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = {-1, 150, 190, 170, -1, -1, 160, 180};
        int[] sorted_array = sortbyHeight(arr);

        for(int j : sorted_array){
            System.out.println(j);
        }
    }
}
