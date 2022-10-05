package Karolina.brudnopis.Wzorce.Fabryka;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PolishRegistrationFactory polishRegistrationFactory = new PolishRegistrationFactory();
        List<Registration> registrations = new ArrayList<>();
        CarRegistration cr1 = (CarRegistration) polishRegistrationFactory.getPlate(RegistrationType.SAMOCHOD);
        cr1.setNumber("SK700GN");
        cr1.setSticker(true);
        registrations.add(cr1);
        MotorcycleRegistration cr2 = (MotorcycleRegistration) polishRegistrationFactory.getPlate(RegistrationType.MOTOCYKL);
        cr2.setNumber("SK1100");
        registrations.add(cr2);
        TruckRegistration cr3 = (TruckRegistration) polishRegistrationFactory.getPlate(RegistrationType.CIEZAROWKA);
        cr3.setNumber("SK442CU");
        cr3.setSize(Size.ŚREDNIA);
        cr3.setSticker(true);
        registrations.add(cr3);
        CarRegistration cr4 = (CarRegistration) polishRegistrationFactory.getPlate(RegistrationType.SAMOCHOD);
        cr4.setNumber("SK225KN");
        registrations.add(cr4);

        System.out.println(registrations.toString());
    }
}
