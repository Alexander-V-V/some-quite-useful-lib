package some.quite.useful.lib;

public class Magician extends AbstractHandler {

  @Override
  protected String providePattern() {
    return "shit|SHIT";
  }

  @Override
  protected String provideReplacement() {
    return "magic";
  }
}
