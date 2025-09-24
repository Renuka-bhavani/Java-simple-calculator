import java.util.*;
public class calculator {


    void add(int a, int b){

        int c= a+b;
        System.out.println("result is" +c);

    }
     void sub(int a, int b){
         int c= a-b;
        System.out.println("result is" +c);

    }
     void mul(int a, int b){
         int c= a*b;
        System.out.println("result is" +c);

    }
     void div(int a, int b){

         int c= a/b;
        System.out.println("result is" +c);
    }

    public static void main (String[]  args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a");
       
         String choice;

         calculator cc = new calculator();
        do{
             
             System.out.println("Enter a");
        int a=sc.nextInt();
         System.out.println("Enter b");
        int b=sc.nextInt();

         System.out.println("Enter operation add is 1, sub is 2, mul is 3, div is 4");

         int op=sc.nextInt();
         if(op==1){

            cc.add(a, b);

         }
         
         else if(op==2){
            cc.sub(a, b);
            
         }
         else if(op==3){
         cc.mul(a, b);
         }
         else if(op==4){
            cc.div(a, b);
         }
        
        System.out.println("Do yo want to continue yes/no");

          choice = sc.next();
         
           

        }while (choice.equalsIgnoreCase("yes"));


        sc.close();
        System.out.println("calculator exit");


        


    }
  
  

    
}
