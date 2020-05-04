import java.util.Random;
import java.util.Arrays;
public class WORK3 {
    public static void main(String[] args){
        Random ra = new Random();
        int numbers = 0;
        int[] existarray = {0,0,0,0,0,0};
        boolean repeat = false;
        for(int i=0; i<6; i++){
            do {
                repeat = false;
                numbers = ra.nextInt(33)+1;
                for(int j=0; j<i; j++){
                    if(existarray[j]==numbers){
                        repeat = true;
                    }
                }
            }while(repeat == true);

            System.out.println(numbers);
            existarray[i] = numbers;
        }
        numbers = ra.nextInt(16)+1;
        System.out.println(numbers);

    }
}
