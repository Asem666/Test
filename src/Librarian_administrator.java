public class Librarian_administrator  extends User implements Librarian, Administrator {
    public Librarian_administrator(String name) {
        super(name);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор " + name + " обнаружил просрочку возврата книгу у пользователя " + reader);
    }

    @Override
    public void orderBook(Supplier supplier) {
        System.out.println("Библиотекарь " + name + " заказал книги у поставщика " + supplier);
    }

    @Override
    public void receiveBook(Supplier supplier) {
        System.out.println("Библиотекарь " + name + " получил книги от поставщика " + supplier);
    }
}