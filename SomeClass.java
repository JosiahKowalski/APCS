public class SomeClass 
{
            private int a, b;
            public SomeClass(int aValue, int bValue) 
              {
                        a = aValue;
                        b = bValue;
            }
            public void swap () 
              {
                        a = b;
                        b = a;
            }
            public void print () 
              {
                        System.out.println("a = " + a + ", and b = " + b);
              }
}
class Tester 
{
            public static void main(String[] args) 
               {
                        SomeClass swapObj = new SomeClass(20, 10);
                        swapObj.swap();
                        swapObj.print();
              }
}