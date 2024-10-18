public class commonCharacterCount {
        public static int CharCount(String s1, String s2){
            int[] c1 = new int[26];
            int[] c2 = new int[26];

            for(char c: s1.toCharArray()){
                c1[c - 'a']++;
            }
            for(char c: s2.toCharArray()){
                c2[c - 'a']++;
            }

            int count = 0;
            for(int i=0; i<26; i++){
                count += Math.min(c1[i],c2[i]);
            }
            return count;
        }

    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "adcaa";
        int result = CharCount(s1,s2);
        System.out.println(result);
    }
}
