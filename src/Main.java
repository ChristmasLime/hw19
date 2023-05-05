import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        System.out.println();
    }


    public static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(nums);
        int prewNum = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (num % 2 != 0 && num != prewNum) {
                System.out.println(num);
                prewNum = num;
            }
        }
        System.out.println();
    }

    public static void task3() {
        List<String> words = new ArrayList<>(List.of("asd", "dsa", "asd", "www", "wasd", "asd", "dds", "ssd"));
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
        System.out.println();


    }

    public static void task4() {

        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));
        Map<String, Integer> wordCount = new HashMap<>();
        for (String string : strings) {
            wordCount.put(string, wordCount.getOrDefault(string, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}