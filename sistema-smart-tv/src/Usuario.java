public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);
        smartTv.passarCanalSuperior();
        smartTv.passarCanalSuperior();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.selecionarCanal(48);
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
