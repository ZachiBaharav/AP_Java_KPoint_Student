

public class KPoint {

    // instance variables
    private double x;
    private double y;

    // Only do constructor afterwards.
    // Default constructor is not needed, UNLESS you have another one
    public KPoint()
    {
        // settign default to origion
        setPoint(0, 0);
    }
    // 3. Do 3rd, and then you also need default constructor
    // constructor
    public KPoint(double xVal, double yVal)
    {
        setPoint(xVal, yVal);
    }

    // 1. Do this first
    public void setPoint(double xVal, double yVal)
    {
        x = xVal;
        y = yVal;
        // later on do using this, and change the name of xVal and yVal to x,y
        this.x = xVal;
        this.y = yVal;
    }

    // 2. Do second
    public double getX(){ return x; }
    public double getY(){ return y; }


    // 4. Do 4th
    // Special function: toString
    public String toString()
    {
        return "("+x +"," + y +")" ;
    }

    // 5. Do 5th
    public double distO()
    {
        return Math.sqrt(x*x+y*y);
    }


    // 6.
    // Adding two points
    // p1.addTo(p2)
    public void addTo(KPoint p2)
    {
        x = x + p2.getX();
        y = y + p2.getY();
        /*
        x += p2.x;
        y += p2.y;
        */
    }

    // 7
    // alterntively
    public static KPoint addToStatic(KPoint p1, KPoint p2)
    {
        double xAdd = p1.getX()+p2.getX();
        double yAdd = p1.getY()+p2.getY();

        return new KPoint(xAdd,yAdd);
    }

    // ---------------------------------------
    // Homework


    /** Distance between two points
    * @param p2  The second point
    * @return   Distance as a double
    */

    public double distanceTo(KPoint p2)
    {
        // TODO
        return 0;

    }


    /** Slope between two points
    * @param p2  The second point
    * @return   Slope as a double
    * @precondition Slope is finite. Specifically, p1.getX() != p2.getx()
    */

    public double slope(KPoint p2)
    {
        // TODO
        return 0;
    }

    /** Stretch a point
    * @param s stretch factor. Can be negative or zero.
    * Stretch a point: newX=s*oldX  ; newY=s*oldY
    */
    
      
    public void stretch(double s)
    {
        // TODO
    }

    /** Subtract two points
    * @param p1 First points
    * @param p2 Second points
    * @return  p1-p2
    *
    */
    public static KPoint subStatic(KPoint p1, KPoint p2)
    {
        // TODO
        return new KPoint(0,0);
    }

    
    public String stringIt()
    {
        return "("+x +"," + y +")" ;
    }

    
}

    
    
