public class almostincreasingSequence{
    public static boolean CanIncrease(int[] sequence) {
        return canBeIncreasing(sequence);
    }
    private static boolean canBeIncreasing(int[] sequence) {
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] >= sequence[i + 1]) {
                if (isStrictlyIncreasing(removeElement(sequence, i))) {
                    return true;
                }
                if (isStrictlyIncreasing(removeElement(sequence, i + 1))) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
    private static int[] removeElement(int[] arr, int index) {
        int[] result = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                result[j++] = arr[i];
            }
        }
        return result;
    }
    private static boolean isStrictlyIncreasing(int[] seq) {
        for (int i = 0; i < seq.length - 1; i++) {
            if (seq[i] >= seq[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] sequence = {1, 3, 2, 1};
        System.out.println(CanIncrease(sequence));
    }
}
