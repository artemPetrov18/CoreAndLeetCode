package Labs;

public class Lab2 {
    public static void main(String[] args) {
        int x1=3;
        int _1x=5; //не по общепринятым правилам
        int IV=6;
        int INT =3;



        //  int int =5; ---
        //task 2
        System.out.println(" 20/6 "+20/6);
        System.out.println("20%-6 "+20%-6);
        System.out.println("20%-6 "+-20%-6);
        System.out.println("-20%6 "+-20%6);
        System.out.println("-20/6"	+ -20/6);


        //task3
        /*


        	int a, b; long c, d; float x, y;
        y = a + c / x * y - b * d / (a + c);
        int +long (no data loss)
        long +long (data loss)



        byte b = -2;
        double d = 75L / b * 2.0f + 2.f * 5.5;




      	byte b = 2;
        double d = 2.0f * 75L / b – 2.f * 5.5;


        **/
        //
        //




        //task4

        int x=5,i=0,k=23214;

        x=-x;
        System.out.println("x = "+x);
        x*=2;
        System.out.println("x^2 = "+x);
        i++;
        System.out.println("i+1 = " +i);
        i+=2;
        System.out.println("i+2 = " +i);
        k= k%1000/100;
        System.out.println(k);

        //task 5
     task5();


    }
    public static void task5(){
        byte b1=7;
        int i =1234567;
        long l = (long) i;
        short s = (short)i;
        byte b2= (byte) i;
        int i2 = (int) 123.456;
        byte b3= b1=7;
    }
}
