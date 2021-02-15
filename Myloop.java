public class Myloop {
    public static void main(String[] args){
        
        int value = 10;
        
        
        while(value < 20)
        {
            value = value +  1;
            System.out.println(value);
        }
        
        boolean win = value < 20;
        
        System.out.println(win);
        System.out.println(value);
    }
}