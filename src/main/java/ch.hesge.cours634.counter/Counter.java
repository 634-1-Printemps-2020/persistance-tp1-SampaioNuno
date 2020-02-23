package ch.hesge.cours634.counter;

public class Counter implements ICounter {
    private int value;

    Counter()
    {
        this.value = 0;
    }

    public void inc() throws CounterException{
        this.value++;
    }

    public void add(int step) throws CounterException{
        this.value = this.value + step;
    }

    public int getValue(){
        return this.value;
    }
}
