package co.com.qvision.eribank.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target BUTTON_INITIAL = Target.the("Button message initial").located(By.id("android:id/button1"));
    public static final Target NAME_USER = Target.the("Imput text user name").located(By.id("com.experitest.ExperiBank:id/usernameTextField"));
    public static final Target PASS_USER = Target.the("Imput text user password").located(By.id("com.experitest.ExperiBank:id/passwordTextField"));
    public static final Target BUTTON_LOGIN = Target.the("Button login").located(By.id("com.experitest.ExperiBank:id/loginButton"));

}
