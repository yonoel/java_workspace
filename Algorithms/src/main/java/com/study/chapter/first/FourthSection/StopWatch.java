package com.study.chapter.first.FourthSection;

public class StopWatch {
    private final long start;

    public StopWatch() {
        this.start = System.currentTimeMillis();
    }
    public double elapsedTime(){
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }
}
