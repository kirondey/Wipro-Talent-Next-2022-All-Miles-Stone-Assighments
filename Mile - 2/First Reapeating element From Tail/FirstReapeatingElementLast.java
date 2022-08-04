import java.util.HashSet;

public class FirstReapeatingElementLast{
    static int printFirstRepeating(int arr[])
    {
        // Initialize index of first repeating element
        int min = -1;

        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();

        // Traverse the input array from right to left
        for (int i=0; i<=arr.length-1; i++)
        {
            if(arr[i]<0 || arr[i]==0){

            }
            else {
                // If element is already in hash set, update min
                if (set.contains(arr[i]))
                    min = i;

                else   // Else add element to hash set
                    set.add(arr[i]);
            }

        }

        // Print the result
        if(set.size()==0){
            return 0;
        }
        if (min != -1)
            return arr[min];
        else
            //There are no repeating elements
            return arr[0];
    }
    public static void main(String[] args) {
        //int arr[] = {1,2,4,1,2,8};
        //int arr[]={-1,2,-3,-4,2,-5};
        //int arr[]={10,5,3,4,3,5,3,6};
        int arr[]={0,0,0,0,0};
        System.out.println(printFirstRepeating(arr));
    }
}
