public class Ref1019 {

    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println("after update:"+myCounter.count);

    }
}

class Updater{
    void update(Counter counter) {
        counter.count++;
    }
}

class Counter{
    int count = 0;
}


// https://op.gg/lol/summoners/kr/%EC%83%81%EB%8F%84%EB%8F%99%EB%8F%84%EB%B2%A0%EB%A5%B4%EB%A7%8C-htdog