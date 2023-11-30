package com.nttdata.steps;

import com.nttdata.page.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PlatanitosSteps {

    private WebDriver driver;

    //constructor
    public PlatanitosSteps(WebDriver driver){
        this.driver = driver;
    }
    /**
     * Escribir el usuario
     * @param user el usuario
     */
    public void typeUser(String user){
        WebElement userInputElement = driver.findElement(HomePage.ingCorreo);
        userInputElement.sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.btnInicioSesion));
    }
    public void typePassword(String password){
        this.driver.findElement(HomePage.ingPassword).sendKeys(password);
    }
    public void login(){
        this.driver.findElement(HomePage.btnInicioSesion).click();
    }
    public void seleccionarCuenta() {
        WebElement menuIdustriasYOficinas = driver.findElement(HomePage.menuCuenta);
        menuIdustriasYOficinas.click();
    }
    public void seleccionarMenudeUsuario() {
        WebElement wawa = driver.findElement(HomePage.nombre);
        String textoNombre = wawa.getText();
        if (textoNombre.equals("Joseph Anthony Vasquez Moreno")) {
            System.out.println("Nombre validado");
        } else{
            System.out.println("No estas loggeado, nombre no validado");
        }
        WebElement menuIdustriasYOficinas = driver.findElement(HomePage.validarIngreso);
        menuIdustriasYOficinas.click();
        System.out.println("Validamos ingreso");
    }
    public void seleccionarMenudePlatanitos() {
        WebElement menuIdustriasYOficinas = driver.findElement(HomePage.btnPrincipalPlatanitos);
        menuIdustriasYOficinas.click();
    }

    public void seleccionarBotonOfertas() {
        WebElement menuIdustriasYOficinas = driver.findElement(HomePage.ctgOfertas);
        menuIdustriasYOficinas.click();
    }
    public void seleccionarOfertasDeRopa() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement selecProducto = wait.until(ExpectedConditions.elementToBeClickable(HomePage.ofertasRopa));
        selecProducto.click();
    }
    public void seleccionarProductoOferta() {
        WebElement menuIdustriasYOficinas = driver.findElement(HomePage.productoOferta);
        menuIdustriasYOficinas.click();
    }
    public void seleccionarAnadirCarrito() {
        WebElement menuIdustriasYOficinas = driver.findElement(HomePage.btmAnadirCarrito);
        menuIdustriasYOficinas.click();
    }
    public void seleccionarCarrito() {
        WebElement menuIdustriasYOficinas = driver.findElement(HomePage.btnCarrito);
        menuIdustriasYOficinas.click();
    }
    public void validarCarrito() {
        WebElement carritoElement = driver.findElement(HomePage.vrfCarrito);

        // Validar que el elemento esté presente
        if (carritoElement.isDisplayed()) {
            System.out.println("Se ha agregado al menos un producto al carrito.");
        } else {
            System.out.println("El carrito está vacío o no se ha agregado ningún producto.");
        }
    }
}
