package co.com.qvision.eribank.utils;

public enum ExceptionMessages {

    EXCEPTION_AL_BUSCAR_ELEMENTO("No se encontro el elemento");
/*    EXCEPTION_AL_CERRAR_INGRESO_CLAVE("No se cerro sesion en ingreso clave");
    EXCEPTION_AL_ESPERAR("No se espero el tiempo indicado");
    EXCEPTION_AL_HACER_SCROLL("Error al hacer scroll");
    EXCEPTION_AL_OCULTAR_TECLADO("Error al ocultar teclado");
    EXCEPTION_AL_REFRESCAR_PANTALLA("Error al refrescar pantalla");
    EXCEPTION_AL_SELECCIONAR_UN_MES("Error al convertir numero de mes a nomnbre");
    EXCEPTION_AL_SELECCIONAR_UN_TIPO_DOCUMENTO("Error al completar el numero de documento para IOS");
    EXCEPTION_ERROR_AL_PRESEIONAR_BOTON("Error al presionar un boton");
    EXCEPTION_ERROR_LEER_ARCHIVO("Error al abrir el archivo");
    EXCEPTION_NO_CREATE_DRIVER("Error al crear el driver");
    EXCEPTION_NO_SE_ENCONTRO_PLATAFORMA("Error al encontrar la plataforma a ejecutar");*/




     private final String mensaje;


    private ExceptionMessages(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje(){
        return this.mensaje;
    }
}
