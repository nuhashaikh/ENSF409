public class SynchronizedCounter { //construtcors cannot be synchronized
    private volatile int counter=0; //keyword volatile, ensure changes are visible acorss all threads
                                    // volatile ensures theres consistency 

    public synchronized void increment(){ //syncronized methods, with keyword synchronized
                                          // problem addressed is when multiple threads use the same object
                                          // all threads executing same method will wait for one thread to finish
        counter ++;
    }
    
    public synchronized int getCounter(){ //syncronized methods, with keyword synchronized
        return this.counter;
    }
    // when a static method is synchronized thread aquires a lock on class object rather than on instantiated object 
}
