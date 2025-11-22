package gen1.jv1.class411.class002;

// Interfaz funcional para definir acciones sobre libros usando lambdas
@FunctionalInterface
public interface BookAction {
    void execute(Book book);
}
