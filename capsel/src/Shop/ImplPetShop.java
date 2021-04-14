package Shop;

import CatPac.Cat;
import DogPac.Dog;
import PetPac.Pet;

public class ImplPetShop {

	public static void main(String[] args) {
		Pet myPet = new Pet();
		ImplPetShop.buyPet(myPet);

		System.out.println("---");

		Cat myCat = new Cat();
		ImplPetShop.buyPet(myCat);

		myCat = new Cat("アメリカンショートヘアー", "オス", 0);
		ImplPetShop.buyPet(myCat);

		System.out.println("---");

		Dog myDog = new Dog();
		ImplPetShop.buyPet(myDog);

		myDog = new Dog("ゴールデンリトリバー", "オス", 0);
		ImplPetShop.buyPet(myDog);
	}

	static void buyPet(Pet tPet) {
		System.out.println(tPet.getSyurui()
				+ "の"
				+ tPet.getSeibetsu()
				+ "、"
				+ tPet.getToshi() + "歳を買いました。");

		tPet.eat();
		tPet.play();
	}
}
