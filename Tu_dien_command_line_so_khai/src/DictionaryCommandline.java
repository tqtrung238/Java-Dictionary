import java.util.Scanner;

public class DictionaryCommandline {
    static DictionaryManagement a = new DictionaryManagement();
    public static void showAllWords(){
        a.show();
    }
    public static void dictionaryBasic(){
        a.insertFromCommandline();
        showAllWords();
    }
    public static void main(String[] args) {
        dictionaryBasic();
    }
}
