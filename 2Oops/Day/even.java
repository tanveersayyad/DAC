import java.io.*;
import java.util.*;

public class even {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int size=sc.nextInt();
        int[] arr=new int[size];
    
        
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<size;i++)
        {
            if(arr[i]%2==0)
            System.out.println(arr[i]);
        }
       
    }
}
