class A
  {
      void m1()
      {
          System.out.println("hello m1 off A class");
        }
   }
class B extends A
  {
     void m2()
    {
        System.out.println("method of m2");
    }
    void m1()
     {
           System.out.println("hello form m1 of class B");
      }
 public static void main(String args[])
    {
         A a1=new B();
           A a=a1;
         a.m1();
         B z=(B)a1;
       z.m2();
       }
}