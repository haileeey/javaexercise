import java.util.Arrays;
public class WORK5 {
    public static void main(String[] args){
        char[][] arr2d = new char[17][17];
        char[] tempt = {32,48,49,50,51,52,53,54,55,56,57,97,98,99,100,101,102};
        arr2d[0] = tempt;
        for(int i=1; i<=16; i++){
            arr2d[i][0] = tempt[i];
            for(int j=1; j<=16; j++) {
                arr2d[i][j] =43;
            }
        }
        for(int j=0; j<17; j++){
            for(int k=0; k<17; k++){
                System.out.print(arr2d[j][k]+" ");
            }
            System.out.println();
        }

    }
}
