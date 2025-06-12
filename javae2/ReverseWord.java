package javae2;

public class ReverseWord {

    public static void main(String[] args) {
        String sentence = "i am a good boy";

        String[] words = sentence.split(" ");

        System.out.println("Reversed word order:");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        StringBuilder sb = new StringBuilder(sentence);
        System.out.println("\nReversed entire sentence:");
        System.out.println(sb.reverse());
    }
}
