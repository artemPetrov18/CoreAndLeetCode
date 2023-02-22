package Labs.Lab5;

public class BlackFactory implements AbstractFactory{
    @Override
    public void createCirle() {
        new BlackCircle();
    }

    @Override
    public void createTriagle() {
        new BlackTriagle();
    }
}
