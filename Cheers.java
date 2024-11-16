// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
        
        String word = args[0].toUpperCase();
        
        int length = word.length();
        int i = 0;
        int index = 0;

        while (i < length) {
        System.out.println("Give me a " + word.charAt(index) + " : " + word.charAt(index) + "!");
        i++;
        index++;
        }
        System.out.println("What does that spell?");

        System.out.println(word);
        }
}
