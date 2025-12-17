public class Loops {
    

    public static void main(String[] args) {



        
        for (int i = 0; i < 5; i += 1) {
            for (int j = 0; j < 5; j++){
                System.out.println(j);
                if (j==2){
                    System.out.print(j);
                }
                System.out.print('\n');
            }   

            System.out.println(i);
            //break
            //continue
            //return            
            }

        // in for loops, you shouldnt use operators (||) because its messy

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        
        }

        boolean isContinuing = true;
        int z= 0;
        while (isContinuing) {
            z++;
            if (z == 20) {
                isContinuing = false;
            }
            System.out.println(z);
        }

        // Foobar
        // 1 to 100
        // i % 3 foo,
        //if I is divisible by 5 bar
        // if both divisible by 3 and 5 choose bar

        for (int f = 0; f <= 100; f += 1) {
            if (f % 3 == 0){
                System.out.print("Foo");
            }
            if (f % 5 == 0){
                System.out.print("Bar");
            }
            System.out.print("\n");

            

        }
        
        for (int g = 0; g <= 12; g++){
            for (int h = 0; h <=12; h++){
                System.out.print(g * h + "\t");

            }
            System.out.print("\n");
        }
        while (True)
    }
}


