<%@page contentType="text/html" pageEncoding="UTF-8"%> 

<%@include file="/components/header.jsp"%> 
<%@include file="/components/main.jsp"%>

<div class="container-fluid">
  <form class="user">
    <div class="text-left">
      <h1 class="h4 text-gray-900 mb-4">Alta Odontólogos</h1>
      <p>Este es un apartado para dar de alta en el sistema a los diferentes odontólogos que trabajan en la entidad.</p>
      <br />
    </div>
    <div class="form-group row">
        <div class="col-sm-4 mb-3 mb-sm-0">
            <label for="dni">Número de cédula: </label>
        <input
          type="text"
          class="form-control form-control-user"
          id="dni"
          placeholder="Número de cédula"
          name="dni"
          required
        />
      </div>
      <div class="col-sm-4 mb-3 mb-sm-0">
          <label for="nombre_usuario">Nombres: </label>
        <input
          type="text"
          class="form-control form-control-user"
          id="nombre_usuario"
          placeholder="Nombres"
          name="nombre_usuario"
          required
        />
      </div>
        <div class="col-sm-4 mb-3 mb-sm-0">
            <label for="apellidos_usuarios">Apellidos: </label>
        <input
          type="text"
          class="form-control form-control-user"
          id="apellidos_usuarios"
          placeholder="Apellidos"
          name="apellidos_usuarios"
          required
        />
      </div>
    </div>
    <div class="form-group row">
      <div class="col-sm-4 mb-3 mb-sm-0">
          <label for="fecha_nac">Fecha de nacimiento: </label>
        <input
          type="date"
          class="form-control form-control-user"
          id="fecha_nac"
          name="fecha_nac"
          required
        />
      </div>
    </div>
    <div class="form-group row">
        <div class="col-sm-4 mb-3 mb-sm-0">
            <label for="num_telefono">Número de teléfono: </label>
        <input
          type="text"
          class="form-control form-control-user"
          id="num_telefono"
          placeholder="Número de teléfono"
          name="num_telefono"
          required
        />
      </div>
      <div class="col-sm-4 mb-3 mb-sm-0">
          <label for="direccion">Dirección de residencia: </label>
        <input
          type="text"
          class="form-control form-control-user"
          id="direccion"
          placeholder="Dirección de residencia"
          name="direccion"
          required
        />
      </div>
        <div class="col-sm-4 mb-3 mb-sm-0">
            <label for="especialidad">Especialidad: </label>
        <input
          type="text"
          class="form-control form-control-user"
          id="especialidad"
          placeholder="Especialidad"
          name="especialidad"
          required
        />
      </div>
      <!<!-- Acá se define todo lo que respecta a horarios y usuarios -->
    </div>
    <br>
    <div class="col-sm-3 mb-3 mb-sm-0 text-center container">
        <input type="submit" value="Dar de alta" class="btn btn-primary btn-user btn-block"/>
    </div>
  </form>
</div>
<br />

<%@include file="/components/footer.jsp"%>
