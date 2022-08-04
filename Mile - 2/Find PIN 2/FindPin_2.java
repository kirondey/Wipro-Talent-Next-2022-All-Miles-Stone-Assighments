import java.util.ArrayList;
import java.util.Scanner;

public class FindPin_2 {
    public static int pinPart_2(int input1,int input2,int input3,int input4)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> maxArray=new ArrayList<>();
        ArrayList<Integer> minArray=new ArrayList<>();

        arr.add(input1);
        arr.add(input2);
        arr.add(input3);

        for(int i=0;i<arr.size();i++)
        {
            maxArray.add(max(arr.get(i)));
            minArray.add(min(arr.get(i)));
        }

        int pin=((maxArray.get(0)*minArray.get(0))*(maxArray.get(1)*minArray.get(1))*(maxArray.get(2)*minArray.get(2)))-input4;

        return pin;
    }
    public static int max(int input)
    {
        int maxNo=Integer.MIN_VALUE;
        char ch[]=Integer.toString(input).toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(Integer.parseInt(String.valueOf(ch[i]))>maxNo)
            {
                maxNo=Integer.parseInt(String.valueOf(ch[i]));
            }
        }
        return maxNo;

    }
    public static int min(int input)
    {
        int minNo=Integer.MAX_VALUE;
        char ch[]=Integer.toString(input).toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(Integer.parseInt(String.valueOf(ch[i]))<minNo)
            {
                minNo=Integer.parseInt(String.valueOf(ch[i]));
            }
        }
        return minNo;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int input3=sc.nextInt();
        int input4=sc.nextInt();

        System.out.println(pinPart_2(input1,input2,input3,input4));
    }
}
