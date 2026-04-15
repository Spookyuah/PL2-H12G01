class MiError extends Exception {
  public MiError(String mensaje) {
    super(mensaje);
  }
}

public class Ejemplo1_5 {

  public static void comprobarNumero(int n) throws MiError {
    if (n == 5) {
      throw new MiError("Número prohibido");
    }
    System.out.println("Número válido");
  }

  public static void main(String[] args) {

    try {
      comprobarNumero(5);
    } catch (MiError e) {
      System.out.println(e.getMessage());
    }
  }
}