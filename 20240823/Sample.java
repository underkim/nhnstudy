import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    
    public static void printArray(int[] array)
    {
        for(int i =0 ; i< array.length; i++)
        {
            System.out.print(array[i]+ " ");
        }
    }
    
    public static void printArray(int[][] matrix)
    {
        for(int[] arr : matrix)
        {
            for(int i : arr)
            {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }

  
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        for(int i : list){
            System.out.print(i);
        }

        int [] array1 = {3, 1 , 2};
        int [] array2 = array1.clone();

        Arrays.sort(array1);
        System.out.print(Arrays.copyOfRange(array1,0,2)[1]);
        
        System.out.println();

        for(String s: args)
        {
            System.out.println(s);
        }
    }
}
