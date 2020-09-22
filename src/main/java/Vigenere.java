import java.util.Scanner;

public class Vigenere {
    public static String encryptVigenere(String message, String key) {
        String efin = "";
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (!(message.charAt(i) >= 65 && message.charAt(i) <= 90) && !(message.charAt(i) >= 97 && message.charAt(i) <= 122)) {
                efin += message.charAt(i);
            }
            else if (message.charAt(i) >= 65 && message.charAt(i) <= 90) {
                if (count == key.length()-1) {
                    count = 0;
                }
                else {
                    count++; 
                }
                int x = message.charAt(i) - 65;
                x += (key.charAt(count) - 66);
                if (x % 26 >= 0) {
                    x = x % 26;
                }
                efin += (char) (x + 65);
            }
            else {
                if (count == key.length()-1) {
                    count = 0;
                }
                else {
                    count++; 
                }
                int x = message.charAt(i) - 97;
                x += (key.charAt(count) - 98);
                if (x % 26 >= 0) {
                    x = x % 26;
                }
                efin += (char) (x + 97);
            }
        }
        return efin;
    }

    public static String decryptVigenere(String message, String key) {
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
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptVigenere(message, key));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptVigenere(message, key));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
