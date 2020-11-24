package com.orderdealwith.pojo;

public class Things {
    private String hight;
    private String weight;

    public String getHight() {
        return hight;
    }

    public void setHight(String hight) {
        this.hight = hight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Things{" +
                "hight='" + hight + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
