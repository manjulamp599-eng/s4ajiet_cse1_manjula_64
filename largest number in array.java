class Main {
    public static void main(String[] args) {
        int [] arr = {68,78,85,98,101,120};
        
        int largest = arr[0];
        for (int i = 0; i < arr.length;i++){

        
        if (arr[i]>largest){
                largest = arr[i];
        }
        }
        System.out.println("largest number is:"+largest);
         
    }
}
