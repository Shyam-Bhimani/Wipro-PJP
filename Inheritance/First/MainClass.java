public class MainClass {
	    public static void main(String[] args) {
	        Animal animal = new Animal();
	        Bird bird = new Bird();
	         
	        System.out.println();
	         
	        animal.sleep();
	        animal.eat();
	         
	        bird.sleep();
	        bird.eat();
	        bird.fly();
	    }
	}