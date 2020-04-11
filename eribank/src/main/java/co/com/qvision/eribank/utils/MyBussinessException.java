package co.com.qvision.eribank.utils;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class MyBussinessException extends SerenityManagedException{

    public MyBussinessException  (String message, Throwable tetsErrorExceptions){
        super(message, tetsErrorExceptions);
    }
}
