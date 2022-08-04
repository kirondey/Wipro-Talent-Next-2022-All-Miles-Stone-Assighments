//https://tests.mettl.com/v2/authenticateKey/1pevca6sjk
public class Test {
   public String createRequiredString(int input1){
       String s="";
       if(input1<0){
           s=s+"n";
           input1=-(input1);
       }
       else{
           s=s+"p";
       }
       String s1=String.valueOf(input1);
       for(int i=0;i<s1.length();i++){
           if(s1.charAt(i)=='0'){
               s=s+"z";
           }
           else if(s1.charAt(i)=='1' || s1.charAt(i)=='3' || s1.charAt(i)=='5' || s1.charAt(i)=='7' || s1.charAt(i)=='9'){
               s=s+"o";
           }
           else{
               s=s+"e";
           }
       }
       return s;
   }

    public static void main(String[] args) {
        Test ob=new Test();
        System.out.println(ob.createRequiredString(-25064));
    }
}
