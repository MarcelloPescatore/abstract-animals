public class Main {
    public static void faiVolare(Volatile animale) {
        animale.vola();
    }
    
    public static void faiNuotare(Natante animale) {
        animale.nuota();
    }
    public static void main(String[] args){
        Passerotto passerotto = new Passerotto();
        Aquila aquila = new Aquila();
        Delfino delfino = new Delfino();
        

        faiVolare(passerotto);
        faiVolare(aquila);
        faiNuotare(delfino); 
    }
}
