import java.util.Scanner;

public class DictionaryManagement {
    Dictionary dict = new Dictionary();
    int soTu;
    public void insertFromCommandline() {
        Scanner sc = new Scanner(System.in);
        soTu = sc.nextInt();
        String s = sc.nextLine();
        dict.word = new Word[soTu];

        for (int i = 0; i < soTu; i++) {
            dict.word[i] = new Word();
            // Nhap tu moi
            dict.word[i].word_target = sc.nextLine();
            // Nhap nghia cua tu moi vua nhap
            dict.word[i].word_explain = sc.nextLine();
        }

    }
    public void show() {
        System.out.println("No      |English        |Vietnamese");
        for (int i = 0; i < soTu; i++) {
            System.out.println((i+1)+"		|"+dict.word[i].word_target+"		\t|"+dict.word[i].word_explain);
        }
    }

}
