public class Password {
    // The password must contain the following:
    // 0. a number
    // 1. letters
    // 2. a capital letter
    // 3. a special character
    // 4. the length of the password must have a minimum of 8 characters


    public static void validatePassword(String password, String anotherPassword) {

        if (isMatch(password, anotherPassword)) {
            if (!containsDigit(password)) {
                System.out.println("The password must contain a number!");
            }
            if (!containsCapitalLetter(password)) {
                System.out.println("The password must contain a capital letter!");
            }
            if (!containsSpecialCharacter(password)) {
                System.out.println("The password must contain a special character!");
            }
            if (!hasEightCharacter(password)) {
                System.out.println("The password must contain a minimum of 8 characters");
            }
            if (containsDigit(password) && containsCapitalLetter(password) && containsSpecialCharacter(password) && hasEightCharacter(password)) {
                System.out.println("The password, is accepted!");
            }

        } else {
            System.out.println("Passwords don't match");
        }
    }


    public static boolean containsDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                return true;
            }
        }
        return false;
    }

    public static boolean containsCapitalLetter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsSpecialCharacter(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '!' && password.charAt(i) <= '/' ||
                    password.charAt(i) >= ':' && password.charAt(i) <= '@' ||
                    password.charAt(i) >= '[' && password.charAt(i) <= '`' ||
                    password.charAt(i) >= '{' && password.charAt(i) <= '~') {
                return true;
            }
        }
        return false;
    }

    public static boolean hasEightCharacter(String password) {
        return password.length() >= 8;
    }

    public static boolean isMatch(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }
}
