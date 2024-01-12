public class Question_1 {
//    power(a,n,p)  a power of n % p
    public static void main(String[] args) {
        int a = 3,n=4,p=6;   // 6,6
        int ans = power(a,n,p);
        System.out.println("Ans : "+ans);
    }
    static int power(int a,int n,int p){
        int ans=1;
        for(int i=0;i<n;i++){
            ans = ((ans % p) * (a % p)) % p;
        }
        return ans;
    }
}
