package OOP.Inheritence.BOX;

public class inheritence {
 public static double l;
   double w;
   double h;

   inheritence(){    // In case of empty argument
       this.l =-1;
       this.w =-1;
       this.h =-1;
   }

   inheritence(double side){     // In case of 1 argument
       this.l = side;
       this.w =side;
       this.h = side;
   }
   inheritence(double l, double w, double h){     // In case of 3 argument
       this.l =l;
       this.w = w;
       this.h =h;
   }
}
