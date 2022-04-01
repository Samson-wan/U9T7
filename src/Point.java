public class Point{
    private int x;
    private int y;
    private String label;

    public Point(String label, int x, int y){
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public String toString(){
        return "Point " + label  + " is at x = " + x + ", y = " + y;
    }

    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Point)){
            return false;
        }

        Point other = (Point) obj;
        return (this.x == other.x) && (this.y == other.y);
    }
}