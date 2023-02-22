package Labs.Lab5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Black Factory");
        BlackFactory bF =new BlackFactory();
        Client cl1= new Client(bF);
        System.out.println();
        System.out.println("White Factory");
        WhiteFactory wF=new WhiteFactory();
        Client cl2= new Client(wF);
    }
}
