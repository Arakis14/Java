public class Arrays {

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
        String text = null;
        System.out.println(text);
        
        String[] texts = new String[2];
        System.out.println(texts[0]);

        texts[0] = "Hi";
        texts[1] = "There!";
        for(String texto:texts) {
            System.out.println(texto);
        }
    }
}