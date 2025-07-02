 //printing numbers from 1 to 20,skipping the multiples of 3
 class Program1 {
    public static void main(String[] args) {
        for (int i=1;i<=20;i++){
            if(i%3 == 0 ){
                continue;
            }else{
                System.out.println(i);
            }
        

        }
    }
}
