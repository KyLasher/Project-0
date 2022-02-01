//Jonathan Luu CS1400.03

public class Player {
    private double foodSupply = 20;
    private double waterSupply = 20;
    private double staminaSupply = 20;
    private double foodFactor = 1.0;
    private double waterFactor = 1.0;
    private double staminaFactor = 1.0;

    //getters
    double getFoodSupply(){
        return foodSupply;
    }
    double getWaterSupply(){
        return waterSupply;
    }
    double getStaminaSupply(){
        return staminaSupply;
    }

    //setters
    void setFoodSupply(int amount){
        foodSupply = amount;
    }
    void setWaterSupply(int amount){
        waterSupply = amount;
    }
    void setStaminaSupply(int amount){
        staminaSupply = amount;
    }

    public boolean enter(Terrain square)
    {
        double food = square.foodCost();
        if (food > 0.0) {
            food *= foodFactor;
        }
        foodSupply -= food;
        if (foodSupply > 20.0) {
            foodSupply = 20.0;
        }
        if (foodSupply < 0.0) {
            return false; // The player has 'died'
        }

        double water = square.waterCost();
        if (water > 0.0) {
            water *= waterFactor;
        }
        waterSupply -= water;
        if (waterSupply > 20.0) {
            waterSupply = 20.0;
        }
        if (waterSupply < 0.0) {
            return false; // The player has 'died'
        }

        double stamina = square.staminaCost();
        if (stamina > 0.0) {
            stamina *= staminaFactor;
        }
        staminaSupply -= stamina;
        if (staminaSupply > 20.0) {
            staminaSupply = 20.0;
        }
        if (staminaSupply < 0.0) {
            return false; // The player has 'died'
        }
        return true;
    }

}
