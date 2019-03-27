import java.util.*;
class RodCutting {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int n = sc.nextInt();
            int specialRods = 0;
            int specialRodLength = 3;
            while(specialRodLength <= n){
                specialRods++;
                specialRodLength = 2*specialRodLength + 1;
            }
            System.out.println(specialRods);
        }
    }
}
