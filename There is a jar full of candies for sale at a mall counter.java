class Main {
    public static void main(String[] args) {
        int n = 10;
        int k = 5;
        int order=3;
        
        if(order>0&&order<=n){
            
             System.out.println("Number of Candies Sold: " + order);
        
             System.out.println("Number of Candies Avalilable: " +((n-=order)<=k?10:n));
        
       }else System.out.println("Invalid input");
        
    }
}
