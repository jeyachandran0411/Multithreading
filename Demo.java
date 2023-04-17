

class classA extends Thread{
    public void run(){
        try {
            for(int i=0;i<5;i++){
               int a=10,b=45;
               int c=a+b;
               System.out.println(c);
            }
        } catch (Exception e) {
           System.out.println(e);
        }
    }
 
}
class classB extends Thread{
    public void run(){
        try {
            for(int i=0;i<3;i++){
                int a=234,b=44;
                int c=a-b;

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Demo {

    public static void main(String[] args) {
       classA obj1=new classA();
       classB obj2=new classB();

       obj1.start();
       obj2.start();

       
    }

}
