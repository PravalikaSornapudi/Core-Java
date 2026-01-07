public class Variables {
    public static void main(String[] args) {

        //declaration of variables
        //assigning values to variables

        int age = 20;
        int year = 2026;
        int quantity = 1;

        double price = 19999.99;
        double gpa = 8.03;
        double temperature = 20.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = true;
        boolean isOnline = true;

        String name = "Pravalika";
        String food = "Biryani";
        String email = "fake123@gmail.com";
        String car = "Mercedes";
        String color = "Green";


        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old.");
        System.out.println("Your GPA is: "+gpa);
        System.out.println("Your grade is: "+grade);
        
        System.out.println("Your choice is a "+color+" "+year+" "+car);

        System.out.println("The price is: "+currency+price);

        if(forSale){
            System.out.println("There is a "+car+" for sale.");
        }
        else{
            System.out.println("The "+car+" is not for sale.");
        }

        //HomeWork

        String name1 = "Pravalika";
        int gpa1 = 8;
        double pi = 3.14159;
        char gender = 'F';
        boolean isAdmin = false;

        System.out.println("Your name is "+name1+ ". You're having a gpa of "+gpa1+". The value of pi is "+pi+". Your gender is "+gender+".");

        if(isAdmin){
            System.out.println("You have admin access.");
        }
        else{
            System.out.println("You don't have admin access.");
        }

        

    }
}
