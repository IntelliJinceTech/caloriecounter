package JinTech.CalorieCounter;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DaySummary {
    private List<FoodEntry> foods = new ArrayList<>();

    public void addFoodEntry(FoodEntry foodEntry) {
        this.foods.add(foodEntry);
    }
}
