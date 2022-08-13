

public class Find_String_Weight_AND {
    

    public static int find_String_Weight_AND(int input1[],String input2)
    {   
        int weight=1;
        input2=input2.toLowerCase();
        String[] str=input2.split(" ");


        for(int i=0;i<str.length;i++){
            int sum=0;
            String ele=str[i];
            for(int j=0;j<ele.length();j++){
                int pos=ele.charAt(j)-97;
                
                if(j==0 || j==(ele.length()-1)){
                    if(input1[pos]<0){
                       
                        sum=sum+input1[pos]+pos+1;

                    }
                    else
                    sum=sum+input1[pos];
                }
                else{
                    sum=sum+input1[pos];
                   
                }
                    


            }
            weight=weight*sum;

            
        }
        return weight;
    }
    public static void main(String[] args) {
        // int input1[]={15,16,1,-2,-13,61,11,4,3,19,-4,17,-3,90,-65,67,12,0,13,2,3,43,21,-17,2,42};
        // String input2="Wipro Limited";
        int input1[]={12,11,6,1,-1,23,12,1,28,-43,6,98,11,2,7,88,9,-4,-54,25,19,-12,-32,-65,3,-9};
        String input2="Spring AND Hibernate";
        System.out.println(find_String_Weight_AND(input1,input2));
        

    }
}
