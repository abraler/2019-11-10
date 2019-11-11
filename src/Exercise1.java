//在一个数组中，找不相邻的最大和


public class Exercise1 {

    public static void main(String[] args) {
        int []a={1,3,5,6,9,9,5,43,};
        long q=System.nanoTime();
        int t=rever(a,a.length-1);//递归算法
        long r=System.nanoTime();
        int p=rever1(a,a.length-1);//动态规划
        long b=System.nanoTime();
        System.out.println(t);
        System.out.println(p);
        System.out.println(r-q);
        System.out.println(b-r);
    }

    private static int rever1(int[] a, int i) {
        int []b=new int[a.length];
         b[0]=a[0];
         b[1]=Math.max(a[0],a[1]);
         for (int j=2;j<b.length;j++){
             b[j]=Math.max(b[j-1],b[j-2]+a[j]);
         }
         return b[i];
    }

    private static int rever(int[] a,int n) {
        if(n==0){
            return a[0];
        }
        else if(n==1){
            return Math.max(a[0],a[1]);
        }else {
            return Math.max(rever(a,n-1),rever(a,n-2)+a[n]);
        }
    }
}
