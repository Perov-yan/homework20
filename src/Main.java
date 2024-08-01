import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("task 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        test1(nums);
        System.out.println(" ");

        System.out.println("task 2");
        test2(nums);
        System.out.println(" ");

        System.out.println("task 3");
        List<String> text = new ArrayList<>(List.of("напишите","напишите","мир","Дима","Дима","привет","привет","Иван","Иван"));
        test3(text);
        System.out.println(" ");

        System.out.println("task 4");
        List<String> words = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        test4(words);

    }

    public static void test1 (List<Integer> nums){
        for (int num : nums){
            if (num % 2 != 0){
                System.out.print(" " + num);
            }
        }
    }

    public static void test2(List<Integer> nums){
        nums = new ArrayList<>(new HashSet<>(nums));
        Collections.sort(nums);
        for (int num : nums){
            if (num % 2 == 0){
                System.out.print(" " + num);
            }
        }
    }

    public static void test3(List<String> text){
        Set<String> uniqueWord = new HashSet<>(text);
        System.out.print(uniqueWord);

    }

    public static void test4(List<String> words){
        Set<String> uniqueWords = new HashSet<>(words);
        for (String uniqueWord : uniqueWords){
            int totalUnicquesItem = 0;
            for (String word : words){
                if (word.equals(uniqueWord)){
                    totalUnicquesItem = totalUnicquesItem + 1;
                }
            }
            System.out.print(totalUnicquesItem);
        }
    }

}
