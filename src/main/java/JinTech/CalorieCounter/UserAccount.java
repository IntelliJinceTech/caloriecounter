package JinTech.CalorieCounter;

import lombok.Data;

@Data
public class UserAccount {
    private final String firstName;
    private final String lastName;
    private Integer age;
    private String gender;
    private Integer height; //inches
    private Integer currentWeight;
    private Integer targetWeight;
    private Integer exerciseLevel;
    private Float tdee;

}
