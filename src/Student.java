public class Student {
    private int ticketNumber;
    private String firstName;
    private String lastName;
    private String groupNumber;

    public Student(int ticketNumber, String firstName, String lastName, String groupNumber) {
        this.ticketNumber = ticketNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getGroupNumber() {
        return groupNumber;
    }
}
