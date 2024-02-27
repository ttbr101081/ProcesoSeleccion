Feature: plan de pruebas
  Scenario: Crear un usuario
    Given url 'https://petstore.swagger.io/v2/user/createWithArray'
    When request
    """
    [
  {
    "id": 0,
    "username": "Rodrigo",
    "firstName": "Rodrigo",
    "lastName": "Terán",
    "email": "test@test.com",
    "password": "12345",
    "phone": "1234567890",
    "userStatus": 1
  }
]
    """
    And method POST
    Then status 200

    Scenario: Buscar el usuario creado
      Given url 'https://petstore.swagger.io/v2/user/Rodrigo'
      When method GET
      Then status 200

  Scenario: Actualizar el nombre y el correo del usuario
    Given url 'https://petstore.swagger.io/v2/user/Rodrigo'
    When request
    """
    {
  "id": 0,
    "username": "Rodrigo",
    "firstName": "Bryan",
    "lastName": "Terán",
    "email": "test1@test.com",
    "password": "12345",
    "phone": "1234567890",
    "userStatus": 1
}
    """
    And method PUT
    Then status 200

  Scenario: Buscar el usuario actualizado
    Given url 'https://petstore.swagger.io/v2/user/Rodrigo'
    When method GET
    Then status 200

  Scenario: Eliminar el usuario
    Given url 'https://petstore.swagger.io/v2/user/Rodrigo'
    When method DELETE
    Then status 200