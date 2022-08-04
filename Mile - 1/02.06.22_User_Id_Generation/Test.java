//https://tests.mettl.com/v2/authenticateKey/592740f3
public class Test {
   public String userIdGeneration(String input1,String input2,int input3,int input4){
       String pin=Integer.toString(input3);
       String s2,Uid;
       char s3,s4;
       char s1;

       if(input1.length()==input2.length()){
            if(input1.compareTo(input2)>0){
                s1=input2.charAt(input2.length()-1);
                s2=input1;
            }
            else{
                s1=input1.charAt(input1.length()-1);
                s2=input2;
            }
       }
       else if(input1.length()<input2.length()){
           s1=input1.charAt(input1.length()-1);
           s2=input2;
       }
       else{
           s1=input2.charAt(input2.length()-1);
           s2=input1;
       }

       s3=pin.charAt(input4-1);
       s4=pin.charAt(6-input4);
       Uid=s1+s2+s3+s4;

       return sToggle(Uid);
   }
   public String sToggle(String Uid){
       String NewUid="";
       for(int i=0;i<Uid.length();i++){
           if(Character.isUpperCase(Uid.charAt(i))){
               NewUid+=Character.toLowerCase(Uid.charAt(i));
           }
           else if(Character.isLowerCase(Uid.charAt(i))){
               NewUid+=Character.toUpperCase(Uid.charAt(i));
           }
           else{
               NewUid+=Uid.charAt(i);
           }
       }
       return NewUid;
   }



    public static void main(String[] args) {
        Test ob=new Test();
        System.out.println(ob.userIdGeneration("Kumud","Kumar",561327,2));
    }
}
