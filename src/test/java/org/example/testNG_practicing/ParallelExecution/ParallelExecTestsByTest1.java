package org.example.testNG_practicing.ParallelExecution;

import org.testng.annotations.Test;

public class ParallelExecTestsByTest1 {
    @Test
    public void testMethod() throws InterruptedException {
        System.out.println("Running testMethod -> Parallel 'tests' Execution 1 -> Thread ID: "+ Thread.currentThread().getId());
        Thread.sleep(5000); // this to see the parallel execution sequence of the methods
    }
}
