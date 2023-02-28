public class Main {
    public static void main(String[] args) {
        // If you've read Animal Farm by George Orwell you'll understand why I set the animals' properties like this
        // (It's just characters from the book if you haven't read it)
        Animal[] animals = {
                new Animal("ptg", "white", true, 4, "Animalism is the only way!", "Snowball"),
                new Animal("goat", "gray", true, 4, "*silence* *stares deeply into the distance*", "Benjamin"),
                new Animal("pig", "pink", true, 2, "Comrades!", "Napoleon"),
                new Animal("crow", "black", true, 2, "March onward to Sugarcandy Mountain!", "Moses"),
                new Animal("horse", "white", true, 4, "Sugar? Where?", "Mollie"),
                new Animal("horse", "black", true, 4, "Must work harder.", "Boxer"),
        };

        // Oops, made a typo in the first animal
        animals[0].setSpecies("pig");

        for (Animal animal : animals) {
            // Add some nice spacing so that its not just a massive wall of text
            System.out.println();

            // Print out the animal's information and what it says
            System.out.println(animal);
            animal.speak();
        }

        // Forgot what the first animals' name was
        System.out.println(animals[0].getName());
        // Ah, that's what it was
    }
}