import java.util.ArrayList;
import java.util.Collections;

public class Pin{
    static String findPin(int input1,int input2,int input3){
        ArrayList<Integer> list=new ArrayList<>();
        while(input1!=0){
            list.add(input1%10);
            input1=input1/10;
        }
        while(input2!=0){
            list.add(input2%10);
            input2=input2/10;
        }
        while(input3!=0){
            list.add(input3%10);
            input3=input3/10;
        }
        StringBuffer pin = new StringBuffer ();
        pin.append(Collections.min(list));
        pin.append(Collections.max(list));
        pin.append(lowFreq(list));
        pin.append(highestFreq(list));

        return pin.toString();



    }
    static int highestFreq(ArrayList<Integer> list){
        int[] freq={0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<list.size();i++){
            for(int j=0;j<10;j++){
                if(j==list.get(i)){
                    freq[j]++;
                }
            }
        }
        int highestF=freq[0];
        int count=0;
        for(int i=1;i<10;i++){
            if(highestF<=freq[i]){
                highestF=freq[i];
                count=i;
            }
        }
        return count;

    }

    static int lowFreq(ArrayList<Integer> list){
        int[] freq={0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<list.size();i++){
            for(int j=0;j<10;j++){
                if(j==list.get(i)){
                    freq[j]++;
                }
            }
        }

        int count=Integer.MAX_VALUE,min=10;
        for(int i=0;i<10;i++){
            if(freq[i]!=0 && freq[i]<count){
                count=freq[i];
                min=i;
            }
        }

        return min;

    }
    public static void main(String[] args) {
        int input1=1274;
        int input2=5283;
        int input3=1937;
        // int input1=8530;
        // int input2=5620;
        // int input3=7532;
        System.out.println(findPin(input1, input2, input3));
    }


}