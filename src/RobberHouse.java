import java.util.Scanner;

public class RobberHouse {
    public static int houseRobberMoney(int[] arr,int size)
    {
        int sum1=0,sum2=0;
        for(int i=0;i<size;i++)
        {
            if(i%2==0)
            {
                sum1+=arr[i];
            }
            if(i%2!=0)
            {
                sum2+=arr[i];
            }
        }
        int result = (sum1>sum2)?sum1:sum2;
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println(houseRobberMoney(arr,size));
    }
}
