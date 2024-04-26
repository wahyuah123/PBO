public abstract class IndonesianFood {
  private String name;
  private String region;

  public IndonesianFood(String name, String region) {
    this.name = name;
    this.region = region;
  }

  public String getName() {
    return name;
  }

  public String getRegion() {
    return region;
  }

  // Abstract method to be implemented by subclasses to describe how the food is prepared
  public abstract String howToPrepare();
}

public class SpicedFood extends IndonesianFood {
  private int spiceLevel; // Example property specific to spiced food

  public SpicedFood(String name, String region, int spiceLevel) {
    super(name, region);
    this.spiceLevel = spiceLevel;
  }

  @Override
  public String howToPrepare() {
    return super.howToPrepare() + " Use caution with spice level " + spiceLevel + ".";
  }

  // Example method demonstrating operator usage (comparison)
  public boolean isExtraSpicy() {
    return spiceLevel > 7;
  }
}

public class Example {
  public static void main(String[] args) {
    SpicedFood rendang = new SpicedFood("Rendang", "West Sumatra", 5);
    SpicedFood nasiRawon = new SpicedFood("Nasi Rawon", "East Java", 8);

    System.out.println(rendang.getName() + " (" + rendang.getRegion() + "): " + rendang.howToPrepare());

    // Example usage of operator (conditional)
    if (nasiRawon.isExtraSpicy()) {
      System.out.println("Warning: " + nasiRawon.getName() + " is very spicy!");
    } else {
      System.out.println(nasiRawon.getName() + " (" + nasiRawon.getRegion() + "): " + nasiRawon.howToPrepare());
    }

    // When these objects go out of scope (no references left), the garbage collector can reclaim the memory.
  }
}
