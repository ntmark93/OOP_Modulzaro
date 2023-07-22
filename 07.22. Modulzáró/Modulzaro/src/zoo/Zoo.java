package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static List<Animal> animals = new ArrayList<>();

    public static void addNewAnimal(Animal animal) {
        animals.add(animal);
    }

    public static void sayGoodBye(Animal animal) {
        for (Animal actual : animals) {
            if (animal.equals(actual)) {
                animals.remove(actual);
                break;
            } else {
                System.out.println("Nincs ilyen nevű állat");
            }
        }
    }

    public static void sayGoodBye(String animal) {
        for (Animal actual : animals) {
            if (animal.equals(actual.getName()) ||
                    animal.equals(actual.getName().toLowerCase()) ||
                    animal.equals(actual.getName().toUpperCase())) {
                animals.remove(actual);
                break;
            } else {
                System.out.println("Nincs ilyen nevű állat");
            }
        }
    }

    public static void checkTotal() {
        for (Animal actual : animals) {
            if (animals.size() > 0) {
                System.out.println(actual);
            } else {
                System.out.println("Egy darab állat nincs az állatkerben");
            }

        }
    }

    public static void checkMammals() {
        for (Animal animal : animals) {
            if (animal instanceof Mammal) {
                System.out.println(animal);
            } else {
                System.out.println("Nincsenek emlős állatok az állatkerben");
            }
        }
    }

    public static void checkBirds() {
        for (Animal animal : animals) {
            if (animal instanceof Bird) {
                System.out.println(animal);
            } else {
                System.out.println("Nincsenek madarak az állatkerben");
            }
        }
    }

    public static void checkReptiles() {
        for (Animal animal : animals) {
            if (animal instanceof Reptile) {
                System.out.println(animal);
            } else {
                System.out.println("Nincsenek hüllők az állatkertben");
            }
        }
    }
}
