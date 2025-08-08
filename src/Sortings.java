public class Sortings {
public static void main(String[] args) {
    int[] arr = {2,5,3,8,6,9};
    int l = arr.length;
    System.out.println(l);
    
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<l-1-i; j++){
            if(arr[j]>arr[j+1]){
                int tem = arr[j];
                arr[j]= arr[j+1];
                arr[j+1] = tem;

        
            }
        }
    }
      System.out.println("sorting is complited");
      for (int n : arr) {
        System.out.println(n + " ");
        
      }

}
}
