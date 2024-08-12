public class SmartTV {

    boolean ligada = false;
    int volume = 50;
    int canal = 0;

    public void onAndOff () {
        String estado;
        ligada = ligada == false ? true : false;
        estado = ligada == false ? "desligada" : "ligada";

        System.out.print("SmartTV está " + estado + "\n");
    }

    public void aumentarVolume () {
        volume++;
        System.out.print("Aumentou o volume para " + volume + "\n");

    }

    public void diminuirVolume () {
        volume--;
        System.out.print("Diminuiu o volume para " + volume + "\n");

    }

    public void avancarCanal() {
        canal++;
        System.out.print("Mudou para o canal " + canal + "\n");

    }

    public void voltarCanal() {
        canal--;
        System.out.print("Mudou para o canal " + canal + "\n");
    }

    public void escolherCanal(int novoCanal) {
        canal = novoCanal;
        System.out.print("Mudou para o canal " + canal + "\n");
    }
}
