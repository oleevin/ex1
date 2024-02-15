package Ex2;

public class Sale {
    Customer cus;
    String date;
    double serviceExpense;
    double ProductExpense;

    public Sale(Customer cus, String date) {
        this.cus = cus;
        this.date = date;
    }

    public double getProductExpense() {
        return ProductExpense;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setProductExpense(double productExpense) {
        ProductExpense = productExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double   getTotalExpense() {
        return 1;
    }
    public void displayInfo() {
        double total = 0;

        System.out.println("Name : " + cus.customerName);
        System.out.println("Type : " + cus.customerType);
        if(cus.customerType == "Normal") {
            total = serviceExpense;
            System.out.println("Service Expense : " + Double.toString(total));
            total += ProductExpense;
            System.out.println("Product Expense : " + Double.toString(ProductExpense));
        }else if(cus.customerType == "Silver") {
            total = serviceExpense * 0.9;
            System.out.println("Service Expense : " + Double.toString(total));
            total += ProductExpense * 0.9;
            System.out.println("Product Expense : " + Double.toString(ProductExpense * 0.9));
        }else if(cus.customerType == "Gold") {
            total = serviceExpense * 0.85;
            System.out.println("Service Expense : " + Double.toString(total));
            total += ProductExpense * 0.9;
            System.out.println("Product Expense : " + Double.toString(ProductExpense * 0.9));
        }else if(cus.customerType == "Premium") {
            total = serviceExpense * 0.8;
            System.out.println("Service Expense : " + Double.toString(total));
            total += ProductExpense * 0.9;
            System.out.println("Product Expense : " + Double.toString(ProductExpense * 0.9));
        }


        System.out.println("total is : " + Double.toString(total));

        System.out.println("\n\n");
    }
}
