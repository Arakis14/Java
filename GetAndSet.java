class Account {
    String name;
    double balance;

    double payTax() {
        return this.balance * 0.9;
    }

    String getName() {
        return this.name;
    }

    void setName(String newName) {
        this.name = newName;
    }
}



public class GetAndSet {

    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.name = "John";
        acc1.balance = 1000;
        System.out.println(acc1.payTax());
        System.out.println(acc1.getName());
        acc1.setName("Tom");
        System.out.println(acc1.getName());

    }
}