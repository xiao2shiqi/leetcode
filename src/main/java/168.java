/**
 * LC#168
 */
public class Solution168 {

    public static String convertToTitle(int n) {
        if (n <= 0) return "";
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            sb.append((char) (n % 26 + 'A'));
            n =n / 26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("convertToTitle > " + convertToTitle(72));

        System.out.println((char) (19 + 'A'));
    }
}
