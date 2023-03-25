import javax.sound.midi.Soundbank;
import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] array = new Integer[100];
        System.out.print("Danh sách phần tử mảng: ");
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i] + "  ");
        }
        return array;
    }
}
