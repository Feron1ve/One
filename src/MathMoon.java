import java.util.Scanner;

public class MathMoon {
    public static void main  (String [] args)
    {
        System.out.println("Эта программа  поможет узнать ваш вес на Луне, в кг");
        System.out.println();
        System.out.println("Введите ваш вес");

        Scanner keyboard = new Scanner(System.in);
        double wpe  = keyboard.nextDouble();
        double wpm = wpe*0.17;
        System.out.println("Ваш вес на луне составляет " + wpm + "кг");

    }

}
