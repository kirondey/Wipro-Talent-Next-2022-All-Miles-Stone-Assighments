//https://tests.mettl.com/v2/authenticateKey/1qq4rrjd34
public class Test {
    public String findCharOrDigitSum(String input1,int input2){
        int sum=0;
        String sums="";
        if(input1.isEmpty()){
            return "NULL";
        }
        if(input2==0){
            for(int i=0;i<input1.length();i++){
                if(input1.charAt(i)>='0' && input1.charAt(i)<='9'){
                    sum=sum+Integer.parseInt(String.valueOf(input1.charAt(i)));
                }
            }
            if(sum==0){
                return "ZERO";
            }
            else
                return String.valueOf(sum);
        }
        if(input2==1){
            for(int i=0;i<input1.length();i++){
                if((input1.charAt(i)>='A' && input1.charAt(i)<='Z')||(input1.charAt(i)>='a' && input1.charAt(i)<='z')){
                    sums=sums+String.valueOf(input1.charAt(i));
                }
            }
            if(sums==""){
                return "ZERO";
            }
            else
                return sums;
        }
        return null;
    }

    public static void main(String[] args) {
        Test ob=new Test();
        System.out.println(ob.findCharOrDigitSum(null,0));

    }
}
