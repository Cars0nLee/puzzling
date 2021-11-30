import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random randMachine = new Random();
        for (int i=1; i<=10; i++){
            numbers.add(randMachine.nextInt(20)+1); // +1 to include 20. 1-20.
        }
        return numbers;
    }

    public String getRandomLetter() {
        Random letter = new Random();
        String[] alpha = new String[26];
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<26; i++){
            alpha[i] = String.valueOf(alphabet.charAt(i));
        }
        return alpha[letter.nextInt(26)];
    }

    public String generatePassword() {
        String password = "";
        for (int i=0; i<8; i++){
            password = password + getRandomLetter();
        }
        return "Password: " + password;
    }

    public String getNewPasswordSet(int length) {
        String password = "";
        for (int i=0; i<length; i++){
            password = password + getRandomLetter();
        }
        return "New Password: " + password;
    }
}

