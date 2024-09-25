package opgave01;

public class Books {

    public static void main(String[] args) {
        Book book1 = new Book("peter","hej",2);
        Book book2 = new Book("kurt","hej2",4);

        printBooks(book1);
        printBooks(book2);
    }

    public static void printBooks (Book book){
        System.out.println(book.title + book.pages + book.author);
    }

}
