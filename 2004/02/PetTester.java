import java.util.ArrayList;

public class PetTester {
    
    public static void main(String[] args) {
        
        Dog dog1 = new Dog("Fido");
        Cat cat1 = new Cat("Waldo");
        LoudDog dog2 = new LoudDog("Perry");

        ArrayList<Pet> allPets = new ArrayList<Pet>();

        allPets.add(dog1);
        allPets.add(dog2);
        allPets.add(cat1);

        Kennel myKennel = new Kennel(allPets);

        myKennel.allSpeak();

    }

}