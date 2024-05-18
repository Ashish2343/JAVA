package OOPKunalKushwaha.Properties.Polymorphism;

public class Overiding {
        public int a;

        public void meth2(){
                System.out.println("Mathod 2 in overiding");
        }

        class  B extends Overiding{
                public void meth3(){
                        System.out.println("method 3 in class B");
                }
        }
}
