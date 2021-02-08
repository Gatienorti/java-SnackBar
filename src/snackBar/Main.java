package snackBar;

public class Main {
  public static void main(String[]args){

       VendingMachine v1 = new VendingMachine("Water");
       VendingMachine v2 = new VendingMachine("Apple");
       VendingMachine v3 = new VendingMachine("Chips");

       Customer c1 = new Customer("Elise", 25.00);
       Customer c2 = new Customer ("Bernard", 14.40);
       Customer c3 = new Customer("Raoul", 26.25);

       Snack s1 = new Snack ("Emptyness", 6, 1.20, v1.getId());
       Snack s2 = new Snack ("Something", 20, .75, v2.getId());
       Snack s3 = new Snack ("Something else", 22, 1.80, v3.getId());

       c3.buySnack(s2.getTotal(2));
       s2.buySnack(2);

       System.out.println(c3.getName() + " got "+ c3.getCash() + "Dolls Left");
       System.out.println(s2.getQuantity() +" of "+ s2.getName()+" are left");
  }
}
