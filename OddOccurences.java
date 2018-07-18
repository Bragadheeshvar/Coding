import java.util.Scanner;
public class OddOccurences {
    int n;
    int arr[];
    static Scanner sc = new Scanner(System.in);
    public OddOccurences(int x){
        this.n=x;
        arr = new int[n];
    }
    public void input(){
        int oddOccurNo=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            oddOccurNo=oddOccurNo^arr[i];
        }
        System.out.println(oddOccurNo);
    }
    public static void main(String args[]){
        int n;
        n=sc.nextInt();
        OddOccurences O = new OddOccurences(n);
        O.input();   
    }
}
