package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Base {
    private WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver conectorChrome() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\John Sebastian\\IdeaProjects\\PARCIALJOHN\\src\\test\\java\\resource\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }
    public WebElement findElement(By localizador){
        return driver.findElement(localizador);
    }

    public List<WebElement> findElements(By localizador){
        return driver.findElements(localizador);
    }

    public String getText(WebElement elemento){
        return elemento.getText();
    }

    public void click(By localizador){
        driver.findElement(localizador).click();
    }

    public void texto(String input, By localizador){
        driver.findElement(localizador).sendKeys(input);
    }
    public Boolean isDisplayed(By localizador){
        try{
            return driver.findElement(localizador).isDisplayed();
        }catch(org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }
    public void pagina(String url){
        driver.get(url);
    }
}
