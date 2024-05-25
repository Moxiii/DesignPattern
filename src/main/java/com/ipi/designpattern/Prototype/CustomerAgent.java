package com.ipi.designpattern.Prototype;

public class CustomerAgent {
    public void execute() {
        ReferenceBatchAgent reference = ReferenceBatchAgent.getInstance();
        for (IntellingentAgent agent: reference.getAgents()) {
            IntellingentAgent clonedAgent = agent.clone();
            if (clonedAgent != null) {
                System.out.println(clonedAgent.processRequest());
            }
        }
    }

    public static void main(String[] args) {
        ReferenceBatchAgent reference = ReferenceBatchAgent.getInstance();
        reference.addAgent(new MobileAgent());
        reference.addAgent(new InformationAgent());
        reference.addAgent(new InterfaceAgent());
        reference.addAgent(new CollaborativeAgent());

        CustomerAgent customer = new CustomerAgent();
        customer.execute();
    }
}
