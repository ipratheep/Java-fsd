package basicjava;

public class typeCasting {
    public static void main(String [] args) {
        byte a = 10;
        short b = a;
        int c = b;
        double d = c;

        System.out.println(" Implicit type casting \n byte value : "+ a + "\n short value : "+ b +"\n int value : "+ c +"\n double value : "+ c );

        float i = 55;
        long j = (long) i;
        int k = (int) j;

        System.out.println(" \n Explicit type casting \n Float Value : "+ i +" \n Long value : "+ j +" \n Int value : " + k );
    }
}
