package taster;


import java.util.Scanner;

import com.app.shapes.BoundedShape;
import com.app.shapes.Circle;
import com.app.shapes.Rectangle;

public class Test1 {
	
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		BoundedShape[] shapes =new BoundedShape[2];
		System.out.println("Enter Circle Parameters as x y and Radius :");
		shapes[0]=new Circle(sc.nextInt(), sc.nextInt(), sc.nextDouble());
		System.out.println("Enter Rectangle Parameters as x y width and height");
		shapes[1]=new Rectangle(sc.nextInt(), sc.nextInt(), sc.nextDouble(), sc.nextDouble());
		
		for(BoundedShape s : shapes) {
			System.out.println();
			System.out.println(s);
			System.out.println("Area is Equal to "+s.area());
		}*/
	
		BoundedShape[] shapes={new Circle(4,5,10),new Rectangle(4,7,10,20),new Circle(4,5,10),new Rectangle(4,7,10,20)};
		//4 objects created
		for(BoundedShape s : shapes) {
			System.out.println(s +" Area is : "+ s.area());
		}
	}

}
