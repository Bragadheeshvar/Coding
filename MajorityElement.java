import java.util.Scanner;

public class MajorityElement {
    static Scanner sc = new Scanner(System.in);
    int n;
    int arr[];
    public MajorityElement(int x){
        this.n=x;
        arr = new int[n];
    }
    int input(){
       int tcount=1,temp;
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       temp = arr[0];
       for(int i=1;i<n;i++){
           if(temp==arr[i])
               tcount++;
           else
               tcount--;
           if(tcount==0){
               tcount++;
               temp=arr[i];
           }
       }
       return temp;
    }
    boolean checkMajor(int perm){
        int major=0;
        for(int i=0;i<n;i++){
            if(perm==arr[i])
                major++;
        }
        if(major>(n/2))
            return true;
        else
            return false;
    }
    public static void main(String args[]){
        int possibleEle=-1;
        int m =sc.nextInt();
        MajorityElement maj = new MajorityElement(m);
        possibleEle = maj.input();
        if(maj.checkMajor(possibleEle))
            System.out.println(possibleEle);
        else
            System.out.println("Major element not found");
    }
}
