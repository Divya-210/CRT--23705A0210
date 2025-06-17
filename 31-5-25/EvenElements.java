public class EvenElements{
    public static void main(String[] args) {
        int[]nums ={1,2,4,6};
        int count=0;
        for(int i=0; i<=nums.length; i++){
            
            if(i%2==0){
                count= count+1;
            }
        }
        System.out.println("no.of even numbers in an array:"+count);
    }
}