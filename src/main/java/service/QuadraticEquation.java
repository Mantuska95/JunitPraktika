package service;

import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class QuadraticEquation {
    Double x1;
    Double x2;

    public QuadraticEquation() {
    }

    public Pair<Double,Double> solveQuadraticEquation(Double a, Double b, Double c) {
        Double d = b * b - 4 * a * c;
        if (d < 0) {
            x1 = null;
            x2 = null;
        } else if (d == 0) {
            x1 = -b / (2 * a);
            x2 =null;
        } else {
            d = Math.sqrt(d);
            x1 = (-b + d) / 2 * a;
            x2 = (-b - d) / 2 * a;
        }
        return new MutablePair<>(x1,x2);
    }

}
