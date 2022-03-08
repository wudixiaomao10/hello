package com.carrysu.eatfood.entity;

public class Eatfood {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   public  Eatfood(){}

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    private int id;

    public Eatfood(int id, String food, String window) {
        this.id = id;
        this.food = food;
        this.window = window;
    }

    private String food;
    private String window;

    @Override
    public String toString() {
        return "requiem_food{" +
                "id=" + id +
                ", food='" + food + '\'' +
                ", window='" + window + '\'' +
                '}';
    }

}
