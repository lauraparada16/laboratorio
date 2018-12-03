<%-- 
    Document   : vendedor
    Created on : 2/12/2018, 03:38:39 PM
    Author     : Laura Parada
--%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
            <title>Vendedor</title>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
            <style>
               .clearfix:after {
                  content: "";
                  display: table;
                  clear: both;
                }

                a {
                  color: #5D6975;
                  text-decoration: underline;
                }

                body {
                  position: relative;                 
                  margin: 0 auto;
                  color: #001028;
                  background: #FFFFFF; 
                  font-family: Arial, sans-serif; 
                  font-size: 12px; 
                  font-family: Arial;
                }

                header {
                  padding: 10px 0;
                  margin-bottom: 30px;
                }

                #logo {
                  text-align: center;
                  margin-bottom: 10px;
                }

                #logo img {
                  width: 90px;
                }

                h1 {
                  border-top: 1px solid  #5D6975;
                  border-bottom: 1px solid  #5D6975;
                  color: #5D6975;
                  font-size: 2.4em;
                  line-height: 1.4em;
                  font-weight: normal;
                  text-align: center;
                  margin: 0 0 20px 0;
                  background: url(dimension.png);
                }

                #project {
                  float: left;
                }

                #project span {
                  color: #5D6975;
                  text-align: right;
                  width: 52px;
                  margin-right: 10px;
                  display: inline-block;
                  font-size: 0.8em;
                }

                #company {
                  float: right;
                  text-align: right;
                }

                #project div,
                #company div {
                  white-space: nowrap;        
                }

                table {
                  width: 100%;
                  border-collapse: collapse;
                  border-spacing: 0;
                  margin-bottom: 20px;
                }

                table tr:nth-child(2n-1) td {
                  background: #F5F5F5;
                }

                table th,
                table td {
                  text-align: center;
                }

                table th {
                  padding: 5px 20px;
                  color: #5D6975;
                  border-bottom: 1px solid #C1CED9;
                  white-space: nowrap;        
                  font-weight: normal;
                }

                table .service,
                table .desc {
                  text-align: left;
                }

                table td {
                  padding: 20px;
                  text-align: right;
                }

                table td.service,
                table td.desc {
                  vertical-align: top;
                }

                table td.unit,
                table td.qty,
                table td.total {
                  font-size: 1.2em;
                }

                table td.grand {
                  border-top: 1px solid #5D6975;;
                }

                #notices .notice {
                  color: #5D6975;
                  font-size: 1.2em;
                }

                footer {
                  color: #5D6975;
                  width: 100%;
                  height: 30px;
                  position: absolute;
                  bottom: 0;
                  border-top: 1px solid #C1CED9;
                  padding: 8px 0;
                  text-align: center;
                }

                              .pricing-table-signup-pro {
                margin-top: 25px;
                padding-bottom: 10px;
              }

              .pricing-table-signup-pro a {
                display: inline-block;
                width: 10%;
                height: 50px;
                background: #2980b9;
                line-height: 50px;

                text-align: center;
                color: #fff;
                text-decoration: none;
                text-transform: uppercase;
              }

              .pricing-table-signup-pro a:hover {
                text-decoration: none;
                background-color: #1d6391;
                color: #fff;
              }

              .pricing-table-signup-pro a:active {                
                background-color: #1d6391;
                color: #fff;
              }

            </style>
        </head>
        <body>
 <div class="container">
  <h2>ALL - MALL</h2>
  <p>Todo a sus manos</p>
  <ul class="nav nav-tabs">
    <li class="active"><a href="#home">Productos</a></li>
    <li><a href="#menu1">Factura</a></li>
  </ul>

  <div class="tab-content">
    <div id="home" class="tab-pane fade in active">
      <h3>Registro de productos vendidos</h3>
      <div class="container">                                                                                     
  <div class="table-responsive">          
  <table class="table">
    <thead>
      <tr>
        <th>ID PRODUCTO</th>
        <th>NOMBRE</th>
        <th>PRECIO</th>
        <th>CANTIDAD</th>
        <th>TOTAL</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>001</td>
        <td>Mermelada</td>
        <td>6.000</td>
        <td>5</td>
        <td>30.000</td>
      </tr>
    </tbody>
  </table>
  </div>
              <div class="pricing-table-signup-pro">
              <p><a href="#">Buscar</a> 
              <a href="#">Nuevo</a>
              <a href="#">Eliminar</a>
              <a href="#">Modificar</a></p>
            </div>
</div>
    </div>
    <div id="menu1" class="tab-pane fade">
      <h3>Factura</h3>
              <header class="clearfix">
      <div id="logo">
        <img src="images/allmall.png">
      </div>
      <h1>Factura</h1>
      <div id="company" class="clearfix">
        <div>ALL - MALL</div>
        <div>998654329-0,<br /> Calle 63 61-80</div>
        <div>2231626</div>
        <div><a href="mailto:allmall@gmail.com">allmall@gmail.com</a></div>
      </div>
      <div id="project">
        <div><span>SERVICIO</span> Productos de la canasta familiar</div>
        <div><span>CLIENTE</span> Diana Estrada</div>
        <div><span>DIRECCION</span> Calle 16 32-16 </div>
        <div><span>EMAIL</span> <a href="mailto:dianae@outlook.es">dianae@outlook.es</a></div>
        <div><span>FECHA</span> Agosto 17, 2018</div>
      </div>
    </header>
    <main>
      <table>
        <thead>
          <tr>
            <th class="service">PRODUCTO</th>
            <th class="desc">DESCRIPCION</th>
            <th>PRECIO</th>
            <th>CANTIDAD</th>
            <th>TOTAL</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td class="service">001</td>
            <td class="desc">Mermelada</td>
            <td class="unit">$6.000</td>
            <td class="qty">26</td>
            <td class="total">$156.000</td>
          </tr>
          <tr>
            <td colspan="4">SUBTOTAL</td>
            <td class="total">$156.000</td>
          </tr>
          <tr>
            <td colspan="4" class="grand total">TOTAL</td>
            <td class="grand total">$156.000</td>
          </tr>
        </tbody>
      </table>
      <div id="notices">
        <div>NOTICIA:</div>
        <div class="notice">10% de descuento en productos de aseo</div>
      </div>
    </main>
    </div>
  </div>
    <hr>
    <p class="act"><b>Actual</b>: <span></span></p>
    <p class="prev"><b>Antes</b>: <span></span></p>
</div>

<script>
$(document).ready(function(){
    $(".nav-tabs a").click(function(){
        $(this).tab('show');
    });
    $('.nav-tabs a').on('shown.bs.tab', function(event){
        var x = $(event.target).text();         // active tab
        var y = $(event.relatedTarget).text();  // previous tab
        $(".act span").text(x);
        $(".prev span").text(y);
    });
});
</script>
        </body>
    </html>
</f:view>

