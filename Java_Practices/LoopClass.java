import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;

public class LoopClass {
    public static void main(String[] args) {
        System.out.println("While loop");
        int x = 5;
        while(x<=10)
        {
            System.out.println("Current x:" + x);
            x = x+1;
        }
        System.out.println("For loop");
        for(int i=3; i>0; i--)
        {
            System.out.println("Current i:" + i);
        }

    }
}
