import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderWord {
    static int test(String s){
        int count=0;

        String str[]=s.split(" ");
        for(int i=0;i<str.length;i++){
            s=str[i];
            int max=0;
            boolean temp=true;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)>=max){
                    max=s.charAt(j);
                }
                else{
                    temp=false;
                    break;
                }
            }
            if(temp){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
        String str=inp.readLine();
        System.out.println(test(str));
    }

}
