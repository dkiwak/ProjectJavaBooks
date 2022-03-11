public class Main {
    public static void main(String[] args) {
        Books book1 = new Books("Alicja w krainie czarów", "Lewis Carol", 200);
        Books book2 = new Books ("1984", "Orwell", 200);
        Books book3 = new Books ("Nowy Wspaniały Świat", "Auxley", 250);

        System.out.println(book1.bookDetails());
        book1.setNumberOfPages(200);
        System.out.println(book1.bookDetails());
        book1.setAuthor("Lewis Carol");
        System.out.println(book1.bookDetails());

    }


}