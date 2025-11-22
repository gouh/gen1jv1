package gen1.jv1.class411.class002;

// Clase sellada que define la jerarquía de tipos de usuario
public sealed abstract class User permits Reader, Librarian {
    private final String name;
    private final String id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public abstract String getRole();
}
