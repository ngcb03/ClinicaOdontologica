<%--  <%@page import="com.clinicaOdontologica.logica.Usuario"%> --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="components/header.jsp" %>
<%@include file="components/main.jsp" %>

<div class="container-fluid">
    <form class="user" action="SvUsuarios" method="POST">
      <div class="text-left">
        <h1 class="h4 text-gray-900 mb-4">Alta Usuarios</h1>
        <p>Este es un apartado para dar de alta a los diferentes usuarios del sistema.</p>
        <br />
      </div>
      <div class="form-group row">
        <div class="col-sm-6 mb-3 mb-sm-0">
          <label for="nombre_usu">Nombre de usuario:</label>
          <input
            type="text"
            class="form-control form-control-user"
            id="nombre_usu"
            placeholder="Nombre de usuario"
            name="nombre_usu"
            required
          />
        </div>
        <div class="col-sm-6 mb-3 mb-sm-0">
          <label for="contrasenia_usu">Contraseña:</label>
          <input
            type="password"
            class="form-control form-control-user"
            id="contrasenia_usu"
            placeholder="Contraseña"
            name="contrasenia_usu"
            required
          />
        </div>
      </div>
      <div class="form-group row">
        <div class="col-sm-6 mb-3 mb-sm-0">
          <label for="contrasenia_usu2">Confirmar contraseña:</label>
          <input
            type="password"
            class="form-control form-control-user"
            id="contrasenia_usu2"
            placeholder="Confirmar contraseña"
            name="contrasenia_usu2"
            required
          />
        </div>
        <div class="col-sm-6 mb-3 mb-sm-0">
          <label for="rol_usu">Rol usuario:</label>
          <select name="rol_usu" id="rol_usu" class="form-control form-control-lg">
            <option value="administrador">Administrador</option>
            <option value="invitado" selected>Invitado</option>
          </select>
        </div>
      </div>
      <br>
      <div class="col-sm-3 mb-3 mb-sm-0 text-center container">
        <input
          type="submit"
          class="btn btn-primary btn-user btn-block"
          value="Dar de alta"
        />
      </div>
    </form>
</div>
<br />


<%@include file="components/footer.jsp" %>

<script>
  function verificarContraseñas() {
    var contrasenia1 = document.getElementById("contrasenia_usu").value;
    var contrasenia2 = document.getElementById("contrasenia_usu2").value;

    if (contrasenia1 !== contrasenia2) {
      alert("Las contraseñas no coinciden. Por favor, inténtalo de nuevo.");
      event.preventDefault(); // Evitar que el formulario se envíe
    }
  }
  
  // Agrega un evento de escucha al formulario para llamar a la función verificarContraseñas
  document.querySelector(".user").addEventListener("submit", verificarContraseñas);
</script>