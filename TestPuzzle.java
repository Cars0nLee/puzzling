public class TestPuzzle {
    public static void main(String[] args){
        PuzzleJava puzzleApp = new PuzzleJava(); // instance of PuzzleJava

        // getTenRolls
        System.out.println(puzzleApp.getTenRolls());

        // getRandomLetter
        System.out.println("Random letter: " + puzzleApp.getRandomLetter());

        // generatePassword
        System.out.println(puzzleApp.generatePassword());

        // getNewPasswordSet
        System.out.println(puzzleApp.getNewPasswordSet(10));
        System.out.println(puzzleApp.getNewPasswordSet(20));
    }
}
