import java.util.ArrayList;

public class ExpenseManager {

    private ArrayList<Expense> expenses = new ArrayList<>();
    private int nextId = 1;

    public void addExpense(String name, String category, double amount) {
        Expense e = new Expense(nextId++, name, category, amount);
        expenses.add(e);
        System.out.println("Expense added!");
    }

    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }

        for (Expense e : expenses) {
            System.out.println(e);
        }
    }

    public void deleteExpense(int id) {
        expenses.removeIf(e -> e.getId() == id);
        System.out.println("Deleted (if existed).");
    }

    public double getTotal() {
        double sum = 0;
        for (Expense e : expenses) {
            sum += e.getAmount();
        }
        return sum;
    }
}
