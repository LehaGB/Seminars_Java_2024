package seminar_1;

public class Palindrom {
    public static void main(String[] args) {
        String str1 = "   А рОза, УпаЛа На, лАпУ аЗОрА       ";
        boolean trueFalse = isPalindrom(str1);
        System.out.println(trueFalse);
    }

    public static boolean isPalindrom(String str) {
        str = str.replace(" ", "").replace(",", "").trim().toLowerCase();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            int size = charArray.length;
            if (str.charAt(i) != str.charAt(size - i - 1)) {
                System.out.println("Это не палиндром");
                return false;
            }
        }
        System.out.println("Это палиндром");
        return true;
    }
}
