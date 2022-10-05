package Karolina.hotel;

import java.util.*;
import java.util.stream.Collectors;

public class Hotel {

  public static final Gosc DEFAULT_GOSC = new Gosc("Default", "Default");

  public static final Pokoj POKOJ_EKONOMICZNY_1 = new Pokoj(1, Standard.EKONOMICZNY);
  public static final Pokoj POKOJ_EKONOMICZNY_2 = new Pokoj(2, Standard.EKONOMICZNY);
  public static final Pokoj POKOJ_EKONOMICZNY_3 = new Pokoj(3, Standard.EKONOMICZNY);
  public static final Pokoj POKOJ_EKONOMICZNY_4 = new Pokoj(4, Standard.EKONOMICZNY);
  public static final Pokoj POKOJ_PODSTAWOWY_1 = new Pokoj(5, Standard.PODSTAWOWY);
  public static final Pokoj POKOJ_PODSTAWOWY_2 = new Pokoj(6, Standard.PODSTAWOWY);
  public static final Pokoj POKOJ_PODSTAWOWY_3 = new Pokoj(7, Standard.PODSTAWOWY);
  public static final Pokoj APARTAMENT_1 = new Pokoj(8, Standard.PREMIUM);
  public static final Pokoj APARTAMENT_2 = new Pokoj(9, Standard.PREMIUM);
  public static final Pokoj APARTAMENT_3 = new Pokoj(10, Standard.PREMIUM);

  private String nazwa;
  private String miasto;
  private Map<Pokoj, Gosc> mapaPokoi;

  public Hotel(String nazwa, String miasto) {
    this.nazwa = nazwa;
    this.miasto = miasto;
    this.mapaPokoi = new HashMap<>();
    mapaPokoi.put(POKOJ_EKONOMICZNY_1, DEFAULT_GOSC);
    mapaPokoi.put(POKOJ_EKONOMICZNY_2, DEFAULT_GOSC);
    mapaPokoi.put(POKOJ_EKONOMICZNY_3, DEFAULT_GOSC);
    mapaPokoi.put(POKOJ_EKONOMICZNY_4, DEFAULT_GOSC);
    mapaPokoi.put(POKOJ_PODSTAWOWY_1, DEFAULT_GOSC);
    mapaPokoi.put(POKOJ_PODSTAWOWY_2, DEFAULT_GOSC);
    mapaPokoi.put(POKOJ_PODSTAWOWY_3, DEFAULT_GOSC);
    mapaPokoi.put(APARTAMENT_1, DEFAULT_GOSC);
    mapaPokoi.put(APARTAMENT_2, DEFAULT_GOSC);
    mapaPokoi.put(APARTAMENT_3, DEFAULT_GOSC);
  }

  public void zameldujGoscia(Pokoj pokoj, Gosc gosc) {
    mapaPokoi.put(pokoj, gosc);
  }

  public Gosc wymeldujGoscia(Gosc gosc) {
    for(Map.Entry<Pokoj, Gosc> wpis : mapaPokoi.entrySet()) {
      if(wpis.getValue().equals(gosc)) {
        return mapaPokoi.put(wpis.getKey(), DEFAULT_GOSC);
      }
    }
    System.out.println("Podanego gościa nie ma w hotelu: " + gosc);
    return gosc;
  }

  public List<Pokoj> zwrocListeWolnychPokoi() {
 return mapaPokoi.entrySet().stream().filter(wpis -> wpis.getValue().equals(DEFAULT_GOSC)).map(Map.Entry::getKey).collect(Collectors.toList());

  }

  public String getNazwa() {
    return nazwa;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }

  public String getMiasto() {
    return miasto;
  }

  public void setMiasto(String miasto) {
    this.miasto = miasto;
  }

  public Map<Pokoj, Gosc> getMapaPokoi() {
    return mapaPokoi;
  }

  public void setMapaPokoi(Map<Pokoj, Gosc> mapaPokoi) {
    this.mapaPokoi = mapaPokoi;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Hotel)) {
      return false;
    }

    Hotel hotel = (Hotel) o;

    if (nazwa != null ? !nazwa.equals(hotel.nazwa) : hotel.nazwa != null) {
      return false;
    }
    if (miasto != null ? !miasto.equals(hotel.miasto) : hotel.miasto != null) {
      return false;
    }
    return mapaPokoi != null ? mapaPokoi.equals(hotel.mapaPokoi) : hotel.mapaPokoi == null;
  }

  @Override
  public int hashCode() {
    int result = nazwa != null ? nazwa.hashCode() : 0;
    result = 31 * result + (miasto != null ? miasto.hashCode() : 0);
    result = 31 * result + (mapaPokoi != null ? mapaPokoi.hashCode() : 0);
    return result;
  }

  public void wypiszHotel() {
    for(Map.Entry<Pokoj, Gosc> wpis: mapaPokoi.entrySet()) {
      System.out.println(wpis);
    }
  }

  public Gosc znajdzGosciaPoNumerzePokoju(int numerPokoju) {
    for(Pokoj pokoj: mapaPokoi.keySet()) {
      if(pokoj.getNumerPokoju() == numerPokoju) {
        return mapaPokoi.get(pokoj);
      }
    }
    System.out.println("W hotelu nie ma szukanego numeru pokoju.");
    return null;
  }

  public int znajdzNumerPokojuPoNazwiskuGoscia(String nazwisko) {
    for(Map.Entry<Pokoj, Gosc> wpis : mapaPokoi.entrySet()) {
      if(wpis.getValue().getNazwisko().equals(nazwisko)) {
        return wpis.getKey().getNumerPokoju();
      }
    }
    System.out.println("Podanego nazwiska nie ma w bazie.");
    return 0;
  }

    public Optional<Integer> znajdzNumerPokojuPoNazwiskuGosciaOptional (String nazwisko) {
        for(Map.Entry<Pokoj, Gosc> wpis : mapaPokoi.entrySet()) {
            if(wpis.getValue().getNazwisko().equals(nazwisko)) {
                return Optional.of(wpis.getKey().getNumerPokoju());
            }
        }
        System.out.println("Podanego nazwiska nie ma w bazie.");
        return Optional.empty();

    }

    public Optional<Integer> znajdzNumerPokojuPoNazwiskuGosciaOptionalStream (String nazwisko) {
      return  mapaPokoi.entrySet().stream().filter(wpis -> wpis.getValue().getNazwisko().equals(nazwisko))
              .map((wpis -> wpis.getKey().getNumerPokoju())).findFirst() ;


    }
  public List<Pokoj> znajdzWolnePokojeWStandardzie(Standard standard) {
    List<Pokoj> wolnePokoje = new ArrayList<>();
    for (Map.Entry<Pokoj, Gosc> wpis : mapaPokoi.entrySet()) {
      if(wpis.getKey().getStandard().equals(standard) && wpis.getValue().equals(DEFAULT_GOSC)) {
        wolnePokoje.add(wpis.getKey());
      }
    }
    return wolnePokoje;
  }

  public List<Pokoj> znajdzWolnePokojeWstandardzieStream (Standard standard) {
      return mapaPokoi.entrySet().stream().filter(wpis -> wpis.getValue().equals(DEFAULT_GOSC)).filter(wpis -> wpis.getKey().getStandard().equals(standard)).map(Map.Entry::getKey).collect(Collectors.toList());
  }

  @Override
  public String toString() {
    return "Hotel{" +
        "nazwa='" + nazwa + '\'' +
        ", miasto='" + miasto + '\'' +
        ", mapaPokoi=" + mapaPokoi +
        '}';
  }
}
