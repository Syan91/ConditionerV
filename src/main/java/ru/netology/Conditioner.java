package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        // здесь уверены, что все проверки прошли
        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {
        int increasedCurrentTemperature = currentTemperature + 1;
        if (increasedCurrentTemperature > maxTemperature) {
            return;
        }
        this.currentTemperature = increasedCurrentTemperature;
    }

    public void decreasedCurrentTemperature() {
        int decreaseCurrentTemperature = currentTemperature - 1;
        if (decreaseCurrentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = decreaseCurrentTemperature;
    }

//    public void setCurrentTemperature(int currentTemperature) {
//        if (currentTemperature <= maxTemperature) {
//            if (currentTemperature >= minTemperature) {
//                this.currentTemperature = currentTemperature;
//            }
//        }
//    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}

