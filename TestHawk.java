
public class TestHawk {
		public static void main(String[] args) {
			Animal myHawk = new Hawk();

			myHawk.label();
			myHawk.move();
			myHawk.eat();
		}
	}

	class TestDog {
		public static void main(String[] args) {
			Animal myDog = new Dog();

			myDog.label();
			myDog.move();
			myDog.eat();
		}
	}
