package com.ipi.designpattern.Strategy;
import java.util.List;
import java.util.stream.Collectors;
public class KMeansPartitioning implements DataProcessing    {
    @Override
    public List<CV> process(List<CV> cvs) {
        return cvs.stream().filter(cv -> cv.getContent().contains("informatique")).collect(Collectors.toList());
    }
}
