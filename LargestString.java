public class LargestString {
    public static void main(String[] args) {
        String[] s = { "apple", "banana", "carrot" };

        String large = s[0];
        for (int i = 1; i < s.length; i++) {
            if (large.compareTo(s[i]) < 0) {
                large = s[i];
            }
        }
        System.out.println(large);

    }
}
