import java.util.HashMap;
import java.util.Map;

abstract class abstract_class {
  protected Map<String, String> apun_ka_map = new HashMap<>();
  protected abstract void register();
}

class BuntyBhau extends abstract_class {
  private static BuntyBhau instance = new BuntyBhau();
  private BuntyBhau() {}
  public static BuntyBhau getInstance() {
    return instance;
  }
  @Override
  protected void register() {
    apun_ka_map.put("bunty", "parle-g");
    System.out.println("bunty bhau added");
  }
}

class GaneshBhau extends abstract_class {
  private static GaneshBhau instance = new GaneshBhau();
  private GaneshBhau() {}
  public static GaneshBhau getInstance() {
    return instance;
  }
  @Override
  protected void register() {
    apun_ka_map.put("ganesh", "gopalmath");
    System.out.println("ganesh bhau added");
  }
}

public class SacredGames {

  static {
    GaneshBhau.getInstance().register();
    BuntyBhau.getInstance().register();
  }

  public static void main(String[] args) {
    System.out.println("chand par hai apun");
  }
}
