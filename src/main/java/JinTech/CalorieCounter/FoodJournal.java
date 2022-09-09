package JinTech.CalorieCounter;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FoodJournal {
    private List<FoodDetail> foods = new ArrayList<>();

    public void addFoodEntry(FoodDetail foodDetail) {
        this.foods.add(foodDetail);
    }
}
