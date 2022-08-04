//https://tests.mettl.com/authenticateKey/a05abbcf
public class Test {
    int evnOddDigitSum(int input1,String input2){
        int sum=0,temp;
        if(input2.equals("even")){
            while(input1!=0){
                temp=input1%10;
                if(temp%2==0)
                    sum+=temp;
                input1/=10;
            }
        }
        else{
            while(input1!=0){
                temp=input1%10;
                if(temp%2!=0)
                    sum+=temp;
                input1/=10;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Test ob=new Test();
        System.out.println(ob.evnOddDigitSum(9625,"odd"));

    }
}
