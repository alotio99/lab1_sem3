public class Palindrome {
    static boolean runpalindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char l = str.charAt(left);
            char r = str.charAt(right);
            // Если левый символ пробел пропускаем его
            if (!Character.isLetterOrDigit(l)) {
                left++;
            }
            else if (!Character.isLetterOrDigit(r)) {
                right--;
            }
            // если оба символа нормальные, то сравниваем их
            else {
                if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
