public class FussballManschaft {

    private double budget;
    private java.lang.String name;
    private java.lang.String ort;

    FussballManschaft(java.lang.String name, java.lang.String ort, double budget) {
        this.name = name;
        this.ort = ort;
        this.budget = budget;
    }

    double getBudget() {
        return this.budget;
    }

    java.lang.String getName() {
        return this.name;
    }

    java.lang.String getOrt() {
        return this.ort;
    }

    void setBudget(double budget) {
        this.budget = budget;
    }
    void setName(java.lang.String name) {
        this.name = name;
    }

    void setOrt(java.lang.String ort) {
        this.ort = ort;
    }

}