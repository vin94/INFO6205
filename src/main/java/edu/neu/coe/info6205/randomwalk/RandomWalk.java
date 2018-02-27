/*
 * Copyright (c) 2017. Phasmid Software
 */

package edu.neu.coe.info6205.randomwalk;

import java.util.Random;

public class RandomWalk {
    private int x = 0;
    private int y = 0;

    private final Random random = new Random();

    private void move(int dx, int dy) {
        // TODO you need to implement this
    }

    private void randomWalk(int n) {
        for (int i = 0; i < n; i++)
            randomMove();
    }

    private void randomMove() {
        // TODO you need to implement this
    }

    public double distance() {
        return 0; // TODO you need to implement this
    }


    public double randomMoveServalTimes(int sn, int dn) {
        int n = sn;  // Number of steps for single drunkard
        int m = dn;  // Number of drunkard
        double totalDistance = 0;
        for (int i = 0; i < m; i++){
            RandomWalk walk = new RandomWalk();
            walk.randomWalk(n);
            totalDistance = totalDistance + walk.distance();
        }
        return totalDistance/m ;
    }
}
