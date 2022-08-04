//https://tests.mettl.com/v2/authenticateKey/1tkhskt7nk
public class Test {
   public int digitExtractionSum(String input1){
       int sum=0,sumRes=0,temp=0;
       for(int i=0;i<input1.length();i++){
           if(input1.charAt(i)>='0' && input1.charAt(i)<='9'){
               sum=sum+Integer.parseInt(String.valueOf(input1.charAt(i)));
           }
       }
       String num=String.valueOf(sum);
       /*for(int i=0;i<num.length();i++){
           temp=sum%10;
           sumRes=sumRes+temp;
           sum=sum/10;
       }*/
	while(sum>0 || sumRes>9){
           if(sum==0){
		sum=sumRes;
		sumRes=0;
	   }
	   temp=sum%10;
           sumRes=sumRes+temp;
           sum=sum/10;
	}
       return sumRes;
   }

    public static void main(String[] args) {
        Test ob=new Test();
        System.out.println(ob.digitExtractionSum("wl2come&hello69@#wipro01"));
    }
}
