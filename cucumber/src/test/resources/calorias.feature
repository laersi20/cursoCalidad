Feature: Info Calorias

# Datos instantaneos se muestran
  Scenario: Se muestran datos instantaneos
	Given usuario accede app
    When usuario comienza entrenamiento
    Then muestra diagrama con datos

# Datos instantaneos en reposo
  Scenario: Se muestran datos instantaneos a cero
	Given usuario accede app
    When usuario para
    Then muestra diagrama con datos a cero
