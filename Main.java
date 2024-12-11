import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    // Create objects and test your classes in here
    // Point2D p1 = new Point2D();
    // Point2D p2 = new Point2D();

    // p1.setX(5);
    // p1.setY(4);

    // p2.setX(5);
    // p2.setY(2);

    // Point2D p1 = new Point2D();
    // System.out.println("Enter two numbers");
    // int in_x = sc.nextInt();
    // int in_y = sc.nextInt();

    // p1.setX(in_x);
    // p1.setY(in_y);

    // System.out.println("You made a point at (" + p1.getX() + "," + p1.getY() + ")");


    Dog dog = new Dog(); 
    
    dog.setBreed("poodle");
    dog.setSize(10);
    dog.setFurColor("brown");

    System.out.println("The dog's color is " + dog.getBreed());



  }
}
