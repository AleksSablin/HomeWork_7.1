import java.time.LocalDate;

public class LibraryJournalEntry {
    private Book book;
    private int ticketNumber;
    private LocalDate issueDate;
    private int loanPeriodDays;

    public LibraryJournalEntry(Book book, int ticketNumber, LocalDate issueDate, int loanPeriodDays) {
        this.book = book;
        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
        this.loanPeriodDays = loanPeriodDays;
    }

    public Book getBook() {
        return book;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getDueDate() {
        return issueDate.plusDays(loanPeriodDays);
    }

    public void setReturnDate(LocalDate returnDate) {
    }
}
