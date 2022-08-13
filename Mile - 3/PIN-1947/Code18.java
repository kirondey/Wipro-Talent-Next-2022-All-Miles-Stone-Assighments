import java.io.*;

class Large{
    int large,occurbig;
    Large(int l1,int l2){
        large=l1;
        occurbig=l2;
    }
}

class Small{
    int small,occurSmall;
    Small(int s1,int s2){
        small=s1;
        occurSmall=s2;
    }
}

public class Code18 {
    static String userMain(int input1,int input2,int input3){
        Large l=findLarge(input1, input2, input3);
        Small s=findSmall(input1, input2, input3);

        StringBuffer sb=new StringBuffer();

        sb.append(s.small);
        sb.append(l.large);
        sb.append(s.occurSmall);
        sb.append(l.occurbig);

        return sb.toString();
    }

    static Large findLarge(int num,int num1,int num2){
        int l=0;
        int arr[]=new int[10];
        while(num>0){
            int r=num%10;
            arr[r]++;
            l=r>l?r:l;
            num/=10;
        }

        while(num1>0){
            int r=num1%10;
            arr[r]++;
            l=r>l?r:l;
            num1/=10;
        }

        while(num2>0){
            int r=num2%10;
            arr[r]++;
            l=r>l?r:l;
            num2/=10;
        }

        int count=0,max=0;
        for(int i=0;i<10;i++){
            if(arr[i]>=count){
                count=arr[i];
                max=i;
            }
        }

        return new Large(l,max);
    }

    static Small findSmall(int input1,int input2,int input3){
        int s=10;
        int arr[]=new int[10];
        while(input1>0){
            int r=input1%10;
            arr[r]++;
            s=r<s?r:s;
            input1/=10;
        }

        while(input2>0){
            int r=input2%10;
            arr[r]++;
            s=r<s?r:s;
            input2/=10;
        }

        while(input3>0){
            int r=input3%10;
            arr[r]++;
            s=r<s?r:s;
            input3/=10;
        }

        int count=Integer.MAX_VALUE,min=10;
        for(int i=1;i<10;i++){
            if(arr[i]!=0 && arr[i]<count){
                count=arr[i];
                min=i;
            }
        }

        return new Small(s, min);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
        int input1=Integer.parseInt(inp.readLine());
        int input2=Integer.parseInt(inp.readLine());
        int input3=Integer.parseInt(inp.readLine());

        System.out.println(userMain(input1, input2, input3));
    }
}