import java.util.Stack;

public class PurpleMontain {
    private EntranceQueue<java.util.Stack<Hiker>> entrance;
    private EntranceQueue<java.util.Stack<Hiker>> entrance2;
    private EntranceQueue<java.util.Stack<Hiker>> entrance3;

    public PurpleMontain()
    {
        entrance = new EntranceQueue<>();
        entrance2 = new EntranceQueue<>();
        entrance3 = new EntranceQueue<>();
    }

    public void setEntrance(EntranceQueue<Stack<Hiker>> entrance) {
        this.entrance = entrance;
    }

    public void setEntrance2(EntranceQueue<Stack<Hiker>> entrance2) {
        this.entrance2 = entrance2;
    }

    public void setEntrance3(EntranceQueue<Stack<Hiker>> entrance3) {
        this.entrance3 = entrance3;
    }

    public EntranceQueue<Stack<Hiker>> getEntrance() {
        return entrance;
    }

    public EntranceQueue<Stack<Hiker>> getEntrance2() {
        return entrance2;
    }

    public EntranceQueue<Stack<Hiker>> getEntrance3() {
        return entrance3;
    }
}
