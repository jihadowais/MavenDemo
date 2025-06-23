package org.example.testNG_practicing.ParallelExecution;

import org.testng.annotations.Factory;

public class InstanceFactory {
    @Factory
    public Object[] createInstances() {
        return new Object[] {
                new ParallelExecTestsByInstances("a"),
                new ParallelExecTestsByInstances("b"),
                new ParallelExecTestsByInstances("c")
        };
    }
}
