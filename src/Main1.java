import java.util.*;

public class Main1{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String []b=a.split(" ");
        HashMap<String,Integer>map=new HashMap<>();
        for (int i = 0; i <b.length ; i++) {
            if(map.containsKey(b[i])){
                map.put(b[i],map.get(b[i])+1);
            }else{
                map.put(b[i],1);
            }
        }
        Integer sum=0;
        Collection<Integer>tt=map.values();
        for (Integer i:tt){
            if(sum.compareTo(i)<0){
                sum=i;
            }
        }
        Set<Map.Entry<String,Integer>>d=map.entrySet();
        for (Map.Entry<String,Integer>e:d){
            if(e.getValue()==sum){
                System.out.println(e.getKey());
            }
        }
    }
}