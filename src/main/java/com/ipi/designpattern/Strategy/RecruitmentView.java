package com.ipi.designpattern.Strategy;
import java.util.List;
public class RecruitmentView {
    private List<CV> cvs;
    private DataProcessing algorithm;

    public RecruitmentView(List<CV> cvs) {
        this.cvs = cvs;
    }

    public void setAlgorithm(DataProcessing algorithm) {
        this.algorithm = algorithm;
    }

    public List<CV> analyze() {
        return algorithm.process(cvs);
    }
}
