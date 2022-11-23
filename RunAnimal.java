import java.util.Scanner;
public class RunAnimal{

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
    String input = sc.nextLine();

    if (input.equalsIgnoreCase("B")) {
        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.makeSound();
    }
    else if (input.equalsIgnoreCase("C")){
        Cat c = new Cat();
        c.eat();
        c.sleep();
        c.makeSound();
    }
    else if (input.equalsIgnoreCase("D")){
        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.makeSound();
        sc.close();
    }

}
}

    

