package com.ipi.designpattern.Strategy;

import java.util.List;
import java.util.stream.Collectors;

public class LinearRegression implements DataProcessing{
    @Override
    public List<CV> process(List<CV> cvs) {
        return cvs.stream().filter(cv -> cv.getId() == 1 || cv.getId() == 5).collect(Collectors.toList());
    }
}
