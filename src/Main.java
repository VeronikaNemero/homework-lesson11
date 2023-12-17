public class Main {
    public static void main(String[] args) {
//        ConsoleScanner.maxLine(new String[]{"pp", "rrrr", "1"});
//        ConsoleScanner.minLine(new String[]{"pp", "rrrr", "1"});
//        ConsoleScanner.increase(new String[]{"pp", "rrrr", "1"});
//        ConsoleScanner.median(new String[]{"pp", "rrrr", "1"});
//        ConsoleScanner.duplicate("hello darkness");

//        Palindrome.palindrome("эта мадам прекрасна", 3);

        ConsoleScanner consoleScanner = new ConsoleScanner();
        String string = "input";
        if (consoleScanner.different(string))
            System.out.println("The String " + string + " has all unique characters");
        else
            System.out.println("The String " + string + " has duplicate characters");
    }
}