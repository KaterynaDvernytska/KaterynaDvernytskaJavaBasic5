import java.util.Random;

public class Lesson5a1 {
    public static void main(String[] args) {

        int[] array = new int[5];
        Random random = new Random();
        for (int i= 0; i < array.length; i++){
            array[i] = random.nextInt( 10);
        }
        for (int i= 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
