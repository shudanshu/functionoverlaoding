import java.util.*;
public class function2 {
    public static void printHellosudhanshu() {
        System.out.println("hello sudhanshu");
        System.out.println("hello sudhanshu");
        System.out.println("hello sudhanshu");
        System.out.println("hello sudhanshu");
        
    }

    public static void  calSum(){
        try (Scanner sc = new Scanner(System.in)) {
            int a =  sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        calSum();
        
    }
}
