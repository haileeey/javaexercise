// the array start with 10 capacity, as user type 8 inputs, the capacity will automatically extends to
// 15 (1.5 times of original capacity), then if the user types 4 more inputs(12 intotal), the capacity
// will extends to 22(1.5*15), and so on
import java.util.Scanner;
public class WORK4 {
    public static void main(String[] args){
        int capacity =0;
        int[] arr1 = new int[10];
        do{
            System.out.println("current capacity for array is "+arr1.length);
            for(int i=0; i< ((arr1.length-capacity)*4/5); i++){
                System.out.println("输入一个值:");
                Scanner sc = new Scanner(System.in);
                int tempt = sc.nextInt();
            }
            capacity = arr1.length;
            int newsize =  arr1.length*3/2;
            arr1 = new int[newsize];
        }while(true);

    }
}
