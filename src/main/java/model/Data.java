package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
    private int year;
    private double price;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCPUModel() {
        return CPUModel;
    }

    public void setCPUModel(String CPUModel) {
        this.CPUModel = CPUModel;
    }

    public String getHardDiskSize() {
        return hardDiskSize;
    }

    public void setHardDiskSize(String hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }
    @JsonProperty("CPU model")
    private String CPUModel;
    @JsonProperty("Hard disk size")
    private String hardDiskSize;
}
