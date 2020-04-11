package co.com.qvision.eribank.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target MAKE_PAYMENT_BUTTON = Target.the("Button make payment").located(By.id("com.experitest.ExperiBank:id/makePaymentButton"));

}
