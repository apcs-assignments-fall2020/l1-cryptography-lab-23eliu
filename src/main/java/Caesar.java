import java.util.Scanner;

public class Caesar {
    public static String encryptCaesar(String message) {
        String efin = "";
        for (int i = 0; i < message.length(); i++) {
            if (!(message.charAt(i) >= 65 && message.charAt(i) <= 90) && !(message.charAt(i) >= 97 && message.charAt(i) <= 122)) {
                efin += message.charAt(i);
            }
            else if (message.charAt(i) >= 65 && message.charAt(i) <= 90) {
                int x = message.charAt(i) - 65;
                x += 3;
                if (x % 26 >= 0) {
                    x = x % 26;
                }
                efin += (char) (x + 65);
            }
            else {
                int x = message.charAt(i) - 97;
                x += 3;
                if (x % 26 >= 0) {
                    x = x % 26;
                }
                efin += (char) (x + 97);
            }
        }
        return efin;
    }

    public static String decryptCaesar(String message) {
        return message;
        // REPLACE THIS WITH YOUR CODE
    }

    public static String encryptCaesarKey(String message, int key) {
        return message;
        // REPLACE THIS WITH YOUR CODE
    }

    public static String decryptCaesarKey(String message, int key) {
        return message;
        // REPLACE THIS WITH YOUR CODE
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesar(message));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesar(message));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
