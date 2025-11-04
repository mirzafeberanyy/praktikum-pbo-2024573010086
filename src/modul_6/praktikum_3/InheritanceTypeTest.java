package modul_6.praktikum_3;

public class InheritanceTypeTest {
    public static void main(String[] args) {
        // Multilevel inheritance test
        Dog dog = new Dog("Buddy", "Brown", "Golden Retriever");
        dog.eat(); // dari animal, di-override di dog
        dog.sleep(); // dari animal
        dog.giveBirth(); // dari mammal
        dog.bark(); // dari dog

        System.out.println();

        // Hierarchical inheritance test
        Cat cat = new Cat("Whiskers", "White", true);
        cat.eat(); // dari animal, di-override di cat
        cat.sleep(); // dari animal
        cat.giveBirth(); // dari mammal
        cat.meow(); // dari cat

        System.out.println();

        // Polymorphism dengan hierarchical inheritance
        Animal[] animals = {new Dog("Max", "Black", "labrador"),
                            new Cat("Luna", "Gray", false)};

        for (Animal animal : animals) {
            animal.eat(); // akan memanggil method yg sesuai dengan objek sebenarnya
        }
    }
}
