public class Suplier_Reader extends User implements Supplier, Reader {

    public Suplier_Reader(String name) {
        super(name);
    }

    @Override
    public void takeBook(Administrator administrator) {
        System.out.println("Поставщик " + name + " взял почитать книгу у админа " + administrator);
    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println("Поставщик " + name + " вернул книгу админу " + administrator);
    }

    @Override
    public void bringBook(Librarian librarian) {
        System.out.println("Поставщик " + name + " привез книги библиотекарю " + librarian);
    }
}