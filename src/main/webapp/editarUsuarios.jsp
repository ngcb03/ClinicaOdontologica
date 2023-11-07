<%@page import="com.clinicaodonto.logica.Usuario"%>
<%@include file="components/header.jsp"%>
<%@include file="components/main.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% Usuario usuario = (Usuario) request.getSession().getAttribute("usuarioEditar"); %>

<div class="container-fluid">
    <form class="user" action="SvEditUsuarios" method="POST">
      <div class="text-left">
        <h1 class="h4 text-gray-900 mb-4">Edición de Usuarios</h1>
        <p>Este es un apartado para editar un usuario del sistema.</p>
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
            value="<%=usuario.getNombre() %>"
            required
          />
        </div>
        <div class="col-sm-6 mb-3 mb-sm-0">
          <label for="contrasenia_usu">Contraseña anterior: <%=usuario.getContrasenia() %></label>
          <input
            type="password"
            class="form-control form-control-user"
            id="contrasenia_usu"
            placeholder="Contraseña"
            name="contrasenia_usu"
            value="<%=usuario.getContrasenia() %>"
            required
          />
        </div>
      </div>
      <div class="form-group row">
        <div class="col-sm-6 mb-3 mb-sm-0">
          <label for="contrasenia_usu2">Confirmar nueva contraseña:</label>
          <input
            type="password"
            class="form-control form-control-user"
            id="contrasenia_usu2"
            placeholder="Confirmar contraseña"
            name="contrasenia_usu2"
            value="<%=usuario.getContrasenia() %>"
            required
          />
        </div>
        <div class="col-sm-6 mb-3 mb-sm-0">
          <label for="rol_usu">Rol anterior: <%=usuario.getRol() %></label>
          <select name="rol_usu" id="rol_usu" class="form-control form-control-lg" title="Selecciona un rol para el usuario">
            <option value="administrador">Administrador</option>
            <option value="odontologo">Odontólogo</option>
            <option value="secretario">Secretario</option>
            <option value="invitado" selected>Invitado</option>
          </select>
        </div>
      </div>
      <br>
      <div class="col-sm-3 mb-3 mb-sm-0 text-center container">
        <input
          type="submit"
          class="btn btn-primary btn-user btn-block"
          value="Guardar modificación   "
        />
      </div>
    </form>
</div>
<br />

<%@include file="components/footer.jsp"%>

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
