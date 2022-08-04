//https://tests.mettl.com/v2/authenticateKey/1vzawmc2yo
public class Test {
    public int sumOfSumsOfDigits(int input1){
        int sum=0;
        String s=String.valueOf(input1);
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                sum=sum+Integer.parseInt(String.valueOf(s.charAt(j)));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Test ob=new Test();
        System.out.println(ob.sumOfSumsOfDigits(582109));
    }
}
