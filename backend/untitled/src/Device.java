public class Device {
    private Integer serialNumber;
    private String name;
    private int amountMacAddress;
    private Range range;
    private int firstMacAddress;

    public Device() {
    }

    public Device(Integer serialNumber, String name, int amountMacAddress, int firstMacAddress) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.amountMacAddress = amountMacAddress;
        this.firstMacAddress = firstMacAddress;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountMacAddress() {
        return amountMacAddress;
    }

    public void setAmountMacAddress(int amountMacAddress) {
        this.amountMacAddress = amountMacAddress;
    }

    public int getFirstMacAddress() {
        return firstMacAddress;
    }

    public void setFirstMacAddress(int firstMacAddress) {
        this.firstMacAddress = firstMacAddress;
    }



}
