import java.util.*;
public class Pattern1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k,h;
        List<Integer> list=new ArrayList<Integer>();
        for(i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        for(j=0;j<list.size();j++){
            for(k=0;k<list.get(j);k++){
                for(h=0;h<list.get(j);h++){
                    if((k+h)%2==0){
                        System.out.print("w");
                    }
                    else{
                        System.out.print("b");
                    }
                }
                System.out.println();
    }
    }
}
}