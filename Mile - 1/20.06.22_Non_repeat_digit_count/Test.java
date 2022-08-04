//https://tests.mettl.com/v2/authenticateKey/e46500f5
public class Test {
    int nonRepeatDigitCount(int input1){
        int c=0,digit;
        int digFreq[]={0,0,0,0,0,0,0,0,0,0};
        while(input1!=0){
            digit=input1%10;
            digFreq[digit]++;
            input1/=10;
        }
        for(int i=0;i<10;i++){
            if(digFreq[i]==1)
                c++;
        }
        return c;
    }


    public static void main(String[] args) {
        Test ob=new Test();
        System.out.println(ob.nonRepeatDigitCount(108));

    }
}
