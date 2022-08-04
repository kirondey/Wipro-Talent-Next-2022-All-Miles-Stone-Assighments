//https://tests.mettl.com/v2/authenticateKey/1qvrno4zcw
public class Test {
    public int reducedArrCount(int[] input1,int input2){
        int sum=0;
        if(input2%2==1)
        {
            for(int i=0;i<input2;i++)
            {
                if(i%2==1)
                {
                    input1[i]=1;
                }
            }
        }
        else
        {
            for(int i=0;i<input2;i++)
            {
                if(i%2==0)
                {
                    input1[i]=0;
                }
            }
        }
        for(int i=0;i<input2;i++)
        {
            sum+=input1[i];
        }
        int output=singleDigitSum(sum);
        return output;
    }
    public static int singleDigitSum(int n)
    {
        int sum=0;
        while(n>0||sum>9)
        {
            if(n==0)
            {
                n=sum;
                sum=0;
            }
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Test ob=new Test();
        int []arr={5,6,7,8,9};
        System.out.println(ob.reducedArrCount(arr,5));

    }
}
