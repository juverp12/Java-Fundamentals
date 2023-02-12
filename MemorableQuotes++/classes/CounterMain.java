public class CounterMain {
    public static void main(String[] args) {
        

    Counter counter1 = new Counter();
    Counter counter2 = new Counter();
    Counter counter3 = new Counter();


    counter1.increment();
    counter1.increment();
    counter2.increment();
    counter3.decrement();

    System.out.println("Counter 1 is: "+counter1.value);
    System.out.println("Counter 2 is: "+counter2.value);
    System.out.println("Counter 3 is: "+counter3.value);
    }
}