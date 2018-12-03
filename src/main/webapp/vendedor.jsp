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
            <title>JSP Page</title>
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
        <td>1</td>
        <td>Anna</td>
        <td>Pitt</td>
        <td>35</td>
        <td>New York</td>
      </tr>
    </tbody>
  </table>
  </div>
</div>
    </div>
    <div id="menu1" class="tab-pane fade">
      <h3>Factura</h3>
              <header class="clearfix">
      <div id="logo">
        <img src="C:/Users/Laura Parada/Documents/SextoSemestre/BaseDatos/allmall.png">
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
        <div><span>CLIENTE</span> John Doe</div>
        <div><span>DIRECCION</span> 796 Silver Harbour, TX 79273, US</div>
        <div><span>EMAIL</span> <a href="mailto:john@example.com">john@example.com</a></div>
        <div><span>FECHA</span> August 17, 2015</div>
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
            <td class="service">0001</td>
            <td class="desc">Pan BIMBO</td>
            <td class="unit">$4.000</td>
            <td class="qty">26</td>
            <td class="total">$104.000</td>
          </tr>
          <tr>
            <td class="service">Development</td>
            <td class="desc">Developing a Content Management System-based Website</td>
            <td class="unit">$40.00</td>
            <td class="qty">80</td>
            <td class="total">$3,200.00</td>
          </tr>
          <tr>
            <td class="service">SEO</td>
            <td class="desc">Optimize the site for search engines (SEO)</td>
            <td class="unit">$40.00</td>
            <td class="qty">20</td>
            <td class="total">$800.00</td>
          </tr>
          <tr>
            <td class="service">Training</td>
            <td class="desc">Initial training sessions for staff responsible for uploading web content</td>
            <td class="unit">$40.00</td>
            <td class="qty">4</td>
            <td class="total">$160.00</td>
          </tr>
          <tr>
            <td colspan="4">SUBTOTAL</td>
            <td class="total">$5,200.00</td>
          </tr>
          <tr>
            <td colspan="4">TAX 19%</td>
            <td class="total">$1,300.00</td>
          </tr>
          <tr>
            <td colspan="4" class="grand total">TOTAL</td>
            <td class="grand total">$6,500.00</td>
          </tr>
        </tbody>
      </table>
      <div id="notices">
        <div>NOTICE:</div>
        <div class="notice">10% de descuento en productos de aseo</div>
      </div>
    </main>
    <footer>
      Invoice was created on a computer and is valid without the signature and seal.
    </footer>
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

