import java.util.Scanner;
public class square_root_binary {
    public static void main(String[] args){
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        num = in.nextInt();
        in.close();
        int ans = findRoot(num, 1, num);
        System.out.println("Square Root of "+num +" is "+ans);

    }
    static int findRoot(int num, int low, int high){
        for (int i = low; i <= high; i++) {
            int mid = (low+high)/2;
            if(mid * mid == num){
                return mid;
            }
            else if(mid * mid < num){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
