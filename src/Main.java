public class Main{
    public static void main(String[] args) {
        String text = "6 / 5 - 2 * 9";

        if (hasDigitsWithoutPlusSign(text)) {
            System.out.println("В тексте есть цифры, за которыми не стоит знак '+'");
        } else {
            System.out.println("В тексте нет цифр без знака '+'");
        }
    }

    public static boolean hasDigitsWithoutPlusSign(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                if (i < text.length() - 1 && text.charAt(i + 1) != '+') {
                    return true;
                }
            }
        }
        return false;
    }
}