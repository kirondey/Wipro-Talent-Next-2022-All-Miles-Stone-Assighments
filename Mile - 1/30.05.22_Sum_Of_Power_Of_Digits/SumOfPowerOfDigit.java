//https://tests.mettl.com/v2/authenticateKey/92437794
public class SumOfPowerOfDigit {
    public int sumOfPowerOfDigit(int input1){
    String s=String.valueOf(input1);
    double sum=0;
    for(int i=0;i<s.length()-1;i++){
        int b=Integer.parseInt(String.valueOf(s.charAt(i)));
        int p=Integer.parseInt(String.valueOf(s.charAt(i+1)));
        sum=sum+Math.pow(b,p);
    }
    if(s.charAt(s.length()-1)==0){

    }
    else
        sum=sum+1;

   // throw new UnsupportedOperationException("sumOfPowerOfDigits(int input1)");
    int value=(int)Math.round(sum);
    return value;
    }

    public static void main(String[] args) {
        int input1=Integer.parseInt(args[0]);
        SumOfPowerOfDigit obj=new SumOfPowerOfDigit();
        int result=obj.sumOfPowerOfDigit(input1);
        System.out.println(result);

    }
}
