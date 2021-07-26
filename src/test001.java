import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class test001
{
    static boolean is_prime(int n)
    {
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0) return false;
        for(int i = 3;i <= n / 2;i += 2)
            if(n % i == 0) return false;
        return true;
    }
    public static ArrayList<Integer> factorization (int n) {
        // write code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 2;i <= n;i ++)
        {
            if(!is_prime(i)) continue;//如果i不是素数,则i++,进行下一次循环
            if(n % i == 0)
            {
                while(true)//如果n%i一直 ==0则一直分解,否则跳出,i++
                {
                    result.add(i);
                    n = n / i;
                    if(n % i != 0) break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("输入数值");
        int n=in.nextInt();
        int i;
        System.out.print(n+"=");
        List<Integer> result = new ArrayList<Integer>();
        for(i = 2;i <= n;i ++)
        {
            if(!is_prime(i)) continue;//如果i不是素数,则i++,进行下一次循环
            if(n % i == 0)
            {
                while(true)//如果n%i一直 ==0则一直分解,否则跳出,i++
                {
                    result.add(i);
                    n = n / i;
                    if(n != 1) System.out.print("*");
                    if(n % i != 0) break;
                }
            }
        }
        System.out.println(result);
    }
}