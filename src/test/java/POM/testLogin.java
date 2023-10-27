package POM;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class testLogin {
    private WebDriver driver;
    private IngresoPetStore ingresoformulario;

    @Before
    public void inicio(){

        ingresoformulario = new IngresoPetStore(driver);
        driver = ingresoformulario.conectorChrome();
        ingresoformulario.pagina("https://petstore.octoperf.com/actions/Catalog.action");
        driver.manage().window().maximize();

    }

    @After
    public void cerrar(){
        driver.quit();
    }


    @Test
    public void inicioExitoso(){
        ingresoformulario.ingresarinformacion("pruebajohn6","pruebajohn6","pruebajohn6", "john", "becerra","pruebajohn@prueba.com","3107716057","prueba","prueba","zipaquira","Cundinamarca","250251","Colombia", "pruebajohn6","pruebajohn6");
        Assert.assertEquals("Total: $37.00", ingresoformulario.mensajecompra());

    }
}
