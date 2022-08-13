import java.util.Scanner;

public class HotelDouble{
    
    static int findRoomNumber(int[]input1,int[] input2,int[] input3,int input4){
        int[] arr4=new int[input4];
        int sum=0;
        //find 4th array
        for(int i=0;i<input4;i++){
            arr4[i]=input1[i]+input2[i]+input3[i];
        }
        
        //calculate room no
        int count=1;
        for(int i=0;i<input4;i++){
            int pos;
            if(arr4[i]%input4==0)
                pos=(arr4[i]%input4) +(input4-1);
            else
                pos=(arr4[i]%input4)-1;
                
            
            if(count%3==1)
               { sum=sum+input1[pos];
                count++;}
            else if(count%3==2)
                {sum=sum+input2[pos];
                count++;}
            else if(count%3==0)
                {sum=sum+input3[pos];
                count++;}
            
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] input1={10,33,5,40,120,98,1};
        int [] input2={121,78,21,32,91,340,72};
        int[]input3={65,320,72,84,32,843,40};
        int input4=7;
        // int[] input1={1,2,3,4};
        // int [] input2={2,3,4,5};
        // int[]input3={1,3,5,7};
        // int input4=4;
        System.out.println(findRoomNumber(input1, input2, input3, input4));
    }
}