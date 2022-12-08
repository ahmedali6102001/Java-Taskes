
package third;


import java.util.Scanner;
public class Third {

static int max(int arr[]){
    int x=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>x){ 
            x=arr[i];
        }
    }
    return x;
} 
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.print("please enter array size : ");
        int size=in.nextInt();
        int arr[]=new int[size];
        for(int i =0;i<arr.length;i++){
            System.out.print("please enter item #"+(i+1)+" ");
            arr[i]=in.nextInt();
        }
        System.out.println("the max = "+ max(arr));
    }
    
}
