public class task_3 {
    static int minTransformation(int a, int b, int c, int d){
        
        String k1 = "k1 -> ";
        String k2 = "k2 -> ";
        int count = 0;
        // String[] str = new String[10];
        while ( a < b){
            if (a * c < b) {
                a = a * c;
                count++;
                System.out.print(k1);
            } 
            else  {
                // int r = b - a;
                a = a + d;
                count++;
                System.out.print(k2);
            }
        }
        if ( a > b){
            System.out.println("\nНет решения");
            count = 0;
        }
        return count;    
        }
	
        
    public static void main(String[] args) {
        System.out.println("\nk1 {a * b}    k2 {a + b}");
        System.out.println("\nМинимальное количество перобразований: ");
        System.out.println(minTransformation(2, 7, 3, 1));
    }
}
        


