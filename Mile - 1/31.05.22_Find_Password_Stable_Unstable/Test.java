//https://tests.mettl.com/v2/authenticateKey/5106dfd
public class Test {
    public void frequency(int number,int[] result){
        for(int i=0;i<10;i++){
            result[i]=0;
        }
        int temp=0;
        while(number!=0){
            temp=number%10;
            if(temp<0) {
                temp = -temp;
            }
            result[temp]++;
            number=number/10;
        }
    }
    public boolean isStable(int number){
        int[] result = new int[10];
        frequency(number, result);
        int auxiliary = 0,status =1;
        for(int i=0;i<10 && status == 1;i++){
            if(result[i]!=0){
                if(auxiliary==0){
                    auxiliary=result[i];
                }
                else if(auxiliary!=result[i]){
                    status=0;
                }
            }

        }
        if(status==1){
            return true;
        }
        else{
            return false;
        }
    }
    public int findPassword(int input1,int input2,int input3,int input4,int input5){
            int[] numArr={input1,input2,input3,input4,input5};
            int sumStable=0,sumUnstable=0,password=0;
            for(int k=0;k<5;k++){
                if(isStable(numArr[k]))
                    sumStable=sumStable+numArr[k];
                else
                    sumUnstable=sumUnstable+numArr[k];
            }
            password=sumStable-sumUnstable;
            return password;
    }

    public static void main(String[] args) {
        Test ob=new Test();

        System.out.println(ob.findPassword(12,-1313,122,678,-898));
    }
}
