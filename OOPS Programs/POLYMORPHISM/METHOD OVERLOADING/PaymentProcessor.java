class PaymentProcessor {
    void makePayment(int amount) {
        System.out.println("Payment of Rupees " + amount + " made using cash.");
    }
    void makePayment(long cardNumber, int amount) {
        System.out.println("Payment of Rupees " + amount + " made using Credit Card (Card Number: " + cardNumber + ").");
    }
    void makePayment(String upiID, double amount) {
        System.out.println("Payment of Rupees " + amount + " made using UPI (UPI ID: " + upiID + ").");
    }
    public static void main(String[] args) {
        PaymentProcessor pp = new PaymentProcessor();
        pp.makePayment(500);                      
        pp.makePayment(1234567890123456L, 1500); 
        pp.makePayment("user@upi", 999.99);    
    }
}
