import java.util.Scanner;

public class Ychenick {
    // Entering child information
    public static void FIO_child() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы зашли как ученик");
        System.out.println("1. Просмотреть оценки ");
        System.out.println("2. Просмотреть расписание ");
        System.out.println("3. Просмотреть все уроки ");
        System.out.println("4. Назад ");
        System.out.print("Ваш выбор: ");
        String N = scan.next();
        if (N.equals("4")) Vhod.avtor();
    }
}