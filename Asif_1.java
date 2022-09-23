import java.util.Scanner;

public class Asif_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the names");

        String  n=input.next().toString();
        Asif_1 n1=new Asif_1 ();
        Asif_1 n2=new Asif_1(n);
    }
    Asif_1(){
        System.out.println("Unknown");
    }
    Asif_1(String a){
        System.out.println("Name = "+a);
    }
}

