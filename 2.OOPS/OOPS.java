
public class OOPS {
    public static void main(String args[]) {
        // Create and test Pen object
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println("Pen color: " + p1.color);
        p1.setTip(5);
        System.out.println("Pen tip size: " + p1.tip);
        
        p1.setColor("red");
        System.out.println("Updated pen color: " + p1.color);
        p1.setTip(7);
        System.out.println("Updated pen tip size: " + p1.tip);
        
        System.out.println(); // For better readability

        // Create and test BankAccount object
        BankAccount B1 = new BankAccount();
        B1.username("Tushar");
        B1.setPassword("Tushar123");
        System.out.println("Bank Account Username: " + B1.getUsername());
        System.out.println("Bank Account Password: " + B1.getPassword());
    }
}

// Pen class
class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

// BankAccount class
class BankAccount {
    private String username;
    private String password;

    public void username(String newUsername) {
        this.username = newUsername;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public String getPassword() {
        return password;
    }
}
