package OOP;

public class Static {
    String name;
   private static int rolno;
    float percent;
    static  int age;


    public Static (){

    } public Static(String name,int rolno,float percent){
        this.name=name;
        this.rolno =rolno;
        this.percent=percent;
        age++;
    }

    public static int  getRolno(){
        return rolno;
    }
}
