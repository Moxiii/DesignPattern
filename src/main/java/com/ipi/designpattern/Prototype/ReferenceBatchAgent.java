package com.ipi.designpattern.Prototype;

import java.util.ArrayList;
import java.util.List;

public class ReferenceBatchAgent {
    private static ReferenceBatchAgent instance;
    private List<IntellingentAgent> agents;

    private ReferenceBatchAgent() {
        agents = new ArrayList<>();
    }

    public static ReferenceBatchAgent getInstance() {
        if (instance == null) {
            instance = new ReferenceBatchAgent();
        }
        return instance;
    }

    public void addAgent(IntellingentAgent agent) {
        agents.add(agent);
    }

    public List<IntellingentAgent> getAgents() {
        return agents;
    }
}
