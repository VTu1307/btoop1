public class testinvoiceitem {
    public static void main(String[] args) { // Kiểm tra hàm tạo và toString()
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 0.08, 888);
        System.out.println(inv1);   // toString(); // Kiểm tra các phương thức thiết lập và lấy dữ liệu
        inv1.SetQty(999);
        inv1.SetUnitPrice(0.99);
        System.out.println(inv1);   // toString();
        System.out.println("id là: " + inv1.getid());
        System.out.println("desc là: " + inv1.getDesc());
        System.out.println("qty là: " + inv1.getQty());
        System.out.println("unitPrice là: " + inv1.getUnitPrice()); // Kiểm tra getTotal()
        System.out.println("Tổng số là: " + inv1.getTotal());
    }
}
