package com.company;

import java.util.ArrayList;

public class Laptop extends Device{

    private ArrayList<Component> components;

    public Laptop(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priority, ArrayList<Component> components) {
        super(identificationCode, makeAndModel, owner, problemDescription, repairNotes, priority);
        this.components = components;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "identificationCode='" + identificationCode + '\'' +
                ", makeAndModel='" + makeAndModel + '\'' +
                ", owner='" + owner + '\'' +
                ", problemDescription='" + problemDescription + '\'' +
                ", repairNotes='" + repairNotes + '\'' +
                ", priority=" + priority +
                ", components=" + components +
                '}';
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public void setPriority(int priority) {
        this.priority = priority;
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    public void addComponents(Component components) {
        this.components.add(components);
    }
}
