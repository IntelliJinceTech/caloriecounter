package JinTech.CalorieCounter;


import lombok.Data;

@Data
public class FoodDetails {
    private String id;
    private String name;
    private String cuisine;
    private Integer calorieEstimate;

    public enum Macro {
        PROTEIN,CARBOHYDRATES,FAT
    }

    public enum Meal {
        BREAKFAST,LUNCH,DINNER,SNACK
    }
}
