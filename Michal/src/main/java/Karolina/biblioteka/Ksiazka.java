package Karolina.biblioteka;

public class Ksiazka {

  private String nazwa;
  private String autor;

  public Ksiazka(String nazwa, String autor) {
    this.nazwa = nazwa;
    this.autor = autor;
  }

  public String getNazwa() {
    return nazwa;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Ksiazka)) {
      return false;
    }

    Ksiazka ksiazka = (Ksiazka) o;

    if (nazwa != null ? !nazwa.equals(ksiazka.nazwa) : ksiazka.nazwa != null) {
      return false;
    }
    return autor != null ? autor.equals(ksiazka.autor) : ksiazka.autor == null;
  }

  @Override
  public int hashCode() {
    int result = nazwa != null ? nazwa.hashCode() : 0;
    result = 31 * result + (autor != null ? autor.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Ksiazka{" +
        "nazwa='" + nazwa + '\'' +
        ", autor='" + autor + '\'' +
        '}';
  }
}
