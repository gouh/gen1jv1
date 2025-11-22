package gen1.jv1.class411.class002;

// Record para representar un libro inmutable
public record BookRecord(String title, String author, String isbn, int pages) {
    
    // Constructor compacto para validación
    public BookRecord {
        if (pages <= 0) {
            throw new IllegalArgumentException("Pages must be positive");
        }
    }

    // Método personalizado
    public String getShortInfo() {
        return title + " by " + author;
    }
}
