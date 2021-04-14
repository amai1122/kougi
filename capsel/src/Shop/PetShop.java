package Shop;

import CatPac.Cat;
import DogPac.Dog;
import PetPac.Pet;

public class PetShop {

    public static void main(String[] args) {

        Pet myPet = new Pet();
        PetShop.buyPet(myPet);

        System.out.println("---");

        Cat myCat = new Cat();
        PetShop.buyPet(myCat);

        myCat = new Cat("アメリカンショートヘアー","オス", 0);
        PetShop.buyPet(myCat);

        System.out.println("---");

        Dog myDog = new Dog();
        PetShop.buyPet(myDog);

        myDog = new Dog("ゴールデンリトリバー","オス", 0);
        PetShop.buyPet(myDog);
    }

    private static void buyPet(Pet tPet){
        System.out.println(tPet.getSyurui()
                + "の"
                + tPet.getSeibetsu()
                + "、"
                + tPet.getToshi() + "歳を買いました。");

        tPet.eat();
        tPet.play();
    }

}
