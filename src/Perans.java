import java.util.Scanner;

public class Perans {
    // Entering parent information
    public static void FIO_perants() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы зашли как родитель");
        System.out.println("1. Просмотреть оценки ");
        System.out.println("2. Просмотреть расписание ");
        System.out.println("3. Просмотреть посещаемость ");
        System.out.println("4. Назад ");
        System.out.print("Ваш выбор: ");
        String N = scan.next();
        if (N.equals("4")) Vhod.avtor();
    }
}