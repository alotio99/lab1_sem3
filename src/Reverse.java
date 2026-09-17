public class Reverse {
    static void reverse(String str) {
        StringBuilder reverse_str = new StringBuilder();
        int dlina = str.length();
        for (int i = dlina - 2; i >= 1; i--) {
            reverse_str.append(str.charAt(i));
        }
        System.out.println(reverse_str);
    }
}
