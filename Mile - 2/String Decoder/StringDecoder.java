import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringDecoder {
    static String stringDecode(String s){
        StringBuffer sb=new StringBuffer();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='0'){
                sb.append((char)('A'+count-1));
                count=0;
            }
            else if(ch=='1'){
                count++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
        String s=inp.readLine();
        System.out.println(stringDecode(s));
    }

}
