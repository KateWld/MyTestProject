package Lesson5;

public class FinancialRecord {
    double incomes;
    double outcomes;

    public FinancialRecord(double incomes, double outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public double getIncomes() {
        return incomes;
    }

    public void setIncomes(double incomes) {
        this.incomes = incomes;
    }

    public double getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(double outcomes) {
        this.outcomes = outcomes;
    }
}
