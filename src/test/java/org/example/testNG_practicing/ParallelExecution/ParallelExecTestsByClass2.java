package org.example.testNG_practicing.ParallelExecution;

import org.testng.annotations.Test;

public class ParallelExecTestsByClass2 {
    @Test
    public void testMethod() throws InterruptedException {
        System.out.println("Running testMethod -> Parallel 'classes' Execution 2 -> Thread ID: "+ Thread.currentThread().getId());
        Thread.sleep(5000); // this to see the parallel execution sequence of the methods
    }
}
