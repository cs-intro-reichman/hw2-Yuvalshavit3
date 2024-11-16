// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        
        String word = args[0].toUpperCase();
        
        int length = word.length();
        int i = 0;
        int index = 0;

        while (i < length) {
        if (word.charAt(index) == 'A' || word.charAt(index) == 'E' || word.charAt(index) == 'F' || word.charAt(index) == 'H' || word.charAt(index) ==  'I'
        || word.charAt(index) == 'L' || word.charAt(index) == 'M' || word.charAt(index) == 'N' || word.charAt(index) ==  'O' || word.charAt(index) == 'R'
        || word.charAt(index) == 'S' || word.charAt(index) == 'X' ) {
                System.out.println("Give me an " + word.charAt(index) + ": " + word.charAt(index) + "!");
        } else {
                System.out.println("Give me a  " + word.charAt(index) + ": " + word.charAt(index) + "!");
        }
        
        i++;
        index++;
        }
        System.out.println("What does that spell?");

        System.out.println(word + "!!!");
        System.out.println(word + "!!!");
        System.out.println(word + "!!!");
        System.out.println(word + "!!!");
        System.out.println(word + "!!!");
        }
}
