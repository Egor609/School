import java.util.Scanner;

public class Teacher {
    // Entering teacher information
    public static void FIO_teacher() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы зашли как учитель");
        System.out.print("Введите имя ученика: ");
        String Name = scan.next();
        System.out.print("Введите фамилию ученика: ");
        String Surname = scan.next();
        if (Name.equals("Никита") & (Surname.equals("Козлов"))) {
            System.out.println("1. Выставить оценки  ");
            System.out.println("2. Поставить прогул  ");
            System.out.println("3. Назад ");
            System.out.print("Ваш выбор: ");
            String N = scan.next();
            if (N.equals("3")) Vhod.avtor();
        } else System.out.println("Такого ученика нет");
    }
}