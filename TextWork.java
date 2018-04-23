package TextLearn;

public class TextWork {
//    Дано текст из 3-х слов “word1 word2 word3”. Поменять 1-е
//    и 3-е слова местами и вывести на экран результат.
    public static void main(String[] args){
        String s = "word1 word2 word3";
        String[] s1 = s.split(" ");
        System.out.println(s1[2]+" "+s1[1]+" "+s1[0]);
    }

}
