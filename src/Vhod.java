import java.util.Scanner;
import java.io.*;

public class Vhod {
    public static void avtor() {
        Scanner scan = new Scanner(System.in);
        String User = null, Entrance, Login, Password, Name, Surname;
        boolean Flag = true, Next = true;
        System.out.println("*******************************************");
        System.out.println("Добро пожаловать в электронный дневник!");
        System.out.println("1 (Авторизоваться)");
        System.out.println("2 (Зарегистрироваться)");
        System.out.print("Вы хотите: ");
        Entrance = scan.nextLine();

        if (Entrance.equals("1")) {
            // Access check
            while (Flag) {
                System.out.println("*******************************************");
                boolean tr = true; //Переменная для указателя успешности авторизации. Выбор return
                String Log, Pas;
                System.out.print("Введите логин: ");
                Login = scan.next();
                System.out.print("Введите пароль: ");
                Password = scan.next();
                try (Scanner PeopSc = new Scanner(new File("DataUsers.txt"))) {
                    while (PeopSc.hasNext()) {
                        User = PeopSc.next();
                        Log = PeopSc.next();
                        Pas = PeopSc.next();
                        if (Log.equals(Login) && Pas.equals(Password)) {
                            System.out.println("Авторизация выполнена успешно");
                            System.out.println("*******************************************");
                            tr = false;
                        }
                    }
                } catch (FileNotFoundException e) {
                    System.out.printf("File [%s] is not found.\n");
                }

                if (tr) {
                    System.out.println("!Логин или пароль неверный!");
                } else {
                    if (User.equals("1")) {
                        Ychenick.FIO_child();
                        Flag = false;
                    }
                    if (User.equals("2")) {
                        Perans.FIO_perants();
                        Flag = false;
                    }
                    if (User.equals("3")) {
                        Teacher.FIO_teacher();
                        Flag = false;
                    }
                }
            }
        // Registration user
        } else if (Entrance.equals("2")) {
            do {
                System.out.println("*******************************************");
                System.out.println("Пользователи системы");
                System.out.println("1 (Ученик)");
                System.out.println("2 (Родитель)");
                System.out.println("3 (Учитель)");
                System.out.print("Зарегистрироваться как: ");
                User = scan.next();
                if (User.equals("1") || User.equals("2") || User.equals("3")) Next = false;
            } while (Next);
            System.out.println("*******************************************");
            System.out.print("Введите логин: ");
            Login = scan.next();
            System.out.print("Введите пароль: ");
            Password = scan.next();
            System.out.print("Введите имя: ");
            Name = scan.next();
            System.out.print("Введите фамилию: ");
            Surname = scan.next();

            try(FileWriter writer = new FileWriter("DataUsers.txt", true))
            {
                writer.write(User); // Запись всей строки
                writer.append(" "); // Запись по символам
                writer.write(Login);
                writer.append(" ");
                writer.write(Password);
                writer.append(" ");
                writer.write(Name);
                writer.append(" ");
                writer.write(Surname);
                writer.append('\n');
                writer.flush();
                System.out.println("Вы успешно зарегистрировались");
                System.out.println("*******************************************");
                Vhod.avtor();
            }
            catch(IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        else Vhod.avtor();
    }
}