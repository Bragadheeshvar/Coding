import java.util.HashMap;
import java.util.Scanner;

public class PairSum {
    static Scanner sc = new Scanner(System.in);
    int n,sum;
    int arr[];
    HashMap<Integer,Integer> pair = new HashMap<Integer,Integer>();
    public PairSum(int x,int y){
        this.n=x;
        this.sum=y;
        arr = new int[n];
    }
    
    void input(){
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }
    
    int FindPair(){
        for(int i=0;i<n;i++){
            if(pair.containsValue(arr[i])){
                return arr[i];
            }
            else{
                pair.put(arr[i], (sum-arr[i]));
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int m,s,res;
        m = sc.nextInt();
        s = sc.nextInt();
        PairSum p = new PairSum(m,s);
        p.input();
        res = p.FindPair();
        if(res != -1)
            System.out.println("Pair is "+res+","+(s-res));
        else
            System.out.println("No pair found");
    }
}
