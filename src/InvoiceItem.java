public class InvoiceItem {
    private String id;
    private String desc;
    private double unitPrice;
    private int qty;

    public InvoiceItem(String id, String desc, double unitPrice, int qty) {
        this.id = id;
        this.desc = desc;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }

    public String getid() {
        return id;
    }

    public String getDesc() {
        return desc;
    }


    public int getQty() {
        return qty;
    }

    public void SetQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void SetUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal() {
        return unitPrice * qty;

    }
    @Override
    public String toString() {
        return "InvoiceItem[id=" +id+ " ,desc="+ desc+ "  ,qty="+ qty+ " ,unitPrice=" + unitPrice + "]";

    }
}
