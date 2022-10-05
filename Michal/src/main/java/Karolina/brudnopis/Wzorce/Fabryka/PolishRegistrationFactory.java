package Karolina.brudnopis.Wzorce.Fabryka;

public class PolishRegistrationFactory extends RegistrationFactory{

    @Override
    Registration getPlate(RegistrationType type) {
        if(type.equals(RegistrationType.SAMOCHOD)){
            return new CarRegistration(null, Language.PL, Size.ŚREDNIA, true);
        }
        if(type.equals(RegistrationType.MOTOCYKL)){
            return new MotorcycleRegistration(null, Language.PL, Size.ŚREDNIA, true);
                    }

        if(type.equals(RegistrationType.CIEZAROWKA)){
            return new TruckRegistration(null, Language.PL, Size.ŚREDNIA, true);
        }

        return null;
    }
}
