/*
 * Copyright (c) 2018. Phasmid Software
 */

package edu.neu.coe.info6205.util;

import java.util.function.Function;

public class Benchmark<T> {

    public Benchmark (Function<T,Void> f) {
        this.f = f;
    }

    public double run(T t, int n) {
        return 0; // TODO
    }

    private final Function<T, Void> f;

    public static void main(String[] args) {
        Function<String,Void>sort = (x) -> {System.out.println(x); return null; };
        Benchmark bm = new Benchmark(sort);
        double x = bm.run("Hello", 100);
        System.out.println(x+" millisecs");
    }
}

