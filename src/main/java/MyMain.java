import java.util.Scanner;

public class MyMain {
     
    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        int big = 0;
        int lil = 0;
        big = Math.max(a,b);
        big = Math.max(big,c);
        lil = Math.min(a,b);
        lil = Math.min(lil,c);
        return a+b+c-big-lil;
        

    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if(Math.abs(a)>Math.abs(b)){
            return a;
        }else{
            return b;
        }
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        return Math.sqrt((a*a)+(b*b));
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        // System.out.println(median(1, 2, 3)); // should be 2
        // System.out.println(magnitude(-7, -1)); // should be -7
        // System.out.println(pythagoras(3, 4)); // should be 5.0
        // I am done with these ^ but didnt want to delete them
        
        Scanner command = new Scanner(System.in);
        System.out.println("Type 'median' 'magnitude' or 'pythagoras'");
        String choice = command.nextLine();
        if(choice.equals("median")){
            System.out.println("Input A");
            int impA = command.nextInt();
            System.out.println("Input B");
            int impB = command.nextInt();
            System.out.println("Input C");
            int impC = command.nextInt();
            System.out.println("The median of A B and C is " +median(impA, impB, impC));
        }else if(choice.equals("magnitude")){
            System.out.println("Input A");
            int impA = command.nextInt();
            System.out.println("Input B");
            int impB = command.nextInt();
            System.out.println("The number with the larger magnitude is " + magnitude(impA, impB));
        }else{
            System.out.println("Input A");
            int impA = command.nextInt();
            System.out.println("Input B");
            int impB = command.nextInt();
            System.out.println("Using the pythagorean theorem, C is " +pythagoras(impA, impB));
        }
        command.close();
    }
}
