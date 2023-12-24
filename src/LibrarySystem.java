import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private List<Student> students;
    private List<LibraryCard> libraryCards;
    public List<Book> books;
    private List<LibraryJournalEntry> libraryJournal;

    public LibrarySystem() {
        students = new ArrayList<>();
        libraryCards = new ArrayList<>();
        books = new ArrayList<>();
        libraryJournal = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(Book book, LibraryCard libraryCard, int loanPeriodDays) {
        int ticketNumber = libraryCard.getTicketNumber();
        LocalDate issueDate = LocalDate.now();

        LibraryJournalEntry journalEntry = new LibraryJournalEntry(book, ticketNumber, issueDate, loanPeriodDays);
        libraryJournal.add(journalEntry);
    }

    public void returnBook(Book book, int ticketNumber) {
        LocalDate returnDate = LocalDate.now();

        for (LibraryJournalEntry journalEntry : libraryJournal) {
            if (journalEntry.getBook().equals(book) && journalEntry.getTicketNumber() == ticketNumber) {
                journalEntry.setReturnDate(returnDate);
                break;
            }
        }
    }

    public List<Student> findOverdueStudents() {
        List<Student> overdueStudents = new ArrayList<>();
        LocalDate currentDate = LocalDate.now();

        for (LibraryJournalEntry journalEntry : libraryJournal) {
            if (currentDate.isAfter(journalEntry.getDueDate())) {
                int ticketNumber = journalEntry.getTicketNumber();
                for (Student student : students) {
                    if (student.getTicketNumber() == ticketNumber) {
                        overdueStudents.add(student);
                        break;
                    }
                }
            }
        }

        return overdueStudents;
    }
}
