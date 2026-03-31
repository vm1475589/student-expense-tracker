public class Expense {
    private int id;
    private String name;
    private String category;
    private double amount;

    public Expense(int id, String name, String category, double amount) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return id + ". " + name + " | " + category + " | ₹" + amount;
    }
}
