package Karolina.hotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SiecHoteli {

  private Map<String, Hotel> siecHoteli;

  public static final Hotel KRAKUS = new Hotel("Krakus", "Kraków");
  public static final Hotel STOLECZNY = new Hotel("Stołeczny", "Warszawa");
  public static final Hotel GORALSKI = new Hotel("Góralski", "Zakopane");
  public static final Hotel NADMORSKI = new Hotel("Nadmorski", "Gdańsk");

  public SiecHoteli() {
    this.siecHoteli = new HashMap<>();
    siecHoteli.put("Kraków", KRAKUS);
    siecHoteli.put("Warszawa", STOLECZNY);
    siecHoteli.put("Zakopane", GORALSKI);
    siecHoteli.put("Gdańsk", NADMORSKI);
  }

  public List<Pokoj> znajdzListeWolnychPokoiWMiescie(String miasto) {
    List<Pokoj> wolnePokoje = new ArrayList<>();
    for (Map.Entry<String, Hotel> wpisDoSieci : siecHoteli.entrySet()) {
      if (wpisDoSieci.getKey().equals(miasto)) {
        for (Map.Entry<Pokoj, Gosc> hotel : wpisDoSieci.getValue().getMapaPokoi().entrySet()) {
          if (hotel.getValue().equals(Hotel.DEFAULT_GOSC)) {
            wolnePokoje.add(hotel.getKey());
          }
        }
      }
    }
    return wolnePokoje;
  }

  public int liczbaGosciZameldowanychWSieci() {
    int liczbaGosci = 0;
    for (Map.Entry<String, Hotel> wpisDoSieci : siecHoteli.entrySet()) {
      for (Gosc gosc : wpisDoSieci.getValue().getMapaPokoi().values()) {
        if (!gosc.equals(Hotel.DEFAULT_GOSC)) {
          liczbaGosci++;
        }
      }
    }
    return liczbaGosci;
  }

  public Map<String, Hotel> getSiecHoteli() {
    return siecHoteli;
  }

  public void setSiecHoteli(Map<String, Hotel> siecHoteli) {
    this.siecHoteli = siecHoteli;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof SiecHoteli)) {
      return false;
    }

    SiecHoteli that = (SiecHoteli) o;

    return siecHoteli != null ? siecHoteli.equals(that.siecHoteli) : that.siecHoteli == null;
  }

  @Override
  public int hashCode() {
    return siecHoteli != null ? siecHoteli.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "SiecHoteli{" +
        "siecHoteli=" + siecHoteli +
        '}';
  }
}
