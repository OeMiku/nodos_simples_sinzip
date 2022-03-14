public class principal {
    public static void main(String[] args) {
        System.out.println("---LA SIGUIENTE LISTA ES CON FIFO---");
        FIFO nombres = new FIFO();
        nombres.push("pepe");
        nombres.push("lalo");
        nombres.push("fer");

        nombres.imprimeFIFO();
        System.out.println("------");
        System.out.println("quitamos: "+ nombres.pop());
        System.out.println("------");
        nombres.imprimeFIFO();

        System.out.println("---LA SIGUIENTE LISTA ES CON FILO---");

        FILO nombresFilo = new FILO();
        nombresFilo.pushFILO("vero");
        nombresFilo.pushFILO("clau");
        nombresFilo.pushFILO("lili");

        nombresFilo.imprimeFILO();
        System.out.println("------");
        nombresFilo.popFILO();
        System.out.println("------");
        nombresFilo.imprimeFILO();

    }
}
