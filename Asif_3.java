import java.util.Scanner;

public class Asif_3{
    int length,breadth;
    int m1(){
        return length*breadth;
    }
    public Asif_3(int l,int b){

        length=l;
        breadth=b;
    }
    public Asif_3(int l){

        length=l;
        breadth=l;
    }
    public Asif_3(){

        length=0;
        breadth=0;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the integers");
        int a= input.nextInt();
        int b= input.nextInt();
        Asif_3 ob1=new Asif_3();
        Asif_3 ob2=new Asif_3(a, b);
        Asif_3 ob3=new Asif_3(a);
        System.out.println("Area Of Rectangle = "+ob1.m1());
        System.out.println("Area Of Rectangle = "+ob2.m1());
        System.out.printf("Area Of Rectangle "+ob3.m1());


    }
}

