package practice;

public class LargeElemInArray {

	public static void main(String[] args) {
		int [] arr = {8,7,6,2,5,7};
        int max = arr[0];
        
        for (int i =1; i <arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
                
            }
        }
        System.out.println(max);
        
    

	}

}
