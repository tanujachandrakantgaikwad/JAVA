//Define a class product(pid,pname,price). Write a function to accept the product details, to 
//display product details and to calculate total amount. (use array of Objects) 
class Product
 {
    int pid;
    String pname;
    double price;

    Product(int pid, String pname, double price) 
 {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    void display() 
 {
        System.out.println("ID: " + pid + ", Name: " + pname + ", Price: " + price);
    }

    public static void main(String[] args) 
{
        Product[] products = new Product[3];

        products[0] = new Product(101, "Pen", 10);
        products[1] = new Product(102, "Book", 50);
        products[2] = new Product(103, "Bag", 500);

        double total = 0;

        System.out.println("--- Product Details ---");
        for (int i = 0; i < products.length; i++) 
   {
            products[i].display();
            total += products[i].price; 
        }

        System.out.println("Total Amount = " + total);
    }
}
