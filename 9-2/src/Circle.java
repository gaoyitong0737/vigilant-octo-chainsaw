public class Circle {

 private double radius = 1;

 private static int numberOfObjects = 0;

 public Circle () {

           numberOfObjects++;

  }

  public Circle (double radius) {

           this.radius = radius;

           numberOfObjects++;

  }

  public static int getNumberOfObjects() {

           return numberOfObjects;

  }

      public static void main(String[] args) {

         System.out.println("圆的个数="+Circle.numberOfObjects);

           Circle c1 = new Circle ();

         System.out.println("圆的个数="+c1.numberOfObjects);

           Circle c2 = new Circle (5);

           c1.radius = 9;

           System.out.println("圆的个数="+c1.numberOfObjects);

           System.out.println("圆的个数="+c2.getNumberOfObjects());

     }

}