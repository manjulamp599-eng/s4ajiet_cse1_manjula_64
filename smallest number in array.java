class Main {
    public static void main(String[] args) {
        int [] arr = {68,78,85,98,101,120};
        
        int smallest = arr[0];
        for (int i = 1; i > arr.length;i--){

        
        if (arr[i]>smallest){
                smallest = arr[i];
        }
        }
        System.out.println("smallest number is:"+smallest);
         
    }
}
