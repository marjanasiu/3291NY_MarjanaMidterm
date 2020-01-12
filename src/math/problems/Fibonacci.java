package math.problems;

public class Fibonacci {
    public static void main(String[] args) {

int seq = 40;
for (int i = 1; i <=seq; i++) {
    System.out.println(fib(i) + "");

    }
}
public static int fib(int num){
        if (num == 0){
            return 1;
        }
        if (num == 1) {
            return 1;
        }
        if(num == 2) {
            return 1;
        }
        return fib( num-1) + fib( num-2);
    }
}