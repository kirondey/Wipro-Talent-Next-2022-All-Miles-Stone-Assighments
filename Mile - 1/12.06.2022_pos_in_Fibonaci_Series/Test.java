//https://tests.mettl.com/v2/authenticateKey/1qqnmuxla8
public class Test {
    public int findPos(int input1){
        if(input1<=1){
            return (input1+1);
        }
        int fs=1,pos=3,a=1,b=0;
        while(fs<input1){
            b=fs;
            fs=fs+a;
            a=b;
            pos++;
        }
        return pos;
    }

    public static void main(String[] args) {
        Test ob=new Test();
        System.out.println(ob.findPos(2));
    }
}
