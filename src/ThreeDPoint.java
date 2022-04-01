import java.nio.channels.Pipe;

public class ThreeDPoint extends Point{
    private int z;

    public ThreeDPoint(String label, int x, int y, int z){
        super(label, x, y);
        this.z = z;
    }

    public String toString(){
        return super.toString() + ", z = " + z;
    }

    public boolean equals(Object obj){
        ThreeDPoint other = (ThreeDPoint) obj;
        Point newPoint = other;
        if(this.z == other.z && super.equals(newPoint)){
            return true;
        }
        return false;
    }
}
