<%@page import="java.util.List"%>
<%@page import="com.clinicaodonto.logica.Usuario"%>

<%@include file="components/header.jsp"%>
<%@include file="components/main.jsp"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container-fluid">
    <div class="text-left">
        <h1 class="h4 text-gray-900 mb-4">Ver Usuarios</h1>
        <p>Este es un apartado para ver, actualizar y modificar a los diferentes usuarios del sistema.</p>
        <br />
    </div>
    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Listado de usuarios</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th style="text-align: center">Id</th>
                            <th>Nombre</th>
                            <th>Rol</th>
                            <th style="width: 206px">Acción</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>Id</th>
                            <th>Nombre</th>
                            <th>Rol</th>
                            <th style="width: 206px">Acción</th>
                        </tr>
                    </tfoot>
                    <tbody>
                        <% 
                            List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
                            if(listaUsuarios != null){
                                for(Usuario usuario: listaUsuarios){ 
                                    
                        %>
                        <tr>
                            <td id="id_usuario_cel"><%=usuario.getIdUsuario()%></td>
                            <td><%=usuario.getNombre()%></td>
                            <td><%=usuario.getRol()%></td>
                            <td style="display: flex; width: 196px;">
                                <form name="editar" action="SvEditUsuarios" method="POST">
                                    <button type="submit" class="btn btn-primary btn-user btn-block" 
                                        style="margin-right: 5px;">
                                        <i class="fas fa-pencil-alt"></i> Editar
                                    </button>
                                    <!-- El input funciona en lugares donde no se requiera visualizar el id -->
                                    <input type="hidden" name="id_usuario_sub1" value="<%=usuario.getIdUsuario()%>">
                                </form>
                                <form name="eliminar" action="SvElimUsuarios" method="POST">
                                    <button type="submit" class="btn btn-primary btn-user btn-block" 
                                        style="background-color: red; margin-left: 5px;">
                                        <i class="fas fa-trash-alt"></i> Eliminar
                                    </button>
                                    <input type="hidden" name="id_usuario_sub2" value="<%=usuario.getIdUsuario()%>">
                                </form>
                            </td>
                        </tr>
                        <% }} %>
                    </tbody>
                </table>
            </div>
        </div>


    </div>
</div>

<%@include file="components/footer.jsp"%>