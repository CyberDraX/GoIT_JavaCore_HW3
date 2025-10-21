import java.util.*;

public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public static void main(String[] args) {
        String[] arr = new HarekCity().createEmptyNameArray();
        System.out.println(Arrays.toString(arr));
    }
}