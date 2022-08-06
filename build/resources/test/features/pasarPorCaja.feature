#language: es

  Característica: pasar por caja

    Antecedentes:
      Dado el usuario se encuentre en la pagina web
      Dado el usuario ingrese el usuario y la contraseña

      Escenario: el usuario da click en pasar por caja tres productos
        Cuando el usuario agrega tres articulos al carro de compra
        Y el usuario da click en pasar por caja - llenar los datos y cancelar compra
        Entonces el usuario visualizara no tienes ningun articulo en tu carrito de compras