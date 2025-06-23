package org.example.testNG_practicing.ParallelExecution;

import org.testng.annotations.Test;

public class ParallelExecTestsByMethod {
    @Test
    public void testMethod1() throws InterruptedException {
        System.out.println("Running testMethod1 -> Parallel 'methods' Execution -> Thread ID: "+ Thread.currentThread().getId());
        Thread.sleep(3000); // this to see the parallel execution sequence of the methods
    }
    @Test
    public void testMethod2() throws InterruptedException {
        System.out.println("Running testMethod2 -> Parallel 'methods' Execution -> Thread ID: "+ Thread.currentThread().getId());
        Thread.sleep(3000); // this to see the parallel execution sequence of the methods
    }
    @Test
    public void testMethod3() throws InterruptedException {
        System.out.println("Running testMethod3 -> Parallel 'methods' Execution -> Thread ID: "+ Thread.currentThread().getId());
        Thread.sleep(3000); // this to see the parallel execution sequence of the methods
    }
    @Test
    public void testMethod4() throws InterruptedException {
        System.out.println("Running testMethod4 -> Parallel 'methods' Execution -> Thread ID: "+ Thread.currentThread().getId());
        Thread.sleep(3000); // this to see the parallel execution sequence of the methods
    }
    @Test
    public void testMethod5() throws InterruptedException {
        System.out.println("Running testMethod5 -> Parallel 'methods' Execution -> Thread ID: "+ Thread.currentThread().getId());
        Thread.sleep(3000); // this to see the parallel execution sequence of the methods
    }
}
