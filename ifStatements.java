import java.util.*;
public class ifStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        if(age<0){
            System.out.println("You're not born yet!!");
        }
        else if(age>=65){
            System.out.println("You are a senior!");
        }
        else if(age>=18){
            System.out.println("You are an adult!");
        }
        else if(age==0){
            System.out.println("You're a babyy!");
        }
        else{
            System.out.println("You are a child!");
        }
        sc.close();
    }
}
