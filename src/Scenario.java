import java.util.List;

public class Scenario {
    private String name;
    private String description;
    private int riskAmount;
    private List<Step> steps;

    public Scenario(String name, String description, int riskAmount, List<Step> steps) {
        if (steps.size() != 4) {
            throw new IllegalArgumentException("A scenario must have exactly 4 steps.");
        }
        this.name = name;
        this.description = description;
        this.riskAmount = riskAmount;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getRiskAmount() {
        return riskAmount;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public int getNumberOfSteps() {
        return steps.size();
    }
}
