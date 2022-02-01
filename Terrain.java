//Jonathan Luu CS1400.03

public class Terrain {
    private double foodCost = 1.0;
    private double waterCost = 1.0;
    private double staminaCost = 1.0;

    public double foodCost(){
        return foodCost;
    }
    public double waterCost(){
        return waterCost;
    }
    public double staminaCost(){
        return staminaCost;
    }

    public void setFoodCost(double foodCost) {
        this.foodCost = foodCost;
    }
    public void setWaterCost(double waterCost) {
        this.waterCost = waterCost;
    }
    public void setStaminaCost(double staminaCost) {
        this.staminaCost = staminaCost;
    }

    /*   Terrain(double food, double water, double stamina){
        foodCost = food;
        waterCost = water;
        staminaCost = stamina;
    }*/
}
