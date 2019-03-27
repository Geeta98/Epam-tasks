import java.util.*;
class Army{
    public static void main(String args[] ) throws Exception {
        Sol sol=new Sol();
	    sol.mymethod();
 
    }
}
class Sol {
	public void mymethod(){
	int i;
    Scanner sc = new Scanner(System.in);
    int ch = sc.nextInt();
    long min_def[] = new long[ch+2];
    long max_def[] = new long[ch+2];
    min_def[0] = sc.nextLong();
    min_def[1] = sc.nextLong();
    max_def[0] = min_def[0];
    max_def[1] = min_def[1];
    for(i=2;i<ch+2;i++) {
        long pos = sc.nextLong();
        long army = sc.nextLong();
        if((min_def[0] <= pos + army) && (max_def[1] >= pos - army)) {
            min_def[i] = pos - army;
            max_def[i] = pos + army;
        }
        else if(min_def[0] < pos + army) {
            min_def[i] = min_def[1];
            max_def[i] = min_def[1];
        }
        else {
            min_def[i] = min_def[0];
            max_def[i] = min_def[0];
        }
    }
    Arrays.sort(min_def);
    Arrays.sort(max_def);
    long final_sum = 0;
    for(i = 1; i < min_def.length; i++) {
        if(min_def[i] - max_def[i-1] > 0)
            final_sum+=min_def[i] - max_def[i-1];}
     System.out.print(final_sum);
    } 
}
