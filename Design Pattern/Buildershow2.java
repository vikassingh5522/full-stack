class Phone {
    private String Os;
    private String processor;
    private double ScreenSize;
    private int battary;
    private String color;
    private int Camera;

    // Constructor for Phone
    public Phone(String Os, String processor, double ScreenSize, int battary, int Camera, String color) {
        this.Os = Os;
        this.processor = processor;
        this.ScreenSize = ScreenSize;
        this.battary = battary;
        this.Camera = Camera;
        this.color = color;
    }

    // Optionally, you can override toString() to print the details of the Phone
    @Override
    public String toString() {
        return "Phone [Os=" + Os + ", processor=" + processor + ", ScreenSize=" + ScreenSize + ", battary=" + battary + ", Camera=" + Camera + ", color=" + color + "]";
    }
}

class PhoneBuilder {

    private String Os;
    private String processor;
    private double ScreenSize;
    private int battary;
    private String color;
    private int Camera;

    public PhoneBuilder setOs(String os) {
        this.Os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(Double ScreenSize) {
        this.ScreenSize = ScreenSize;
        return this;
    }

    public PhoneBuilder setBattary(int battary) {
        this.battary = battary;
        return this;
    }

    public PhoneBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public PhoneBuilder setCamera(int Camera) {
        this.Camera = Camera;
        return this;
    }

    public Phone getPhone() {
        return new Phone(Os, processor, ScreenSize, battary, Camera, color);
    }
}

public class Buildershow2 {
    public static void main(String[] args) {
        PhoneBuilder builder = new PhoneBuilder();
        builder.setOs("Android")
               .setProcessor("Snapdragon")
               .setScreenSize(6.5)
               .setBattary(5000)
               .setCamera(108)
               .setColor("Black");

        Phone p = builder.getPhone();
        System.out.println(p);
    }
}
