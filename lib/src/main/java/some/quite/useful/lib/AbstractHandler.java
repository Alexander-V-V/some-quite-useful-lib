package some.quite.useful.lib;

public abstract class AbstractHandler implements MessageHandler {

  @Override
  public String handleMessage(String message) {
    try {
      return message.replaceAll("shit|SHIT", "****");
    } catch (Exception e) {
      return message;
    }
  }

  protected abstract String providePattern();

  protected abstract String provideReplacement();
}
