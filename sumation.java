package sum_path;

public class sumation 
{
    public static int SumPath(int[] arr1, int[] arr2) 
    {
        int s1=0, s2=0, result=0;
        int i=0, j=0;
        int x = arr1.length, y = arr2.length;

        while (i < x && j < y)
        {
            if (arr1[i] < arr2[j]) 
            {
                s1 += arr1[i++];
            }
            else if (arr1[i] > arr2[j]) 
            {
            	s2 += arr2[j++];
            }
            else 
            {
                result += Math.max(s1, s2) + arr1[i];
                s1 = 0;
                s2 = 0;
                i++;
                j++;
            }
        }

        
        while (i<x)
        {
            s1 += arr1[i++];
        }

       
        while (j<y) 
        {
            s2 += arr2[j++];
        }

        
        result += Math.max(s1, s2);

        return result;
    }

    public static void main(String[] args)
    {
        int[] arr1 = {3, 6, 7, 8, 10, 12, 15, 18, 100};
        int[] arr2 = {1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50};
        System.out.println("Maximum sum path: " + SumPath(arr1, arr2));
    }
}