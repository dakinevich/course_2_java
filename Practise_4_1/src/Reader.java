import java.util.Date;

public class Reader {
    private String fullName;
    private int ticketNumber;
    private String faculty;
    private Date birthDate;
    private String phoneNumber;

    public Reader(String fullName, int ticketNumber, String faculty, Date birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int count) {
        System.out.println(fullName + " взял " + count + " книги");
    }

    public void takeBook(String... bookNames) {
        StringBuilder sb = new StringBuilder();
        for (String bookName : bookNames) {
            sb.append(bookName).append(", ");
        }
        sb.setLength(sb.length() - 2);
        System.out.println(fullName + " взял книги: " + sb.toString());
    }

    public void takeBook(Book... books) {
        StringBuilder sb = new StringBuilder();
        for (Book book : books) {
            sb.append(book.getTitle()).append(" (").append(book.getAuthor()).append(")").append(", ");
        }
        sb.setLength(sb.length() - 2);
        System.out.println(fullName + " взял книги: " + sb.toString());
    }

    public void returnBook(int count) {
        System.out.println(fullName + " вернул " + count + " книги");
    }

    public void returnBook(String... bookNames) {
        StringBuilder sb = new StringBuilder();
        for (String bookName : bookNames) {
            sb.append(bookName).append(", ");
        }
        sb.setLength(sb.length() - 2);
        System.out.println(fullName + " вернул книги: " + sb.toString());
    }

    public void returnBook(Book... books) {
        StringBuilder sb = new StringBuilder();
        for (Book book : books) {
            sb.append(book.getTitle()).append(" (").append(book.getAuthor()).append(")").append(", ");
        }
        sb.setLength(sb.length() - 2);
        System.out.println(fullName + " вернул книги: " + sb.toString());
    }
}