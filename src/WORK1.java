import java.util.Scanner;
public class WORK1 {
    public static void main(String[] args) {
        System.out.println("请输入年份:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println("请输入月份:");
        int month = sc.nextInt();
        System.out.println("请输入日期:");
        int day = sc.nextInt();
        int[] dayarray = {31,28,31,30,31,30,31,31,30,31,30,31};
        int totaldays = 0;
        for(int i=0; i < month-1; i++){
            totaldays = totaldays + dayarray[i];
        }
        totaldays = totaldays + day;
        if( year%4==0 && month >2 ){
            totaldays = totaldays + 1;
        }
        System.out.println("这是一年中的第"+totaldays+"天");
    }
}
