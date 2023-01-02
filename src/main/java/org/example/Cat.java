package org.example;


public class     Cat {
    private String name;
    private int weight;
    private boolean isAngry;


    public Cat(String name, int weight, boolean isAngry) throws Exception {
        if (weight <0) {
            throw new IncorrectCatWeightException("Неправильный кот");
        }
        this.name = name;
        this.weight = weight;
        this.isAngry = isAngry;
    }

    public void say(){
        System.out.println("Мяу !!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }
    @Override
    public String toString(){
        return "Кот "+name+" вес "+weight;
    }
}
