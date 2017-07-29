<%@page import="com.sv.udb.controlador.TipoPersCtrl"%>
<%@page import="com.sv.udb.modelo.TipoPers"%>
<%@page import="com.sv.udb.controlador.PersonaCtrl"%>
<%@page import="com.sv.udb.modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
            
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Guía 02 :::: POO2</title>
            <link rel='stylesheet' href='webjars/materialize/0.97.3/dist/css/materialize.min.css'>
             <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
            <script type="text/javascript" src="webjars/jquery/2.1.4/jquery.min.js"></script>
            <script type="text/javascript" src="webjars/materialize/0.97.3/dist/js/materialize.min.js"></script>
        </head>
    <body>
        <li><a href="jugadores.jsp">Jugadores</a></li>
        <h1>${mensAler}</h1>
        <div class="container">
            <form method="POST" action="EquiposServ" name="Demo">    
                <div class="row">
                    <div class="input-field col s6 m6 l6">
                      <input placeholder="Nombre" id="Nombre" type="text" class="validate">
                      <label for="Nombre">Nombre</label>
                    </div>
                    <div class="input-field col s6 m6 l6">
                      <input placeholder="Apellido" id="Apellido" type="text" class="validate">
                      <label for="Apellido">Apellido</label>
                    </div>
                </div>
                
                <div class="row">
                    <div class="input-field col s6 m6 l6">
                    <select name="equi" id="equi">
                      <option value="" disabled selected>Choose</option>
                    <%
                         for(TipoPers temp : new TipoPersCtrl().consTodo())
                     {
                    %>
                     <option value="<%=temp.getCodiTipo()%>"><%=temp.getNombTipo()%></option>
                     <%
                      }
                     %>
                     </select>
                    <label>Tipo Persna</label>
                  </div>
                    <div class="input-field col s6 m6 l6">
                        <select>
                          <option value="" disabled selected>Choose</option>
                          <option value="M">Masculino</option>
                          <option value="F">Femenino</option>
                        </select>
                        <label>Genero</label>
                      </div>
                </div>
                
                <div class="row">
                    <div class="input-field col s6 m6 l6">
                      <input placeholder="DUI" id="DUI" type="text" class="validate">
                      <label for="DUI">DUI</label>
                    </div>
                    <div class="input-field col s6 m6 l6">
                      <input placeholder="NIT" id="NIT" type="text" class="validate">
                      <label for="NIT">NIT</label>
                    </div>
                </div>
                <label>Id:</label>
                <input type="text" name="codi" id="codi" value="${codi}"/>
                 <label>Nombre:</label>
                <input type="text" name="nomb" id="nomb" value="${nomb}"/>
                 <label>Descripcion:</label>
                <input type="text" name="desc" id="desc" value="${desc}"/><br/>
                <input type="submit" name="btnEqui" value="Guardar"/>
                <input type="submit" name="btnEqui" value="Modificar"/>
            </form>
        </div>
         <h1>La Tabla</h1>  
         <form method="POST" action="EquiposServ" name="Tabla">                                                                                  
            <table border="1">
                <tr>
                    <th>Cons</th>
                    <th>Nombre</th>
                    <th>Apellido</th>                  
                </tr>
                <%
                 for(Persona temp : new PersonaCtrl().consTodo())
                 {
                %>     
                <tr>
                    <td><input type="radio" name="codiEquiRadi" value="<%=temp.getCodiPers()%>"></td>
                    <td><%=temp.getNombPers()%></td>
                    <td><%=temp.getApelPers()%></td>
                </tr>
                <%
                 }
                %>
            </table>
            <input type="submit" name="btnEqui" value="Consultar"/>
            <input type="submit" name="btnEqui" value="Eliminar"/>
         </form>
    </body>
    <script>
        $(document).ready(function() {
            $('select').material_select();
          });
    </script>
</html>
