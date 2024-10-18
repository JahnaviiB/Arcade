import java.util.Arrays;
public class makeArrayconsecutive2 {
    public static int makeConsecutive(int[] statues) {
        if (statues == null || statues.length == 0) {
            return 0;
        }
        Arrays.sort(statues);
        int additional = 0;
        for (int i = 0; i < statues.length - 1; i++) {
            additional += (statues[i + 1] - statues[i] - 1);
        }
        return additional;
    }

    public static void main(String[] args) {
        int[] statues = {6, 2, 3, 8};
        System.out.println(makeConsecutive(statues));  // Output should be 3
    }
}