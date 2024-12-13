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


    // Problem 1 - Person 

    // Person p = new Person();

    // System.out.println("Enter the person's first name: ");
    // String fName = sc.nextLine();

    // System.out.println("Enter the person's last name: ");
    // String lName = sc.nextLine();

    // System.out.println("Enter the person's age: ");
    // int personAge = sc.nextInt();

    // System.out.println("Enter the person's social security number: ");
    // int personSSN = sc.nextInt();

    // p.setFirstName(fName);
    // p.setLastName(lName);
    // p.setAge(personAge);
    // p.setSocialNum(personSSN);

    // System.out.println(p.toString());



    // Problem 2 - Oven
    Oven O = new Oven();
    O.setmaxTemp(450);
    O.setcurrentTemp(70);
    String input = "";
    while (!input.equals("q"))
    {
      System.out.println(O);
      System.out.println("To preheat the oven enter \"p\", to turn the oven off enter \"o\", to restart enter \"r\", to quit enter \"q\" ");
      input = sc.nextLine();

      if (input.equals("p"))
      {
        System.out.println("Enter the temperature to preheat the oven to: ");
        int temp = sc.nextInt();
        O.preheat(temp);
        sc.nextLine();
      }

      else if (input.equals("o"))
      {
        O.turnOff();
        System.out.println("Turning the oven off.");
      }

      else if (input.equals("r"))
      {
        
      }
    }











  }
}
