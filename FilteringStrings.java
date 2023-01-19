class ItemSeparator {
    private String name;
    private Double price;
    private Integer quantity;

    public ItemSeparator(String rawInput) {
        String[] parts = rawInput.split("\\$\\$##");
        this.name = parts[0];
        this.price = Double.parseDouble(parts[1]);
        this.quantity = Integer.parseInt(parts[2]);
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }
}