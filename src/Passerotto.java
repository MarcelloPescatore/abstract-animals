public class Passerotto extends AbstractAnimale implements Volatile {
    @Override
    public void verso(){
        System.out.println("Cip cip");
    }

    @Override
    public void mangia(){
        System.out.println("Mangio vermi");
    }

    @Override
    public void vola(){
        System.out.println("Sta volando");
    }
}

