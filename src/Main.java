import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        oddNumbers(nums);
        evenNumbers(nums);
        uniqueWords(List.of("test", "tes", "TEST", "test", "teS", "TESt", "tes", "te"));
        numberOfDuplicates(List.of("test", "tes", "TEST", "test", "teS", "TESt", "tes", "te"));
    }

    private static void oddNumbers(List<Integer> numbers) {
        System.out.println("Нечётные числа");
        for (Integer num : numbers) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
        System.out.println();
    }

    private static void evenNumbers(List<Integer> numbers) {
        System.out.println("Чётные числа");
        Set<Integer> set = new TreeSet<>(numbers);
        for (Integer num : set) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println();
    }

    private static void uniqueWords(List<String> words) {
        System.out.println("Уникальные слова");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println();
    }

    private static void numberOfDuplicates(List<String> words) {
        System.out.println("Количество дублей из предыдущего");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 10 == 2 || entry.getValue() % 10 == 3 || entry.getValue() % 10 == 4) {
                System.out.println(entry.getKey() + " встречается " + entry.getValue() + " раза.");
            } else {
                System.out.println(entry.getKey() + " встречается " + entry.getValue() + " раз.");
            }
        }
    }
}
