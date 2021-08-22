public class Test {
        public static void main(String[] args) {
            UserAdministrator userAdministrator = new UserAdministrator("Олег");
            Suplier_Reader supplierReader = new Suplier_Reader("Катя");
            Librarian_administrator librarianAdministrator = new Librarian_administrator("Вася");

            userAdministrator.overdueNotification(supplierReader);
            supplierReader.takeBook(userAdministrator);
            supplierReader.returnBook(userAdministrator);
            librarianAdministrator.orderBook(supplierReader);
        }
    }