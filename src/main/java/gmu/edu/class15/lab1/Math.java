package gmu.edu.class15.lab1;

import com.google.common.primitives.Doubles;
import com.google.common.primitives.Longs;

public class Math {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double max(double... dubs) {
        return Doubles.max(dubs);
    }
}
