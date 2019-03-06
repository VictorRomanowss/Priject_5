import org.w3c.dom.Text;

import java.awt.font.NumericShaper;

public class Main {
    static private Integer[] Nume = {3, 4, 5, 12, 54, 12, 67};
    static private String[] Text = {"Петя", "Вася", "Катя", "Маша", "Соня"};

    static void stringer() {
        String temp;
        for (int i = Text.length - 1, j = 0; i >= Text.length / 2; i--, j++) {
            temp = Text[j];
            Text[j] = Text[i];
            Text[i] = temp;
        }
    }

    static void Numer()
         {
        int temp;
        for (int i = Nume.length - 1, j = 0; i >= Nume.length / 2; i--, j++) {
            temp = Nume[j];
            Nume[j] = Nume[i];
            Nume[i] = temp;
        }

    }

    public static void main(String[] args) {
        System.out.print("Изначальный вариант массива: ");
        for (int core : Nume) {
            System.out.print(core + " ");

        }
        System.out.print("\nИсправленный вариант массива: ");
        Numer();

        for (int core : Nume) {
            System.out.print(core + " ");
        }
        System.out.println("\nВывод в определнном формате: ");
        for (int i = 0; i < Nume.length; i++)

            System.out.println("<" + (i + 1) + ">" + "=" + "<" + Nume[i].toString() + ">");

        System.out.print("Изначальный вариант массива: ");
        for (String core : Text) {
            System.out.print(core + " ");
        }
        System.out.print("\nИсправленный вариант массива: ");

        stringer();

        for (String core : Text) {
            System.out.print(core + " ");
        }

        System.out.println("\nВывод в определнном формате: ");
        for (int i = 0; i < Text.length; i++)

            System.out.println("<" + (i + 1) + ">" + "=" + "<" + Text[i].toString() + ">");

    }}







