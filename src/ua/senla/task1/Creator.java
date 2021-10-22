package ua.senla.task1;

public class Creator {
    public String creatorSum (String number) {


        int result = 0;
        for (int i = 0 ; i<number.length(); i++) {
            result = result + Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return Integer.toString(result);
    }
}
