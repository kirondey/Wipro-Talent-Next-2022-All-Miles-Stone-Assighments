import java.io.*;

public class TheStringDecoder
{
    public static String theStringDecode(String s){
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
        //String s=inp.readLine();
        String s="111111110111110111111111111011111111111101111111111111110";
        System.out.println(theStringDecode(s));
    }
}
