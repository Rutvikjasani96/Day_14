public class Question_2 {
//    given a number in arr[], calculate number  5 % p.
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 6, 4};
        int p=4;
//        int ans = arrayofMod(array,p);
        int ans = arrayofModOptimize(array,p);
        System.out.println("Ans : "+ans);
    }
    static int arrayofMod(int[] array,int p){
        int ans=0;
        for(int i=0;i<array.length;i++){
            ans = ans + (((array[i]%p) * (Question_1.power(10,array.length-i-1,p))) % p) % p;
        }
        return ans;
    }
    static int arrayofModOptimize(int[] array,int p){
        int ans=0;
        int exp=1;
        for(int i=array.length-1;i>=0;i--){
            ans = (ans + ((array[i]%p) * (exp%p))) % p;
            exp = (exp*10) % p;
        }
        return ans;
    }
}
