class AddOver{

              public  int add( int a, int b ){

                     return a+b;

              }

              public int add( int a, int b, int c ){

                     return a+b+c ;

              }

}

public class Blank2{

       public static void main(String[] args){

              AddOver a= new AddOver();

              System.out.println(a.add(1,2));

              System.out.println(a.add(1,2,3));

       }

}