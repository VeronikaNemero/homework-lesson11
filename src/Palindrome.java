public class Palindrome {

    public static void palindrome(String string, int number) {
        String[] words = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder(words[number - 1]);
        StringBuilder builder = stringBuilder.reverse();

        if(words.length < number) {
            System.out.println("Wrong input. Try again!");
            System.exit(505);
        }

        if (stringBuilder.equals(builder)) {
            System.out.println(stringBuilder);
        } else {
            System.out.println("This word isn't palindrome.");
        }
    }
}
