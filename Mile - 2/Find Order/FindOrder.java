import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindOrder {
    static String test(String s1,String s2){
        StringBuffer sb=new StringBuffer();

        int f=incrOrDec(s1);
        if(f==-1){
            return "invalid";
        }

        if(f==0){
            int count=0;
            for(int i=0;i<s2.length();i++){
                int j=i+1;
                while(j<s2.length() && s2.charAt(i)<=s2.charAt(j)){
                    j++;
                }

                if(j!=s2.length()){
                    count=(j-i)+1;
                    break;
                }
            }

            sb.append("<Increasing>:");
            sb.append(count);
        }
        else{
            int count=0;
            for(int i=0;i<s2.length();i++){
                int j=i+1;
                while(j<s2.length() && s2.charAt(i)>=s2.charAt(j)){
                    j++;
                }

                if(j!=s2.length()){
                    count=(j-i)+1;
                    break;
                }
            }

            sb.append("<Decreasing>:");
            sb.append(count);
        }

        return sb.toString();
    }

    static int incrOrDec(String s){
        if(s.charAt(0)<=s.charAt(1)){
            int i=1;
            while(i<s.length() && s.charAt(i-1)<=s.charAt(i)){
                i++;
            }

            if(i!=s.length()){
                return -1;
            }

            return 0;
        }

        else{
            int i=1;
            while(i<s.length() && s.charAt(i-1)>=s.charAt(i)){
                i++;
            }

            if(i!=s.length()){
                return -1;
            }

            return 1;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
        String s1=inp.readLine();
        String s2=inp.readLine();

        System.out.println(test(s1, s2));
    }

}
