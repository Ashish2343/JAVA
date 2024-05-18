package OOP;

 class Student {
     String name;
      int rolno;
     float percent;

     final String Universityname = "DTU";

     public int getRolno() {  // Getter
         return rolno;
     }
     public float setPercent(float percent1){   // Setter
         percent = percent1;
         return percent1;
     }

     public Student(){

     }
     public Student(String name, int rolno, float percent){
         this.name = name;
        this. rolno = rolno;
        this. percent = percent;
     }
 }
