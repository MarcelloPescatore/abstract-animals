public class Aquila extends AbstractAnimale implements Volatile{
    @Override
    public void verso() {
        System.out.println("Squawk");
    }
    
    @Override
    public void mangia() {
        System.out.println("Mangio carne");
    }

    @Override
    public void vola(){
        System.out.println("Sta volando");
    }
}
