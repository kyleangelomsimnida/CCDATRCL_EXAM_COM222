package Activity5;

import Activity5.MP2.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input height: ");
        double height = sc.nextDouble();
        System.out.print("Input width: ");
        double width = sc.nextDouble();

        System.out.println("Select Shape (Rectangle or Triangle) ");
        String Shape = sc.next();

        if(Shape.equals("Rectangle")){
        Rectangle rec = new Rectangle(height, width);
        System.out.println("Height of Rectangle is " + rec.getArea());
        }else if(Shape.equals("Triangle")){
            Triangle tri = new Triangle(height, width);
            System.out.println("Area of Triangle is " + tri.getArea());
        }
        

    }
}
