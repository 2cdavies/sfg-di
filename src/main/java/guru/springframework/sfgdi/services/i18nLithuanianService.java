package guru.springframework.sfgdi.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("LT")
@Service("i18nService")
public class i18nLithuanianService implements  GreetingService {


    @Override
    public String sayGreeting() {
        return "Labas - Lietuviskas";
    }
}
