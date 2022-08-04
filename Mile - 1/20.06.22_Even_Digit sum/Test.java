//https://tests.mettl.com/authenticateKey/b55d1714
public class Test {
    int evnDigitSum(int input1){
        int sum=0,temp;
        while(input1!=0){
            temp=input1%10;
            if(temp%2==0)
                sum+=temp;
            input1/=10;
        }
        return sum;

    }


    public static void main(String[] args) {
        Test ob=new Test();
        System.out.println(ob.evnDigitSum(2134));

    }
}
