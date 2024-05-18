package OOPKunalKushwaha.StaticExample;

public class Human {
    int age;
    String name;
    int salery;
   static int population;

   Human(int age, String name, int salery){
       this.age=age;
       this.name=name;
       this.salery=salery;
       Human.population += 1;
   }
}
