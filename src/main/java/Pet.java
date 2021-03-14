abstract class Pet {
    private final String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    abstract Pet friend();

    protected abstract String makeSound();
}