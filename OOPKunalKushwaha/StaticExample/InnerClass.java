package OOPKunalKushwaha.StaticExample;

public class InnerClass {
   static class test{
        String name;
        public test(String name){
            this.name = name;
        }

    }
    public static void main(String[] args) {
        test a = new test("Ashish");
        test b = new test("Anish");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
