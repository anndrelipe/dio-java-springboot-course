public class App {

    public static void main (String [] args) throws Exception {

        SmartTV smartTv = new SmartTV();

        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);
        System.out.println(smartTv.ligada);

        smartTv.onAndOff();
        smartTv.aumentarVolume();

        System.out.println(smartTv.ligada);
        System.out.println(smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println(smartTv.volume);

        smartTv.avancarCanal();
        smartTv.avancarCanal();
        smartTv.avancarCanal();
        smartTv.voltarCanal();

        smartTv.escolherCanal(525);


    }


}
