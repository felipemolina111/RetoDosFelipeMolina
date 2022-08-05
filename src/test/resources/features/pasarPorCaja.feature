#language: es

  Característica: pasar por caja

    Antecedentes:
      Dado el usuario se encuentre en la pagina web
      Dado ingrese el usuario y la contraseña

      Escenario: pasar por caja tres productos
        Cuando agregar tres articulos al carro de compra
        Y passar por caja - llenar los datos y cancelar compra
        Entonces visualizara no tienes ningun articulo en tu carrito de compras