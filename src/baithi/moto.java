package baithi;

import java.util.Scanner;

public class moto implements vehicle{
    String name;

    @Override
    public float moveMax() {
        return 150;

    }

    @Override
    public String getName() {
        return this.name;
    }
}