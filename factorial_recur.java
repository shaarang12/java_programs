public class factorial_recur{
    public static void main(String[] args) {
        int ans = fact(9);
        System.out.println(ans);
    }
    static int fact(int num){
        if(num < 3){
            return num;
        }
        return num * fact(num - 1);
    }
}