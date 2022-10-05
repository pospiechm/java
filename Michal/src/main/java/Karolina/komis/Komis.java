package Karolina.komis;

import java.util.*;

public class Komis {

  private List<Samochod> lista;
  private Set<Samochod> set;

  public Komis() {
    this.lista = new ArrayList<>();
    this.set = new HashSet<>();
  }

  public void dodajSamochod(Samochod samochod) {
    lista.add(samochod);
    set.add(samochod);
  }

  public void kupionoSamochod(Samochod samochod) {
    lista.remove(samochod);
    if (!lista.contains(samochod)) {
      set.remove(samochod);
    }
  }

  public List<Samochod> znajdzSamochodyMarki(Marka marka) {
    List<Samochod> samochodyMarki = new ArrayList<>();
    for (Samochod samochod : lista) {
      if (samochod.getMarka().equals(marka)) {
        samochodyMarki.add(samochod);
      }
    }
    return samochodyMarki;
  }

  public List<Samochod> znajdzSamochodyMarkiiModelu(Marka marka, String model) {
    List<Samochod> samochodyMarkiIModelu = new ArrayList<>();
    for (Samochod samochod : lista) {
      if (samochod.getMarka().equals(marka) && samochod.getModel().equals(model)) {
        samochodyMarkiIModelu.add(samochod);
      }
    }
    return samochodyMarkiIModelu;
  }

  public List<Samochod> znajdzSamochodyZPrzedzialuLat(int dataOd, int dataDo) {
    List<Samochod> samochodyZPrzedzialu = new ArrayList<>();
    for (Samochod samochod : lista) {
      if (samochod.getRokProdukcji() >= dataOd && samochod.getRokProdukcji() <= dataDo) {
        samochodyZPrzedzialu.add(samochod);
      }
    }
    return samochodyZPrzedzialu;
  }

  public List<Samochod> znajdzSamochodyDoKwoty(int cena) {
    List<Samochod> samochodyDoKwoty = new ArrayList<>();
    for (Samochod samochod : lista) {
      if (samochod.getCena() < cena) {
        samochodyDoKwoty.add(samochod);
      }
    }
    return samochodyDoKwoty;
  }

  public Optional<Samochod> znajdzPierwszyNaLiscie() {
    return lista.stream().findFirst();
  }

  public void wypiszSamochody() {
    Iterator<Samochod> iterator = set.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

  public void wypiszModele() {
    lista.stream().map(Samochod::getModel).forEach(System.out::println);
  }


  public List<Samochod> getLista() {
    return lista;
  }

  public void setLista(List<Samochod> lista) {
    this.lista = lista;
  }

  public Set<Samochod> getSet() {
    return set;
  }

  public void setSet(Set<Samochod> set) {
    this.set = set;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Komis)) {
      return false;
    }

    Komis komis = (Komis) o;

    if (lista != null ? !lista.equals(komis.lista) : komis.lista != null) {
      return false;
    }
    return set != null ? set.equals(komis.set) : komis.set == null;
  }

  @Override
  public int hashCode() {
    int result = lista != null ? lista.hashCode() : 0;
    result = 31 * result + (set != null ? set.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Komis{" +
        "lista=" + lista +
        ", set=" + set +
        '}';
  }
}
