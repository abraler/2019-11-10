import java.io.File;

//能否找这个数组中和为20
public class Exercise2 {
    public static void main(String[] args) {
        int []a={1,2,4,8};
        System.out.println(Find(a,a.length-1,20));
    }

    private static boolean Find(int[] a,int s, int i) {
        if(i==0){
            return true;
        }
        else if(s==0){
            return a[0]==i;
        }else if(i<a[s]){
            return Find(a,s-1,i);
        }else{
            return Find(a,s-1,i-a[s])||Find(a,s-1,i);

        }
    }
}
