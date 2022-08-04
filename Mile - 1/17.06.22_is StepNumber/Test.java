//https://tests.mettl.com/v2/authenticateKey/1qq54j0oow
public class Test {
    public String isStepNumber(int input1){
        String input = String.valueOf(input1);
        if(input.length()==1){
            return input+"-false";
        }
        for(int i=0;i<input.length()-1;i++){
            if((Integer.parseInt(String.valueOf(input.charAt(i)))==Integer.parseInt(String.valueOf(input.charAt(i+1)))-1) || Integer.parseInt(String.valueOf(input.charAt(i)))==Integer.parseInt(String.valueOf(input.charAt(i+1)))+1){
                continue;
            }
            else{
                return (input+"-false");
            }
        }
        return (input+"-true");
    }

    public static void main(String[] args) {
        Test ob=new Test();
        System.out.println(ob.isStepNumber(67898));

    }
}
