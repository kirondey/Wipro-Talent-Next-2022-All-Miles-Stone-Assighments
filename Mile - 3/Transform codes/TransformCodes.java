import java.util.ArrayList;


public class TransformCodes {
    public static String[] transformCodes(int[] input1)
    {
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<input1.length;i++)
        {
            int divide=0;
            String answer="";
            int len=String.valueOf(input1[i]).length();
            if(len==6)
                answer=answer+'C';
            else
                answer=answer+'W';

            if(input1[i]==0)
                answer=answer+'Z';
            else if(input1[i]==1)
                answer=answer+'O';
            else if(isPrime(input1[i])==true)
                answer=answer+'p';
            else if(isPrime(input1[i])==false)
                answer=answer+'N';
            
            String singleDigit=String.valueOf(singleDigitSum(input1[i]));
            answer=answer+singleDigit;
            if(isEven(input1[i])==true)
            {
                divide=input1[i]/2;
            }
            else
            {
                divide=(input1[i]-1)/2;
            }
            answer=answer+String.valueOf(divide);
            list.add(answer);
        }
        String output[]=new String[list.size()];
        for(int i=0;i<list.size();i++)
        {
            output[i]=list.get(i);
        }
        return output;
    // return answer;
    }
    public static boolean isPrime(int input)
    {
        if(input<=1)
            return false;
        for(int i=2;i<=Math.sqrt(input);i++)
        {
            if(input%i==0)
                return false;
        }
        return true;
    }

    public static int singleDigitSum(int input)
    {
        int sum=0;
        while (input>0||sum>9) 
        {
            if(input==0)
            {
                input=sum;
                sum=0;
            }
            sum+=input%10;
            input/=10;
        }
        return sum;
    }

    public static boolean isEven(int input)
    {
        if(input%2==0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        // int array[]={12};
        int array[]={123456,1234567};
        String output[]=transformCodes(array);
        for (String string : output) {
            System.out.print(string+" ");
        }
    }
}