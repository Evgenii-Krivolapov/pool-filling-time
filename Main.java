public class Main {
    public static void main(String[] args) {

        int volume = 1200;
        int fillingSpeed = 30;
        int devastationSpeed = 10;
        int time;

        while (true) {
            fillingSpeed = fillingSpeed - devastationSpeed;
            time = volume / fillingSpeed;
            System.out.println("Время наполнения бассейна " + time + " минут.");
            break;
        }
    }
}
