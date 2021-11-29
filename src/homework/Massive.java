package homework;
import java.util.Arrays;
import java.util.Random;
public class Massive {
    public static void main(String[] args) {
        factoryArr(5);
/*	int[] array = {1, 1, 1, 1, 0, 1, 1, 1, 1,1};
    int i;
        for (i = 0; i < 9; i++) {
            if(array[i]==0) {array[i]=1;
            }
            else{
                array[i]=0;
            }
            System.out.println(array[i]);
        }*/

        /*int[] mas= new int [100];
        for (int i =1; i <=100; i++) {
            mas[i]=i;
            System.out.print(mas[i]+" ");
        }*/

        /*int[] arr = {1, 5, 3, 2,11, 4, 5, 2, 4,8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<6) {arr[i]*=2;}
        }
        System.out.println(Arrays.toString(arr));*/

        public static int[] [] factoryArr(int n){
            int[] [] arr=new int [n] [n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i==j || i+j==n-1) {
                        arr[i] [j]=1;
                }
                }
            }
        }
        return arr;

    }
}
