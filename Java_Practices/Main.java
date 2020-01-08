import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        System.out.println("this is user number: "+ userNumber);

        String userInput = sc.next();
        System.out.println("Enter your preferred car here:" + userInput);

        Car myCar = new Car(25.5,
                "1BC32E",
                Color.BLUE, true);

        Car sallyCar = new Car(13.9,
                "3D2OBN",
                Color.BLACK,
                false);

        System.out.println("My Car's License Plate: " + myCar.licensePlate);
        System.out.println("Sally's License Plate: " + sallyCar.licensePlate);

        // Create changePaintColor() method
        System.out.println(myCar.paintColor.toString());  // change the type to string with toSting()
        myCar.changePaintColor(Color.RED);
        System.out.println(myCar.paintColor.toString());

        double myCarSpeed = 50;
        myCarSpeed = myCar.speedingUp(myCarSpeed);
        System.out.println(myCarSpeed);
    }

}
