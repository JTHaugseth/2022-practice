public class Main {

    public static void main(String[] args) {
        System.out.println("Printer ny bok");
        Book hei = new Book("Hei", "Julian", 200);

        System.out.println(hei.getAuthor());
        hei.getAuthor();
    }
}
