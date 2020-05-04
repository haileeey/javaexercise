public class WORK2 {
    public static void main(String[] args){
        for(int i=2; i<=1000; i++){
            int temptsum = 0;
            for(int j=1; j<i; j++){
                if(i%j==0){
                    temptsum = temptsum + j;
                }
            }
            if(temptsum == i){
                System.out.println(i);
            }
        }
    }
}
