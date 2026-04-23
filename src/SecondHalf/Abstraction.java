package SecondHalf;

interface Abstraction {
    void moon();
    void sun();
}

class Bhavya implements Abstraction {

    public void moon() {
        System.out.println("mooning");
    }

    public void sun() {
        System.out.println("suning");
    }

    public static void main(String[] args) {
        Bhavya b1 = new Bhavya();
        b1.moon();
        b1.sun();
    }
}