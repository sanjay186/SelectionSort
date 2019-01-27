
import java.util.*;

public class SSort
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int N = in.nextInt();
int x = in.nextInt();

int[] array = new int[N];
for(int i = 0; i < N; i++)
array[i] = in.nextInt();

sort(array,x);
}

public static void sort(int[] array, int numIterations)
{
for(int i = 0; i < numIterations; i++)
{
int min = i;
for(int j = i+1; j < array.length; j++)
{
if(array[j] < array[min])
min = j;
}

if(i != min)
{
int temp = array[i];
array[i] = array[min];
array[min] = temp;
}
}

printArray(array);
}
public static void printArray(int[] array)
{
for(int elem : array)
System.out.print(elem + " ");

System.out.println();
}
}

