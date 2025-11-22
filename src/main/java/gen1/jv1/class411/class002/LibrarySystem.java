package gen1.jv1.class411.class002;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE BIBLIOTECA ===\n");

        // 1. CREAR LIBROS (Clase regular)
        System.out.println("1. CREANDO LIBROS:");
        Book book1 = new Book("Clean Code", "Robert Martin", "978-0132350884", 464);
        Book book2 = new Book("Effective Java", "Joshua Bloch", "978-0134685991", 416);
        
        // Agregar libros a una colección
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        // 2. CLASE INTERNA - Publisher
        System.out.println("\n2. USANDO CLASE INTERNA (Publisher):");
        book1.setPublisher("Prentice Hall", "USA");
        book2.setPublisher("Addison-Wesley", "USA");
        System.out.println(book1.getPublisher().getInfo());
        System.out.println(book2.getPublisher().getInfo());

        // 3. CLASE INTERNA ESTÁTICA - Chapter
        System.out.println("\n3. USANDO CLASE INTERNA ESTÁTICA (Chapter):");
        book1.addChapter(1, "Clean Code", 1);
        book1.addChapter(2, "Meaningful Names", 17);
        book1.addChapter(3, "Functions", 31);
        
        for (Book.Chapter chapter : book1.getChapters()) {
            System.out.println(chapter.getInfo());
        }

        // 4. ENUM - BookStatus
        System.out.println("\n4. USANDO ENUM (BookStatus):");
        book1.setStatus(BookStatus.BORROWED);
        book2.setStatus(BookStatus.AVAILABLE);
        System.out.println(book1.getTitle() + " - Estado: " + book1.getStatus().getDescription());
        System.out.println(book2.getTitle() + " - Estado: " + book2.getStatus().getDescription());

        // 5. CLASE ANÓNIMA - Implementación temporal de BookAction
        System.out.println("\n5. USANDO CLASE ANÓNIMA:");
        BookAction anonymousAction = new BookAction() {
            @Override
            public void execute(Book book) {
                System.out.println("Acción anónima: Prestando libro '" + book.getTitle() + "'");
                book.setStatus(BookStatus.BORROWED);
            }
        };
        anonymousAction.execute(book2);
        System.out.println("Nuevo estado de " + book2.getTitle() + ": " + book2.getStatus().getDescription());

        // 6. INTERFAZ FUNCIONAL Y LAMBDAS
        System.out.println("\n6. USANDO LAMBDAS (Interfaz Funcional):");
        
        // Lambda 1: Mostrar título
        BookAction showTitle = (book) -> System.out.println("Título: " + book.getTitle());
        
        // Lambda 2: Actualizar páginas
        BookAction updatePages = (book) -> {
            book.setPages(book.getPages() + 10);
            System.out.println("Páginas actualizadas de '" + book.getTitle() + "': " + book.getPages());
        };
        
        showTitle.execute(book1);
        updatePages.execute(book1);

        // 7. CICLOS CON COLECCIONES
        System.out.println("\n7. ITERANDO COLECCIÓN DE LIBROS:");
        for (Book book : books) {
            System.out.println(book);
        }

        // Usando forEach con lambda
        System.out.println("\nUsando forEach con lambda:");
        books.forEach(book -> System.out.println("- " + book.getTitle() + " por " + book.getAuthor()));

        // 8. CLASES SELLADAS - User hierarchy
        System.out.println("\n8. USANDO CLASES SELLADAS (User):");
        Reader reader = new Reader("Juan Pérez", "R001");
        Librarian librarian = new Librarian("María García", "L001", "Ciencias");
        
        List<User> users = List.of(reader, librarian);
        
        for (User user : users) {
            System.out.println("Usuario: " + user.getName() + " - Rol: " + user.getRole());
        }
        
        // Pattern matching con sealed classes
        System.out.println("\nPattern matching con sealed classes:");
        processUser(reader);
        processUser(librarian);

        // 9. RECORD - Libro inmutable
        System.out.println("\n9. USANDO RECORD (BookRecord - Inmutable):");
        BookRecord recordBook1 = new BookRecord("Design Patterns", "Gang of Four", "978-0201633610", 395);
        BookRecord recordBook2 = new BookRecord("Refactoring", "Martin Fowler", "978-0134757599", 448);
        
        System.out.println("Record 1: " + recordBook1.getShortInfo());
        System.out.println("Record completo: " + recordBook2);
        
        // Los records son inmutables - para "modificar" hay que crear uno nuevo
        BookRecord updatedRecord = new BookRecord(
            recordBook1.title(),
            recordBook1.author(),
            recordBook1.isbn(),
            recordBook1.pages() + 50
        );
        System.out.println("Record actualizado (nuevo objeto): " + updatedRecord);

        // 10. DEMOSTRACIÓN DE MUTABILIDAD vs INMUTABILIDAD
        System.out.println("\n10. MUTABILIDAD vs INMUTABILIDAD:");
        System.out.println("Libro mutable antes: " + book1.getPages() + " páginas");
        book1.setPages(500);
        System.out.println("Libro mutable después: " + book1.getPages() + " páginas");
        
        System.out.println("\nRecord inmutable: " + recordBook1.pages() + " páginas");
        System.out.println("Para 'modificar' un record, se crea uno nuevo: " + updatedRecord.pages() + " páginas");

        System.out.println("\n=== FIN DEL SISTEMA ===");
    }

    private static void processUser(User user) {
        switch (user) {
            case Reader r -> System.out.println("Procesando lector: " + r.getName() + 
                                               " (Libros prestados: " + r.getBorrowedBooks() + ")");
            case Librarian l -> System.out.println("Procesando bibliotecario: " + l.getName() + 
                                                   " (Departamento: " + l.getDepartment() + ")");
        }
    }
}
