import java.util.Arrays;

public class Anagram
{
    public static char[] toCharArray(String value)
    {
        return value.toCharArray();
    }

    public static char[] removeWhiteSpace(char[] array)
    {
        
        return new String(array).replace(" ", "").trim().toCharArray();
    }

    public static char[] toLowerCase(char[] array)
    {
        
        return new String(array).toLowerCase().toCharArray();
    }

    public static void sort(char[] arr)
    {
        Arrays.sort(arr);
    }


    public static boolean isEqual( char[] array1 , char[] array2)
    {
        return new String(array1).equals(new String(array2));
    }

    public static boolean isAnagram(String value1 , String value2)
    {
        char[] array1 = toLowerCase(removeWhiteSpace(toCharArray(value1)));
        char[] array2 = toLowerCase(removeWhiteSpace(toCharArray(value2)));
        sort(array1);
        sort(array2);
        return isEqual(array1, array2);
    
    }

    public static void main(String[] args)
    {
        String s1 = "I am Lord Voldemort";
        String s2 = "Tom Marvolo Riddle";
        System.out.println(isAnagram(s1, s2));
    }
}