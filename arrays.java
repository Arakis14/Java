public class arrays {

    public static void main(String[] args){

        int[] values = new int[3];

        System.out.println(values[0]);

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        int [] numbers = {5, 6, 8};

        System.out.println(numbers.length);
        
        for (int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}