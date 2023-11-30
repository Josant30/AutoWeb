#language: es
@testfeature
Característica: Login

  @test
  Escenario: Iniciar sesión
    Dado que me encuentro en la página de login de platanitos
    Cuando doy click en cuenta
    Y inicio sesión con las credenciales usuario: "jos.ant.3010@gmail.com" y contraseña: "Anthony1902@"
    Entonces valido que aparezca un cuadro de texto con mis nombres

    Y me voy al menu principal de platanitos
    Y hago click en la categoria Ofertas
    Cuando selecciono Ofertas de Ropa
    Y hago click en las medias de bebé
    Y hago click en añadir al carrito
    Entonces doy click en el carrito
    Y valido que haya almenos un producto
