public class Main {
    public static void faiVolare(Volatile animale) {
        animale.vola();
    }
    
    public static void faiNuotare(Natante animale) {
        animale.nuota();
    }

    public static void main(String[] args){
        Cane cane = new Cane();
        Passerotto passerotto = new Passerotto();
        Aquila aquila = new Aquila();
        Delfino delfino = new Delfino();
        
        System.out.println("Cane");
        cane.dormi();
        cane.verso();
        cane.mangia();

        System.out.println("----------");
        
        System.out.println("Passerotto");
        passerotto.dormi();
        passerotto.verso();
        passerotto.mangia();

        System.out.println("----------");
        
        System.out.println("Aquila");
        aquila.dormi();
        aquila.verso();
        aquila.mangia();

        System.out.println("----------");

        
        System.out.println("Delfino");
        delfino.dormi();
        delfino.verso();
        delfino.mangia();

        System.out.println("----------");
        

        faiVolare(passerotto);
        faiVolare(aquila);
        faiNuotare(delfino); 
    }
}
