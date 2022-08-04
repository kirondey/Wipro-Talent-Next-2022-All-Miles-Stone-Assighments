//https://tests.mettl.com/v2/authenticateKey/cbe4c4da
public class Test {
    public void frequency(int []input1,int[] result){
        for(int i=0;i<10;i++){
            result[i]=0;
        }
        for(int i=0;i<input1.length;i++){
            int temp=0;
            while(input1[i]!=0){
                temp=input1[i]%10;
                if(temp<0) {
                    temp = -temp;
                }
                result[temp]++;
                input1[i]=input1[i]/10;
            }
        }
    }
    public int mostFrequentlyOccuringDigit(int []input1,int input){
        int [] result=new int[10];
        frequency(input1,result);
        int temp=0;
        for(int i=1;i<10;i++){
            if(result[i]>=result[temp]){
                temp=i;
            }
        }
        return temp;
    }



    public static void main(String[] args) {
        Test ob=new Test();
        int arr[]={1237,262,666,140};
        System.out.println(ob.mostFrequentlyOccuringDigit(arr,13));
    }
}
