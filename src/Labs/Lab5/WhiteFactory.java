package Labs.Lab5;

public class WhiteFactory implements AbstractFactory{


    @Override
    public void createCirle() {
        new WhiteCircle();
    }

    @Override
    public void createTriagle() {
        new WhiteTriagle();
    }
}
