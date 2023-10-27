package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IngresoPetStore extends Base{
    private By btnsignin= By.xpath("//a[.='Sign In']");
    private By btnRegistrar = By.xpath("//a[.='Register Now!']");

    private By usuarioID = By.xpath("//input[@name='username']");
    private By txtpassword = By.xpath("//input[@name='password']");
    private By txtpasswordrepeat = By.xpath("//input[@name='repeatedPassword']");
    private By txtfirstname = By.xpath("//input[@name='account.firstName']");
    private By txtlastname = By.xpath("//input[@name='account.lastName']");
    private By txtemail = By.xpath("//input[@name='account.email']");
    private By txtphone = By.xpath("//input[@name='account.phone']");
    private By txtaddress1 = By.xpath("//tr[5]//input[1]");
    private By txtaddress2 = By.xpath("//tr[6]//input[1]");
    private By txtcity = By.xpath("//input[@name='account.city']");
    private By txtstate = By.xpath("//input[@name='account.state']");
    private By txtzip = By.xpath("//input[@name='account.zip']");
    private By txtcountry = By.xpath("//input[@name='account.country']");
    private By enablemylist = By.xpath("//input[@name='account.listOption']");
    private By enablemybanner = By.xpath("//input[@name='account.bannerOption']");
    private By btnregistroexitoso = By.xpath("//input[@name='newAccount']");


    private By txtusuarioingreso = By.xpath("//input[@name='username']");
    private By txtpassingreso = By.xpath("//input[@name='password']");
    private By btndogs = By.xpath("//img[@src='../images/sm_dogs.gif']");
    private By btnbulldog = By.xpath("//a[.='K9-BD-01']");
    private By btnmaledog = By.xpath("//tr[2]//a[.='Add to Cart']");
    private By btnreturn = By.xpath("//a[.='Return to Main Menu']");
    private By btnpoodle = By.xpath("//a[.='K9-PO-02']");
    private By btnagregar = By.xpath("//a[.='Add to Cart']");
    private By btnproceder = By.xpath("//a[.='Proceed to Checkout']");
    private By btncontinue = By.xpath("//input[@name='newOrder']");
    private By btnconfirmar = By.xpath("//a[.='Confirm']");

    private By mensaje = By.cssSelector("[colspan='5']");




    public IngresoPetStore(WebDriver driver) {

        super(driver);

    }

    //METODO INICIA SESION

    public void ingresarinformacion(String user, String pass, String pass1, String firstname, String lastname, String email, String phone, String addr1, String addr2, String city, String state, String zip, String country, String using, String passing){
        click(btnsignin);
        click(btnRegistrar);
        texto(user,usuarioID);
        texto(pass, txtpassword);
        texto(pass1, txtpasswordrepeat);
        texto(firstname, txtfirstname);
        texto(lastname, txtlastname);
        texto(email, txtemail);
        texto(phone, txtphone);
        texto(addr1, txtaddress1);
        texto(addr2, txtaddress2);
        texto(city, txtcity);
        texto(state, txtstate);
        texto(zip, txtzip);
        texto(country, txtcountry);
        click(enablemylist);
        click(enablemybanner);
        click(btnregistroexitoso);
        click(btnsignin);
        texto(using,txtusuarioingreso);
        texto(passing,txtpassingreso);
        click(btndogs);
        click(btnbulldog);
        click(btnmaledog);
        click(btnreturn);
        click(btndogs);
        click(btnpoodle);
        click(btnagregar);
        click(btnproceder);
        click(btncontinue);
        click(btnconfirmar);




    }

    public String mensajecompra(){
        return findElement(mensaje).getText();
    }


}
