import java.util.Arrays;

public class ConsoleScanner {

    //task1
    public static void maxLine(String[] strings){
        String maxTemp = strings[0];

        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() > maxTemp.length()) {
                maxTemp = strings[i];
            }
        }
        System.out.println("Maximal line is: " + maxTemp + ". The line length is:" + maxTemp.length());
    }

    public static void minLine(String[] strings){
        String minTemp = strings[0];

        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() < minTemp.length()) {
                minTemp = strings[i];
            }
        }
        System.out.println("Minimal line is: " + minTemp + ". The line length is:" + minTemp.length());
    }

    //task2
    public static void increase(String[] strings){
        for (int i = strings.length - 1 ; i > 0 ; i--) {
            for (int j = 0 ; j < i ; j++) {
                if (strings[j].length() > strings[j + 1].length()) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }

    //task3
    public static void median(String[] strings){
        int temp = 0;

        for (String string : strings) {
            temp += string.length();
        }

        for (String string : strings) {
            if (string.length() < (temp / 2)) {
                System.out.println("Median value is: " + (temp / 2) + ". Suitable string: \n" + string + ". The line length is:" + string.length());
            }
        }
    }

    //task4
    public boolean different(String string) {
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    //task5
    public static void duplicate(String string) {
        for (int i = 0; i < string.length(); i++) {
            String dupl = string.substring(i, i + 1);
            System.out.print(dupl + dupl);
        }
    }
}
