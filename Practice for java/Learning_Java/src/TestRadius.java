
public class TestRadius {

	public static void main(String[] args) {
		
		Sphere s = new Sphere();
		s.setRadius(6);
		
		Sphere u = new Sphere(7);
		System.out.println("Wheter both identical "+s.isIdentical(u));
		System.out.println("check area of "+s.computeArea()+" check perimeter "+s.computePerimeter());
		System.out.println("check area of "+u.computeArea()+" check perimeter "+u.computePerimeter());
		
	}

}
