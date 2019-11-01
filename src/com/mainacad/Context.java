package com.mainacad;

public class Context {
    private IStrategy iStrategy;

    public void setiStrategy(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public Integer[] sortStrategy(Integer[] arr) {
        return iStrategy.sort(arr);
    }
}
