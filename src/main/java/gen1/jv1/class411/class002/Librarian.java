package gen1.jv1.class411.class002;

// Subclase final de User - representa un bibliotecario
public final class Librarian extends User {
    private String department;

    public Librarian(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    public String getRole() {
        return "Librarian";
    }

    public String getDepartment() {
        return department;
    }
}
