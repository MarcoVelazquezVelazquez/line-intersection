package com.epam.rd.autotasks.intersection;

import com.epam.rd.autotasks.intersection.Main;
import com.epam.rd.autotasks.intersection.Point;

public class Line {

    int k;
    int b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        //y = k * x + b.

        if (this.k == other.k && this.b == other.b) {
            // Lines coincide
            return null;
        } else if (this.k == other.k) {
            // Lines are parallel and don't intersect
            return null;
        } else {
            int x = (other.b - this.b) / (this.k - other.k);
            int y = this.k * x + this.b;
            return new Point(x, y);
        }
    }


       // throw new UnsupportedOperationException();
    }
