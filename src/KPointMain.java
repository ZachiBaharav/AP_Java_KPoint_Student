/*
The goal of this program is to give you a general feel for classes, methods,
constructors, static functions.

we will get to classes later on again!

 */

public class KPointMain {


    // function main: We saw this before
    public static void main(String[] args)
    {

        // creating a new object
        KPoint p1 = new KPoint();

        p1.setPoint(1,2);
        System.out.println("P1 point is at:("+p1.getX() + "," + p1.getY() + ")");


        // Specific constructor
        // Once we do that, we have to have default one as well!
        KPoint p2 = new KPoint(5,6);
        System.out.println("KPoint(5,6):("+p2.getX() + "," + p2.getY() + ")");

        KPoint p3 = new KPoint();
        System.out.println("KPoint():("+p3.getX() + "," + p3.getY() + ")");


        System.out.println("Using toString. p3=" +p3);


        System.out.println("Distance from p1 to origion= "+p1.distO());
        System.out.printf("Distance to origion, formatted= %5.2f\n", p1.distO());


        // using static method
        System.out.println("Points added in static: "+ KPoint.addToStatic(p1,p2) );

        // using normal
        p1.addTo(p2);
        System.out.println("Points added in new method: "+ p1 );


        // The below is homework
        System.out.println("Distance between two points: "+ p1.distanceTo(p3) );
        System.out.println("Slope between two points: "+ p1.slope(p3) );
        System.out.print("Stretch" + p1 + " by 2:");
        p1.stretch(2) ;
        System.out.println(p1);
        System.out.println("Points subtracted in static: "+ KPoint.subStatic(p1,p2) );

        

    }


}