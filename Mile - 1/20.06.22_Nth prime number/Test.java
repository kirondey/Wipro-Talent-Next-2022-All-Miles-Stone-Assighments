//https://tests.mettl.com/v2/authenticateKey/34fdaa41
public class Test {
    public int NthPrime(int input1){
        int n=1,c=0,i;
        while(c<input1){
            n=n+1;
            for(i=2;i<=n;i++){

                if(n%i==0)
                    break;

            }
            if(i==n){
                c++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Test ob=new Test();
        System.out.println(ob.NthPrime(10));

    }
}
