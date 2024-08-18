public class Main {
    public static void main(String[] args) {
        AdviceProvider adviceProvider = new AdviceProvider();

        adviceProvider.advise(Day.MONDAY);
        adviceProvider.advise(Day.FRIDAY);
        adviceProvider.advise(Day.SATURDAY);
    }
}