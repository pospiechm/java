package Karolina.mapy;

public class Pracownik {

  private Integer id;
  private String nazwisko;
  private String stanowisko;

  public Pracownik(Integer id, String nazwisko, String stanowisko) {
    this.id = id;
    this.nazwisko = nazwisko;
    this.stanowisko = stanowisko;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNazwisko() {
    return nazwisko;
  }

  public void setNazwisko(String nazwisko) {
    this.nazwisko = nazwisko;
  }

  public String getStanowisko() {
    return stanowisko;
  }

  public void setStanowisko(String stanowisko) {
    this.stanowisko = stanowisko;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Pracownik)) {
      return false;
    }

    Pracownik pracownik = (Pracownik) o;

    if (id != null ? !id.equals(pracownik.id) : pracownik.id != null) {
      return false;
    }
    if (nazwisko != null ? !nazwisko.equals(pracownik.nazwisko) : pracownik.nazwisko != null) {
      return false;
    }
    return stanowisko != null ? stanowisko.equals(pracownik.stanowisko) : pracownik.stanowisko == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
    result = 31 * result + (stanowisko != null ? stanowisko.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Pracownik{" +
        "id=" + id +
        ", nazwisko='" + nazwisko + '\'' +
        ", stanowisko='" + stanowisko + '\'' +
        '}';
  }
}
