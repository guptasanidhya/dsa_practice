import java.util.*;
public class min_max_01 {
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a==b && a==c){
        System.out.println("Equal");
    }
    else{
        max(a,b,c);
    min(a,b,c);
    }

}
public static void max(int a ,int b,int c) {
    if (a > b) {
        if (a > c) {
            System.out.println(a + " is greatest number");
        } else {
            System.out.println(c + " is greatest");
        }

    } else if (b > a) {
        if (b > c) {
            System.out.println(b + " is greatest");
        } else {
            System.out.println(c + " is greatest");
        }
    }

}
public static void min(int a ,int b,int c){
    if(a<b){
        if(a<c){
            System.out.println(a+" is the smallest");
        }
        else{
            System.out.println(c+ " is smallest");

    }
    }
    else if(b<a){
    if(b<c){
        System.out.println(b+ " is smallest");
    }
    else{
        System.out.println(c+" is smallest");
    }
    }

}

}
