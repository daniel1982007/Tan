package CountWord;

public class WordCount {

    public static void main(String[] args) {
        String s = "Hello, I am a java programmer, I like java very much.";

        String[] s1 = s.split("[^\\w]+");

        String target = "java";
        int count = 0;
        for (String string : s1) {
            if (string.equals(target)) {
                count++;
            }

        }
        System.out.println(count);
    }

}
