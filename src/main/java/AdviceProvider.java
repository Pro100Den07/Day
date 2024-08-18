public class AdviceProvider implements Advise {
    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Порада: Сконцентруйтесь на своїх завданнях для покращення продуктивності на роботі.");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Рекомендації: Відвідайте парк, музей або кінотеатр.");
                break;
            default:
                System.out.println("Невідомий день.");
        }
    }
}