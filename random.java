import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random rando = new Random();
        int num;
        num = rando.nextInt(1, 6);
        System.out.println(num);
    }
}
