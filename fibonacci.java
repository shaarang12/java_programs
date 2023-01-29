public class fibonacci{
    public static void main(String[] args) {
        int num = 6;
        System.out.println(fib(num));
    }
    static int fib(int num){
        int a = 0;
        int b = 1;
        int c = 1;
        if(num < 2){
            return num;
        }
        else{
            for (int i = 2; i <= num; i++) {
                c = a + b;
                a = b;
                b = c;
            }
        }
        return c;
    }
}