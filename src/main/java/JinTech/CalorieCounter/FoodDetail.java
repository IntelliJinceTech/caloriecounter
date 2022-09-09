package JinTech.CalorieCounter;


import lombok.Data;

@Data
public class FoodDetail {
    private String id;
    private String name;
    private String cuisine;
    public Float portionSize;
    private Integer calorieEstimate;

    public enum Macro {
        PROTEIN,CARBOHYDRATES,FAT
    }

    public enum Meal {
        BREAKFAST,LUNCH,DINNER,SNACK
    }
}
