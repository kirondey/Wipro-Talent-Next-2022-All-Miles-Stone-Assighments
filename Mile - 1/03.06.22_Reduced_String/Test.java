//https://tests.mettl.com/v2/authenticateKey/1tkfnuxhc0
public class Test {
    public String reducedString(String input1){
        String result=String.valueOf(input1.charAt(0));
        if(input1.length()%2==0){
            for(int i=1;i<input1.length();i++){
                if(i%2==1){
                    result=result+String.valueOf(input1.charAt(i));
                }
            }
        }
        else{
            for(int i=1;i<input1.length();i++){
                if(i%2==0){
                    result=result+String.valueOf(input1.charAt(i));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Test ob=new Test();
        System.out.println(ob.reducedString("LOCKDOWN"));
    }
}
