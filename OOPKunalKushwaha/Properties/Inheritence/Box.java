package OOPKunalKushwaha.Properties.Inheritence;

public class Box {
 public static   double l;
    double w;
    double h;

    public Box(){
        l = -1;
        w = -1;
        h = -1;
    }
    public Box(double l, double w, double h){
        this.l=l;
        this.w=w;
        this.h=h;
    }
    public Box(Box old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }
    public void information(){
        System.out.println("Running the box");
    }
}
