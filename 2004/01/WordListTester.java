import java.util.ArrayList;

public class WordListTester {
    
    public static void main(String[] args) {
        
        ArrayList<String> a = new ArrayList<String>();
        a.add("cat");
        a.add("mouse");
        a.add("frog");
        a.add("dog");
        a.add("dog");

        WordList animals = new WordList(a);

        System.out.println(animals.numWordsOfLength(4));
        System.out.println(animals.numWordsOfLength(3));
        System.out.println(animals.numWordsOfLength(2));

        animals.removeWordsOfLength(4);
        System.out.println(animals);
        animals.removeWordsOfLength(3);
        System.out.println(animals);
        animals.removeWordsOfLength(2);
        System.out.println(animals);
    }

}