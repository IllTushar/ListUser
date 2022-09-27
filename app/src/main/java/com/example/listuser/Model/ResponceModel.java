package com.example.listuser.Model;

public class ResponceModel
{
    int id,total;
    String name,year,color,panton_value;

    public ResponceModel() {
    }

    public ResponceModel(int id, int total, String name, String year, String color, String panton_value) {
        this.id = id;
        this.total = total;
        this.name = name;
        this.year = year;
        this.color = color;
        this.panton_value = panton_value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPanton_value() {
        return panton_value;
    }

    public void setPanton_value(String panton_value) {
        this.panton_value = panton_value;
    }
}
