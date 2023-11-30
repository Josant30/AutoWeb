package com.nttdata.page;

import org.openqa.selenium.By;

public class HomePage {
    public static By menuCuenta = By.xpath("//img[@id='ImgAccount']");
    public static By ingCorreo = By.xpath("//input[@id='email']");
    public static By ingPassword = By.xpath("//input[@id='password']");
    public static By nombre = By.xpath("//body/div[@id='body-cuenta']/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/p[1]");
    public static By validarIngreso = By.xpath("//body/div[@id='body-cuenta']/div[3]/div[1]/div[1]/div[1]/div[1]");

    public static By btnInicioSesion = By.xpath("//button[@id='btn_submit']");
    public static By btnPrincipalPlatanitos = By.xpath("//header/div[@id='topmenu']/div[@id='smartbanner-push-navbar']/div[2]/div[1]/a[1]/img[1]");
    public static By ctgOfertas = By.xpath("//header/div[2]/nav[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[7]/h2[1]/a[1]");
    public static By ofertasRopa = By.xpath("//body/div[@id='body-Ofertas']/div[4]/div[1]/div[1]/a[1]/img[1]");

    public static By productoOferta = By.xpath("//body/div[@id='body-productos']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]/section[1]/img[1]");

    public static By btmAnadirCarrito = By.xpath("//button[@id='btn_add_cart_full']");
    public static By btnCarrito = By.xpath("//img[@id='ImgCar']");
    public static By vrfCarrito = By.xpath("//a[contains(text(),'Continuar')]");








}
