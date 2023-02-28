public class Animal {
    private String name;
    private String species;
    private String color;
    private int legs;
    private boolean tail;
    private String sound;

    // Constructor to actually be able to make the class into a usable object
    public Animal(String species, String color, boolean tail, int legs, String sound, String name) {
        this.species = species;
        this.color = color;
        this.tail = tail;
        this.legs = legs;
        this.sound = sound;
        this.name = name;
    }

    public void speak() {
        System.out.printf("%s says \"%s\"%n", name, sound);
    }

    // This goes into the Animal class instead of the Main class because it is shared functionality between animals.
    // It would be a similar way to create a separate function in the main class that takes two Animals and combines them
    // but I find that it makes more sense for common functionality to be contained in the same class since it is the entire
    // point of object oriented programming.
    public Animal crossbreed(Animal partner) {
        if (!this.species.equals(partner.species))
            return null;

        return new Animal(this.species, this.color, this.tail, this.legs / 2, this.sound + partner.sound, this.name + partner.name);
    }

    // Getter methods for all properties
    public String getName() { return name; }
    public String getSpecies() { return species; }
    public String getColor() { return color; }
    public int getLegs() { return legs; }
    public boolean hasTail() { return tail; }

    // Setter methods for all properties
    public void setName(String name) { this.name = name; }
    public void setSpecies(String species) { this.species = species; }
    public void setColor(String color) {this.color = color; }
    public void setLegs(int legs) {
        // Animals can't have negative legs; how would -5 legs even work?
        if (legs >= 0)
            this.legs = legs;
    }
    public void setTail(boolean tail) { this.tail = tail; }

    // Override to make class printable
    public String toString() {
        return String.format("A %s %s called %s with %d legs and %s tail.", color, species, name, legs, (tail) ? "a" : "no");
    }
}
