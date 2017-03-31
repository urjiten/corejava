package java.options;

import java.util.Scanner;

public class CalculateVolumn {

	public static void main(String[] args) {

		String shape = "hemisphere";
		Scanner s = new Scanner(System.in);
		CalculateVolumn cv = new CalculateVolumn();

		switch (shape) {

		case "cube":
			System.out.println("enter side ");
			double a = s.nextDouble();
			s.close();
			try {
				System.out.println("Volumn of Cube is " + cv.calculateCubeVolumn(a));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			break;

		case "cuboid":
			System.out.println("enter l,b and h for cuboid ");
			double l = s.nextDouble();
			double b = s.nextDouble();
			double h = s.nextDouble();
			s.close();
			try {
				System.out.println("volume of cuboid is " + cv.calculateCuboidVolumn(l, b, h));

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}

		case "hemisphere":
			System.out.println("enter radius of hemisphere ");
			double r = s.nextDouble();
			s.close();
			try{
				System.out.println("volume of hemisphere is "+ cv.calculateHemisphereVolume(r));
				
			}catch(Exception e){
				
				System.out.println(e.getMessage());
			}

		}

	}

	private double calculateHemisphereVolume(double r) throws Exception {

		if(r>0){
			double volume =(2*Math.PI*Math.pow(r, 3))/3;
			return volume;
			
		}else{
			throw new Exception("radius must be positive");
		}
	}

	public double calculateCubeVolumn(double a) throws Exception {
		if (a > 0) {
			return Math.pow(a, 3);
		} else {
			throw new Exception("side must be positive");
		}
	}

	public double calculateCuboidVolumn(double l, double b, double h) throws Exception {
		if (l > 0 && b > 0 && h > 0) {
			return l * b * h;
		} else {
			throw new Exception("all sides must be positive");
		}
	}

}
