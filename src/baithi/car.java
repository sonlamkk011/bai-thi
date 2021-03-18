package baithi;

public class car implements vehicle{
    String name;
    @Override
    public float moveMax() {
        return 250;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
