package OOPKunalKushwaha;

public class Class {
    public static void main(String[] args) {

     //   student student1 = new student();
//        student1.name = "Ashish";
//        student1.rno = 35;
//        System.out.println(student1.name);
//        System.out.println(student1.marks);

        student student2 = new student(36,"Ashutosh",38);
        System.out.println(student2.name);


    }
             }
    class student {
    int rno;
    String name;
    float marks;

    student(int rno, String name, float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
}
