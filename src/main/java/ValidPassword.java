import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a password: ");
        String password = input.next();
        boolean atLeastTen = mustHaveAtLeastTenCharacters(password);
        boolean lettersAndDigits = iSOnlyLettersAndDigits(password);
        boolean twoDigits = containAtLeastTwoDigit(password);
        if (atLeastTen && lettersAndDigits && twoDigits){
            System.out.println("Paswword is valid: " + password);
        }else{
            System.out.println("Invalid password");
        }

    }

    public static boolean mustHaveAtLeastTenCharacters(String password) {
        if (password.length() < 10){
        return false;} else{
            return true;
        }
    }




    public static boolean iSOnlyLettersAndDigits(String password) {
        char c;
        for (int i = 0; i < password.length() - 1; i++) {
            c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {

                return false;
            }
        }
        return true;
    }

    public static boolean containAtLeastTwoDigit(String password) {
        char c;
        int counter = 1;
        for (int i = 0; i < password.length() - 1; i++) {
            c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            } else if (Character.isDigit(c)) {
                counter++;
                if(counter<2)
                    return false;
            }
        }
        return true;

    }
}



