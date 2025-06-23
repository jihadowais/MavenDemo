package org.example.testNG_practicing.ParallelExecution;

import org.testng.annotations.Test;

public class ParallelExecTestsByInstances {
    private final String value;

    public ParallelExecTestsByInstances(String value) {
        this.value = value;
    }

    @Test
    public void testMethod() throws InterruptedException {
        System.out.println("value=" + value + " - Instance: " + this + " - Thread: " + Thread.currentThread().getId());
        Thread.sleep(7000); // this to see the parallel execution sequence of the methods

    }
}
