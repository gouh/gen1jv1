package gen1.jv1.class411.class002;

// Enum para representar el estado de un libro
public enum BookStatus {
    AVAILABLE("Disponible"),
    BORROWED("Prestado"),
    RESERVED("Reservado");

    private final String description;

    BookStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
