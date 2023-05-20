package Weekly Objectives and Work.Week 4;

public class W4InvoiceTest {
    public static void main(String[] args) {
        // Create an invoice using zero argument constructor
        Invoice invoice1 = new Invoice();
        invoice1.setPartNumber("123");
        invoice1.setPartDescription("Widget");
        invoice1.setQuantity(5);
        invoice1.setPricePerItem(9.99);

        // Create an invoice using 4-argument constructor
        Invoice invoice2 = new Invoice("456", "Gadget", 3, 14.99);

        // Display invoice details
        System.out.println("Invoice 1");
        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Part Description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price Per Item: " + invoice1.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice1.getInvoiceAmount());

        System.out.println();

        System.out.println("Invoice 2");
        System.out.println("Part Number: " + invoice2.getPartNumber());
        System.out.println("Part Description: " + invoice2.getPartDescription());
        System.out.println("Quantity: " + invoice2.getQuantity());
        System.out.println("Price Per Item: " + invoice2.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice2.getInvoiceAmount());
    }
}
