package com.ipi.designpattern.Strategy;

import java.util.Arrays;
import java.util.List;

public class User {
    public static void main(String[] args) {
        List<CV> cvs = Arrays.asList(
                new CV(1, "Content of CV 1", false),
                new CV(2, "Content of CV 2", true),
                new CV(3, "Content of CV 3", false),
                new CV(4, "Content of CV 4", true),
                new CV(5, "Content of CV 5", false)
        );

        RecruitmentView view = new RecruitmentView(cvs);

        view.setAlgorithm(new LinearRegression());
        System.out.println("Linear Regression Results: " + view.analyze());

        view.setAlgorithm(new ClassificationTree());
        System.out.println("Classification Tree Results: " + view.analyze());

        view.setAlgorithm(new KMeansPartitioning());
        System.out.println("KMeans Partitioning Results: " + view.analyze());
    }
}