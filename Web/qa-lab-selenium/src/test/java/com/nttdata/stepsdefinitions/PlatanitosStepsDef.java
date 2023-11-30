package com.nttdata.stepsdefinitions;

import com.nttdata.steps.PlatanitosSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlatanitosStepsDef {
    private WebDriver driver;
    private Scenario scenario;
    private PlatanitosSteps objPlatanitos;


    @Before(order = 0)
    public void setUp(){
        //setUp
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void quitDriver(){
        driver.quit();
    }

    public void screenShot(){
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }
    @Dado("que me encuentro en la página de login de platanitos")
    public void queMeEncuentroEnLaPáginaDeLoginDePlatanitos() {
        driver.get("https://platanitos.com/");
        screenShot();
    }
    @Cuando("doy click en cuenta")
    public void doyClickEnCuenta() {
        objPlatanitos = new PlatanitosSteps(driver);
        objPlatanitos.seleccionarCuenta();
        screenShot();
    }
    @Y("inicio sesión con las credenciales usuario: {string} y contraseña: {string}")
    public void inicioSesiónConLasCredencialesUsuarioYContraseña(String user, String password) {
        PlatanitosSteps loginSteps = new PlatanitosSteps(driver);
        loginSteps.typeUser(user);
        loginSteps.typePassword(password);
        loginSteps.login();
        screenShot();
    }
    @Entonces("valido que aparezca un cuadro de texto con mis nombres")
    public void validoQueAparezcaMiNombre() {
        objPlatanitos = new PlatanitosSteps(driver);
        objPlatanitos.seleccionarMenudeUsuario();
        screenShot();
    }
    @Y("me voy al menu principal de platanitos")
    public void meVoyAlMenuPrincipalDePlatanitos() {
        objPlatanitos = new PlatanitosSteps(driver);
        objPlatanitos.seleccionarMenudePlatanitos();
        screenShot();
    }
    @Y("hago click en la categoria Ofertas")
    public void hagoClickEnLaCategoriaOfertas() {
        objPlatanitos = new PlatanitosSteps(driver);
        objPlatanitos.seleccionarBotonOfertas();
        screenShot();
    }
    @Cuando("selecciono Ofertas de Ropa")
    public void seleccionoOfertasDeRopa() {
        objPlatanitos = new PlatanitosSteps(driver);
        objPlatanitos.seleccionarOfertasDeRopa();
        screenShot();
    }
    @Y("hago click en las medias de bebé")
    public void hagoClickEnLasMediasDeBebé() {
        objPlatanitos = new PlatanitosSteps(driver);
        objPlatanitos.seleccionarProductoOferta();
        screenShot();
    }
    @Y("hago click en añadir al carrito")
    public void hacesClickEnAñadirAlCarrito() {
        objPlatanitos = new PlatanitosSteps(driver);
        objPlatanitos.seleccionarAnadirCarrito();
        screenShot();
    }
    @Entonces("doy click en el carrito")
    public void doyClickEnElCarrito() {
        objPlatanitos = new PlatanitosSteps(driver);
        objPlatanitos.seleccionarCarrito();
        screenShot();
    }
    @Y("valido que haya almenos un producto")
    public void validoQueHayaAlmenosUnProducto() {
        objPlatanitos = new PlatanitosSteps(driver);
        objPlatanitos.validarCarrito();
        screenShot();
    }
}
