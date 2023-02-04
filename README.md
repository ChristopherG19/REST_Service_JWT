## Práctica#2
- Descripción
  - Debe crearse una API que contenga 2 servicios, uno público y otro con autenticación de JWT a través de Token.
  
- Resultados
  - El servicio público: http://localhost:8585/api/noauth/login donde se recibe un JSON como este: {"userName":"test","password":"test"} donde se verifica que este usuario se encuentre en la base de datos de Oracle y este retorna el token utilizado para el siguiente servicio.
  - El servicio con autenticación: http://localhost:8585/api/auth/hola donde se coloca el token que se obtuvo anteriormente. Si es válido accede al método de HolaMundo, de lo contrario no retorna nada.
