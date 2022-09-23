import java.util.Scanner;
public class Asif_2{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String n=input.next().toString();
        Asif_2 obj1=new Asif_2();
        Asif_2 obj=new Asif_2(n);
    }
    Asif_2(){
        System.out.println("I love programming languages");
    }
    Asif_2(String a){
        System.out.println("I love "+a);
    }

}
