import java.util.*;

public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public static void main(String[] args) {
        String[] arr = new HarekCity().createEmptyNameArray();
        System.out.println(Arrays.toString(arr));

        int[] ageArray = new HarekCity().createAgeArray(10, 20, 30, 40);
        System.out.println(Arrays.toString(ageArray));
    }
}