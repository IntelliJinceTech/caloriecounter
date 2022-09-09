package JinTech.CalorieCounter.Web;

import JinTech.CalorieCounter.FoodDetail;
import JinTech.CalorieCounter.FoodDetail.Macro;
import JinTech.CalorieCounter.FoodDetail.Meal;
import JinTech.CalorieCounter.FoodJournal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Controller
@RequestMapping("/journal")
@SessionAttributes("foodJournal")
public class FoodJournalController {

    @ModelAttribute
    public void addFoodDetailsToModel (Model model) {
        List<FoodDetail> foodDetails = Arrays.asList(
          new FoodDetail("TACO", "taco", "Mexican",0.75,500, Macro.CARBOHYDRATES, Meal.DINNER),
        );

        Meal[] meals = FoodDetail.Meal.values();
        for (Meal meal: meals) {
            model.addAttribute(meal.toString().toLowerCase(),
                    filterByType(foodDetails), meal);
        }


    }

    @ModelAttribute(name = "foodJournal")
    public FoodJournal journal() { return new FoodJournal();}
}
