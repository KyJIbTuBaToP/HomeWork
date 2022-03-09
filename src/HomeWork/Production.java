package HomeWork;

public class Production {
    public static void main(String[] args) {
        Line7 moneta = new Line7();
    }
}

class Line7 extends Production {
    Extruder runner = new Extruder();
}

class Extruder {
    public void run(){
        System.out.println("Line work is started");
    }
}

class BunkerLine7 extends Line7 {
    BunkerLine7 bunker = new BunkerLine7();
    boolean isEmpty = false;
    private static int materialWeight;

    static void material() {
        System.out.println("Material on the bunker");

    }
}

class Line6 extends Production {

}

class BunkerLine6 extends Line6 {
    boolean isEmpty = false;
    private static int materialWeight;
}

class Worker {
    void fillBunker() {
        System.out.println("Bunker was filled ");
    }
}
