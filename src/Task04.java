import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Задание 4");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        MainString mainString1 = new MainString(str);

        System.out.print("Введите символ: ");
        char c = scanner.next().charAt(0);
        MainString mainString2 = new MainString(c);

        System.out.println("Длина строки: " + mainString1.getLength());
        System.out.println("Длина строки: " + mainString2.getLength());

        System.out.println("Очистка строки...");
        mainString1.clear();
        System.out.println("Длина строки после очистки: " + mainString1.getLength());

        System.out.print("Введите символ для поиска: ");
        char searchChar = scanner.next().charAt(0);
        boolean containsChar = mainString2.contains(searchChar);
        if (containsChar) {
            System.out.println("Строка содержит символ " + searchChar);
        } else {
            System.out.println("Строка не содержит символ " + searchChar);
        }
    }
}
