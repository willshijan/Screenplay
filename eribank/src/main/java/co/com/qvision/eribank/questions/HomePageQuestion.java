package co.com.qvision.eribank.questions;

import co.com.qvision.eribank.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class HomePageQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        return HomePage.MAKE_PAYMENT_BUTTON.resolveFor(actor).isClickable();
    }
    public static HomePageQuestion isClickable(){
        return new HomePageQuestion();
    }
}
