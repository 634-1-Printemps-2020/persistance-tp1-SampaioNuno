package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends ICounter {
    private int value;
    private int max;

    UpperLimitedPositiveCounter(int v, int max)
    {
        this.value = v;
        this.max = max;
    }

    public void inc() throws CounterException{
        int tmp = this.value++;
        if(tmp > this.max)
        {
            throw new CounterException("Maximum reached");
        }
        else{
            this.value++;
        }
    }

    public void add(int step) throws CounterException{
        int tmp = this.value + step;
        if(tmp > this.max)
        {
            throw new CounterException("Maximum reached");
        }
        else{
            this.value = this.value + step;
        }
    }

    public int getValue(){
        return this.value;
    }
}
