import java.util.Arrays;
public class sorting {
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};
        Arrays.sort(numbers);
        System.out.println("sorted numbers");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            
        }

        String array[]={"rsm","sham","jam","fam"};
        Arrays.sort(array);
        System.out.println("sorted names");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

}
