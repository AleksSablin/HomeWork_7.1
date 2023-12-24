import java.util.List;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        System.out.println("Задание 6");
        LibrarySystem librarySystem = new LibrarySystem();
        Scanner scanner = new Scanner(System.in);

        // Добавление студентов
        librarySystem.addStudent(new Student(1, "Иван", "Иванов", "Группа 1"));
        librarySystem.addStudent(new Student(2, "Петр", "Петров", "Группа 2"));
        librarySystem.addStudent(new Student(3, "Сидор", "Сидоров", "Группа 1"));

        // Добавление книг
        librarySystem.addBook(new Book("Книга 1", "Автор 1"));
        librarySystem.addBook(new Book("Книга 2", "Автор 2"));
        librarySystem.addBook(new Book("Книга 3", "Автор 3"));

        // Выдача книги
        System.out.print("Введите номер билета студента: ");
        int ticketNumber = scanner.nextInt();

        System.out.print("Введите название книги: ");
        scanner.nextLine(); // Очистка буфера
        String bookTitle = scanner.nextLine();

        Book book = null;
        for (Book b : librarySystem.books) {
            if (b.getTitle().equals(bookTitle)) {
                book = b;
                break;
            }
        }

        if (book != null) {
            LibraryCard libraryCard = new LibraryCard(ticketNumber);
            librarySystem.issueBook(book, libraryCard, 14);
            System.out.println("Книга выдана студенту с номером билета " + ticketNumber);
        } else {
            System.out.println("Книга не найдена");
        }

        // Возврат книги
        System.out.print("Введите номер билета студента: ");
        ticketNumber = scanner.nextInt();

        System.out.print("Введите название книги: ");
        scanner.nextLine(); // Очистка буфера
        bookTitle = scanner.nextLine();

        book = null;
        for (Book b : librarySystem.books) {
            if (b.getTitle().equals(bookTitle)) {
                book = b;
                break;
            }
        }

        if (book != null) {
            librarySystem.returnBook(book, ticketNumber);
            System.out.println("Книга принята от студента с номером билета " + ticketNumber);
        } else {
            System.out.println("Книга не найдена");
        }

        // Поиск должников
        List<Student> overdueStudents = librarySystem.findOverdueStudents();
        if (overdueStudents.isEmpty()) {
            System.out.println("Должников нет");
        } else {
            System.out.println("Должники:");
            for (Student student : overdueStudents) {
                System.out.println("Студент: " + student.getFullName() + ", Группа: " + student.getGroupNumber());
            }
        }
    }
}

