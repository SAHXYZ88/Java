import java.util.*;
class Book {
    private String title;
    private int bookId;
    private String author;
    private boolean issued;

    Book(String title, int bookId, String author, boolean issued) {
        this.title = title;
        this.bookId = bookId;
        this.author = author;
        this.issued = issued;
    }

    Book(String title, int bookId, String author) {
        this(title, bookId, author, false);
    }

    Book(String title, int bookId) {
        this(title, bookId, "Unknown", false);
    }

    Book() {
        this("ABC", 0, "Unknown", false);
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return bookId;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIssued() {
        return issued;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }
    @Override
    public String toString() {
        return "Title : " + title + "\nBook Id : " + bookId + "\nAuthor : " + author + "\nIssued : " + issued;
    }
}

class Member {
    private String name;
    private int memberId;

    Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    Member(String name) {
        this(name, 0);
    }

    Member() {
        this("Unknown", 0);
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "Name : " + name + "\nMember Id : " + memberId;
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private HashMap<Integer, Member> members = new HashMap<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    public void viewBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void viewMembers() {
        for (Member member : members.values()) {
            System.out.println(member);
        }
    }

    public void searchBook(int bookId) {
        boolean found = false;
        for (Book book : books) {
            if (book.getId() == bookId) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
                System.out.println("Book Not Found");
        }
    }

    public void issueBook(int bookId, int memberId) {
        Member member = members.get(memberId);
        if (member == null) {
            System.out.println("Member Not Found");
            return;
        }
        for (Book book : books) {
            if (book.getId() == bookId) {
                System.out.println(book);
                if (book.getIssued()) {
                    System.out.println("Already Issue");
                } else {
                    book.setIssued(true);
                    System.out.println("Book Id : " + bookId + " " + "Issued To : " + member.getName());
                }
            }
        }
    }

    public void returnBook(int bookId) {
        boolean found = false;
        for (Book book : books) {
            if (book.getId() == bookId && book.getIssued()) {
                    book.setIssued(false);
                    System.out.println("Book Returned");
                    found = true;
            }
        }
        if (!found) {
            System.out.println("Invalid Book Id");
        }
    }
}

public class LibraryManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        while (true) {
            System.out.println("=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. View Books");
            System.out.println("4. View Members");
            System.out.println("5. Search Book");
            System.out.println("6. Issue Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");
            System.out.print("Enter Choice : ");

            int choice = -1;
            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input.\nEnter a Number : ");
                sc.nextLine();
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter The Title Of The Book : ");
                    String title = sc.nextLine();
                    System.out.println("Enter Author : ");
                    String author = sc.nextLine();
                    System.out.println("Enter Book Id : ");
                    int bookId = sc.nextInt();
                    sc.nextLine();
                    lib.addBook(new Book(title, bookId, author));
                    break;
                case 2:
                    System.out.println("Enter Member Name : ");
                    String name = sc.nextLine();
                    System.out.println("Enter Member Id : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    lib.addMember(new Member(name, id));
                    break;
                case 3:
                    lib.viewBooks();
                    break;
                case 4:
                    lib.viewMembers();
                    break;
                case 5:
                    System.out.println("Enter The Book Id : ");
                    bookId = sc.nextInt();
                    sc.nextLine();
                    lib.searchBook(bookId);
                    break;
                case 6:
                    System.out.println("Enter Book Id To Be Issued : ");
                    bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Member Id : ");
                    int memberId = sc.nextInt();
                    sc.nextLine();
                    lib.issueBook(bookId, memberId);
                    break;
                case 7:
                    System.out.println("Enter The Book Id : ");
                    bookId = sc.nextInt();
                    sc.nextLine();
                    lib.returnBook(bookId);
                    break;
                case 8:
                    return;
            }

        }
    }
}
