Feature: Prueba E2E


  @E2E
  Scenario: compra
    Given Agregar dos productos al carrito
    When Visualizar el carrito
    And Completar el Checkout como invitado Guest Checkout
    Then Finalizar la compra hasta la confirmación Your order has been placed


