public class fibonacci_recur{
    public static void main(String[] args) {
        int num = 6;
        System.out.println(fib(num));
    }
    static int fib(int num){
        if(num < 2){
            return num;
        }
        int fibo = fib(num - 1) + fib(num - 2);
        return fibo;
    }
}