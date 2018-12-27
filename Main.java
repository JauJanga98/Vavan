import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Silence is golden");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String Name = in.nextLine();
        System.out.println("Введите текущий год: ");
        int Year = in.nextInt();
        System.out.println("Введите возраст: ");
        int Age = in.nextInt();
        System.out.println("Привет " + Name + ". \nТы родился в " + (Year - Age) + " году.\n\n\n");


    }
}
