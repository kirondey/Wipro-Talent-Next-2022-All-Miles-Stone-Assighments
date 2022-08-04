import java.util.Scanner;

public class FindKey {
    public static int key(int input1,int input2,int input3){
        String s1=Integer.toString(input1);
        String s2=Integer.toString(input2);

        int a=Integer.parseInt(String.valueOf(s1.charAt(1)));
        int b=Integer.parseInt(String.valueOf(s2.charAt(2)));
        int c=max(input3);
        return (a*b*c);

    }
    public static int max(int input)
    {
        int maxNo=Integer.MIN_VALUE;
        char ch[]=Integer.toString(input).toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(Integer.parseInt(String.valueOf(ch[i]))>maxNo)
            {
                maxNo=Integer.parseInt(String.valueOf(ch[i]));
            }
        }
        return maxNo;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int input3=sc.nextInt();
        System.out.println(key(input1,input2,input3));

    }
}
