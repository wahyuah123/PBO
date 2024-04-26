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

public class NasiGoreng extends IndonesianFood {

  public NasiGoreng() {
    super("Nasi Goreng", "Java");
  }

  @Override
  public String howToPrepare() {
    return "Fried rice with stir-fried vegetables, meat, and egg.";
  }
}

public class Rendang {

  public Rendang() {
    super("Rendang", "West Sumatra");
  }

  @Override
  public String howToPrepare() {
    return "Slow-cooked meat in a rich curry sauce.";
  }
}

public class Example {
  public static void main(String[] args) {
    IndonesianFood nasiGoreng = new NasiGoreng();
    IndonesianFood rendang = new Rendang();

    System.out.println(nasiGoreng.getName() + " (" + nasiGoreng.getRegion() + "): " + nasiGoreng.howToPrepare());
    System.out.println(rendang.getName() + " (" + rendang.getRegion() + "): " + rendang.howToPrepare());
  }
}
