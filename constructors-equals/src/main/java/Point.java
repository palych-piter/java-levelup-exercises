/**
 * Created by Andrey on 9/29/2015.
 */
public class Point {

    public int x,y;

    //constructor
    public Point(int x, int y){
        //this.x - Class field
        //x - Constructor parameter
        //"this" keyword is used to not mix
        //class fields and constructor parameters
        this.x = x;
        this.y = y;
    };

    @Override
    public boolean equals(Object o){
        //If classes for objects are different - return false
        if (!o.getClass().equals(Point.class))
            return false;
        //?????????? ?????!!!???
        Point p = (Point) o;
        return this.x == p.x && this.y == p.y;
    }

    public static void main(String[] args) {
        Point point1 = new Point(10,20);
        Point point2 = new Point(10,20);
        System.out.println("Compare points: " +
                (point1 == point2));
        System.out.println("Compare points by equals: " +
                point1.equals(point2));
    }

}
