package com.ipi.designpattern.Strategy;
import java.util.List;
import java.util.stream.Collectors;
public class ClassificationTree implements DataProcessing{
    @Override
    public List<CV> process(List<CV> cvs) {
        return cvs.stream().filter(CV::isPDF).collect(Collectors.toList());
    }
}
