<%-- 
    Document   : administrador
    Created on : 2/12/2018, 03:39:00 PM
    Author     : Laura Parada
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
                        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
            <title>Administrador</title>
            <title>Bienvenido</title>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
            <script src="https://code.highcharts.com/js/highcharts.js"></script>
            <script src="https://code.highcharts.com/js/modules/exporting.js"></script>
            <script src="https://code.highcharts.com/highcharts.js"></script>
            <script src="https://code.highcharts.com/modules/data.js"></script>
            <script src="https://code.highcharts.com/modules/drilldown.js"></script>
            <style>

              @import 'https://code.highcharts.com/css/highcharts.css';

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



              #container2 {
                height: 400px;
                max-width: 800px;
                min-width: 320px;
                margin: 0 auto;
              }
              .highcharts-pie-series .highcharts-point {
                stroke: #EDE;
                stroke-width: 2px;
              }
              .highcharts-pie-series .highcharts-data-label-connector {
                stroke: silver;
                stroke-dasharray: 2, 2;
                stroke-width: 2px;
              }

            </style>
            
        </head>
        <body>
                    <div class="container">
          <ul class="nav nav-tabs">
            <li class="active"><a href="#inventario">INVENTARIO</a></li>
            <li><a href="#porcentaje">PORCENTAJE</a></li>
            <li><a href="#informe">INFORME</a></li>
            <li><a href="#ventasmes">VENTAS POR MES</a></li>
            <li><a href="#meta">META</a></li>
          </ul>

          <div class="tab-content">
            <div id="inventario" class="tab-pane fade in active">
              <h3>INVENTARIO  </h3>
              <div class="container">
              <h2>Tabla</h2>                                                                                      
              <div class="table-responsive">          
              <table class="table">
                <thead>
                  <tr>
                    <th>IDPRODUCTO</th>
                    <th>NOMBRE</th>
                    <th>CANTIDAD</th>
                    <th>PRECIO</th>
                    <th>CODIGO DE BARRAS</th>
                    <th>FECHA ENTRADA</th>
                    <th>FECHA CADUCIDAD</th>
                    <th>PROVEEDOR</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>001</td>
                    <td>Mermelada</td>
                    <td>150</td>
                    <td>2.500</td>
                    <td>000000001</td>
                    <td>2017-02-10</td>
                    <td>2020-02-10</td>
                    <td>BIMBO</td>
                  </tr>
                  <tr>
                    <td>002</td>
                    <td>Leche</td>
                    <td>250</td>
                    <td>3.500</td>
                    <td>000000002</td>
                    <td>2017-11-09</td>
                    <td>2020-11-09</td>
                    <td>ALQUERIA</td>
                  </tr>
                    <tr>
                    <td>003</td>
                    <td>Pan</td>
                    <td>2000</td>
                    <td>500</td>
                    <td>000000003</td>
                    <td>2017-03-10</td>
                    <td>2018-03-10</td>
                    <td>BIMBO</td>
                 </tr>
                    <tr>
                    <td>004</td>
                    <td>Huevos</td>
                    <td>400</td>
                    <td>9.500</td>
                    <td>000000004</td>
                    <td>2018-02-10</td>
                    <td>2018-05-10</td>
                    <td>AA</td>
                  </tr>
                    </tr>
                    <tr>
                    <td>005</td>
                    <td>Arroz</td>
                    <td>789</td>
                    <td>6.500</td>
                    <td>000000005</td>
                    <td>2017-02-10</td>
                    <td>2020-02-10</td>
                    <td>DIANA</td>
                  </tr>
                                   </tr>
                    <tr>
                    <td>006</td>
                    <td>Aceite</td>
                    <td>1500</td>
                    <td>7.000</td>
                    <td>000000006</td>
                    <td>2018-02-10</td>
                    <td>2019-01-20</td>
                    <td>GIRASOL</td>
                  </tr>
                </tbody>
              </table>
              </div>
            </div>
              <div class="pricing-table-signup-pro">
              <p><a href="#">Buscar</a> 
              <a href="#">Nuevo</a>
              <a href="#">Eliminar</a>
              <a href="#">Modificar</a></p>
            </div>
            </div>
            <div id="porcentaje" class="tab-pane fade">
              <h3>PORCENTAJE</h3>
              <div class="container">
              <h2>Tabla</h2>                                                                                      
              <div class="table-responsive">          
              <table class="table">
                <thead>
                  <tr>
                    <th>PRODUCTO</th>
                    <th>VENTAS</th>
                    <th>PORCENTAJE</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>001</td>
                    <td>600</td>
                    <td>148,5</td>
                  </tr>
                  <tr>
                    <td>002</td>
                    <td>60</td>
                    <td>71,4</td>
                  </tr>
                  <tr>
                    <td>003</td>
                    <td>100</td>
                    <td>106</td>
                  </tr>
                  <tr>
                    <td>004</td>
                    <td>30</td>
                    <td>135,6</td>
                  </tr>
                  <tr>
                    <td>005</td>
                    <td>6</td>
                    <td>30</td>
                  </tr>
                  <tr>
                    <td>006</td>
                    <td>800</td>
                    <td>176,6</td>
                  </tr>
                  <tr>
                    <td>007</td>
                    <td>200</td>
                    <td>144</td>
                  </tr>
                  <tr>
                    <td>008</td>
                    <td>690</td>
                    <td>129,2</td>
                  </tr>
                </tbody>
              </table>
              </div>
            </div>
            <div id="container2"></div>
              <script type="text/javascript">
                    Highcharts.chart('container2', {

                  title: {
                      text: 'Porcentaje de Ventas por Producto'
                  },

                  xAxis: {
                      categories: ['Mermelada', 'Leche', 'Pan', 'Huevos', 'Arroz', 'Aceite', 'Chocolate', 'Azucar', 'Cafe', 'Carne', 'Mani', 'Panela']
                  },

                  series: [{
                      type: 'pie',
                      allowPointSelect: true,
                      keys: ['name', 'y', 'selected', 'sliced'],
                      data: [
                          ['Mermelada', 148,5, false],
                          ['Leche', 30, false],
                          ['Pan', 71,4, false],
                          ['Huevos', 106, false],
                          ['Arroz', 135,6, false],
                          ['Aceite', 148,5, false],
                          ['Chocolate', 144, true, true],
                          ['Azucar', 176,6, false]
                      ],
                      showInLegend: true
                  }]
              });

              </script>

            </div>
            <div id="informe" class="tab-pane fade">
              <h3>INFORME</h3>
              <div class="container">
                <h2>Tabla</h2>                                                                                      
                <div class="table-responsive">          
                <table class="table">
                  <thead>
                    <tr>
                      <th>VENDEDOR</th>
                      <th>VENTAS</th>
                      <th>PORCENTAJE</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>1234</td>
                      <td>1000000</td>
                      <td>55,5</td>
                    </tr>
                  </tbody>
                </table>
                </div>
              </div>
              <div id="container3" style="min-width: 310px; height: 400px; margin: 0 auto"></div>

                  <script type="text/javascript">
                  // Create the chart
                  Highcharts.chart('container3', {
                      chart: {
                          type: 'column'
                      },
                      title: {
                          text: 'Informe de Ventas para cada vendedor por periodo'
                      },
                      xAxis: {
                          type: 'category'
                      },
                      yAxis: {
                          title: {
                              text: 'Total percent market share'
                          }

                      },
                      legend: {
                          enabled: false
                      },
                      plotOptions: {
                          series: {
                              borderWidth: 0,
                              dataLabels: {
                                  enabled: true,
                                  format: '{point.y:.1f}%'
                              }
                          }
                      },

                      tooltip: {
                          headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
                          pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b>{point.y:.2f}%</b> of total<br/>'
                      },

                      "series": [
                          {
                              "name": "Browsers",
                              "colorByPoint": true,
                              "data": [
                                  {
                                      "name": "Nicolas",
                                      "y": 62.74,
                                      "drilldown": "Nicolas"
                                  },
                                  {
                                      "name": "Luisa",
                                      "y": 10.57,
                                      "drilldown": "Luisa"
                                  },
                                  {
                                      "name": "Carolina",
                                      "y": 7.23,
                                      "drilldown": "Carolina"
                                  },
                                  {
                                      "name": "Esteban",
                                      "y": 5.58,
                                      "drilldown": "Esteban"
                                  },
                                  {
                                      "name": "Marcela",
                                      "y": 4.02,
                                      "drilldown": "Marcela"
                                  },
                                  {
                                      "name": "Camilo",
                                      "y": 1.92,
                                      "drilldown": "Camilo"
                                  },
                                  {
                                      "name": "Otro",
                                      "y": 7.62,
                                      "drilldown": null
                                  }
                              ]
                          }
                      ],
                      "drilldown": {
                          "series": [
                              {
                                  "name": "Nicolas",
                                  "id": "Nicolas",
                                  "data": [
                                      [
                                          "v65.0",
                                          0.1
                                      ],
                                      [
                                          "v64.0",
                                          1.3
                                      ],
                                      [
                                          "v63.0",
                                          53.02
                                      ],
                                      [
                                          "v62.0",
                                          1.4
                                      ],
                                      [
                                          "v61.0",
                                          0.88
                                      ],
                                      [
                                          "v60.0",
                                          0.56
                                      ],
                                      [
                                          "v59.0",
                                          0.45
                                      ],
                                      [
                                          "v58.0",
                                          0.49
                                      ],
                                      [
                                          "v57.0",
                                          0.32
                                      ],
                                      [
                                          "v56.0",
                                          0.29
                                      ],
                                      [
                                          "v55.0",
                                          0.79
                                      ],
                                      [
                                          "v54.0",
                                          0.18
                                      ],
                                      [
                                          "v51.0",
                                          0.13
                                      ],
                                      [
                                          "v49.0",
                                          2.16
                                      ],
                                      [
                                          "v48.0",
                                          0.13
                                      ],
                                      [
                                          "v47.0",
                                          0.11
                                      ],
                                      [
                                          "v43.0",
                                          0.17
                                      ],
                                      [
                                          "v29.0",
                                          0.26
                                      ]
                                  ]
                              },
                              {
                                  "name": "Luisa",
                                  "id": "Luisa",
                                  "data": [
                                      [
                                          "v58.0",
                                          1.02
                                      ],
                                      [
                                          "v57.0",
                                          7.36
                                      ],
                                      [
                                          "v56.0",
                                          0.35
                                      ],
                                      [
                                          "v55.0",
                                          0.11
                                      ],
                                      [
                                          "v54.0",
                                          0.1
                                      ],
                                      [
                                          "v52.0",
                                          0.95
                                      ],
                                      [
                                          "v51.0",
                                          0.15
                                      ],
                                      [
                                          "v50.0",
                                          0.1
                                      ],
                                      [
                                          "v48.0",
                                          0.31
                                      ],
                                      [
                                          "v47.0",
                                          0.12
                                      ]
                                  ]
                              },
                              {
                                  "name": "Carolina",
                                  "id": "Carolina",
                                  "data": [
                                      [
                                          "v11.0",
                                          6.2
                                      ],
                                      [
                                          "v10.0",
                                          0.29
                                      ],
                                      [
                                          "v9.0",
                                          0.27
                                      ],
                                      [
                                          "v8.0",
                                          0.47
                                      ]
                                  ]
                              },
                              {
                                  "name": "Esteban",
                                  "id": "Esteban",
                                  "data": [
                                      [
                                          "v11.0",
                                          3.39
                                      ],
                                      [
                                          "v10.1",
                                          0.96
                                      ],
                                      [
                                          "v10.0",
                                          0.36
                                      ],
                                      [
                                          "v9.1",
                                          0.54
                                      ],
                                      [
                                          "v9.0",
                                          0.13
                                      ],
                                      [
                                          "v5.1",
                                          0.2
                                      ]
                                  ]
                              },
                              {
                                  "name": "Marcela",
                                  "id": "Marcela",
                                  "data": [
                                      [
                                          "v16",
                                          2.6
                                      ],
                                      [
                                          "v15",
                                          0.92
                                      ],
                                      [
                                          "v14",
                                          0.4
                                      ],
                                      [
                                          "v13",
                                          0.1
                                      ]
                                  ]
                              },
                              {
                                  "name": "Camilo",
                                  "id": "Camilo",
                                  "data": [
                                      [
                                          "v50.0",
                                          0.96
                                      ],
                                      [
                                          "v49.0",
                                          0.82
                                      ],
                                      [
                                          "v12.1",
                                          0.14
                                      ]
                                  ]
                              }
                          ]
                      }
                  });
                  </script>
            </div>
            <div id="ventasmes" class="tab-pane fade">
              <h3>VENTAS POR MES</h3>
              <div class="container">
              <h2>Tabla</h2>                                                                                      
              <div class="table-responsive">          
              <table class="table">
                <thead>
                  <tr>
                    <th>MES</th>
                    <th>VENTAS</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>Marzo</td>
                    <td>190</td>
                  </tr>
                </tbody>
              </table>
              </div>
            </div>
            <div id="container4" style="min-width: 310px; height: 400px; margin: 0 auto"></div>
  <script type="text/javascript">

    Highcharts.chart('container4', {

        chart: {
            scrollablePlotArea: {
                minWidth: 700
            }
        },

        data: {
            csvURL: 'https://cdn.rawgit.com/highcharts/highcharts/' +
                '057b672172ccc6c08fe7dbb27fc17ebca3f5b770/samples/data/analytics.csv',
            beforeParse: function (csv) {
                return csv.replace(/\n\n/g, '\n');
            }
        },

        title: {
            text: 'Grafico de Evolucion de ventas por mes'
        },

        xAxis: {
            tickInterval: 7 * 24 * 3600 * 1000, // one week
            tickWidth: 0,
            gridLineWidth: 1,
            labels: {
                align: 'left',
                x: 3,
                y: -3
            }
        },

        yAxis: [{ // left y axis
            title: {
                text: null
            },
            labels: {
                align: 'left',
                x: 3,
                y: 16,
                format: '{value:.,0f}'
            },
            showFirstLabel: false
        }, { // right y axis
            linkedTo: 0,
            gridLineWidth: 0,
            opposite: true,
            title: {
                text: null
            },
            labels: {
                align: 'right',
                x: -3,
                y: 16,
                format: '{value:.,0f}'
            },
            showFirstLabel: false
        }],

        legend: {
            align: 'left',
            verticalAlign: 'top',
            borderWidth: 0
        },

        tooltip: {
            shared: true,
            crosshairs: true
        },

        plotOptions: {
            series: {
                cursor: 'pointer',
                point: {
                    events: {
                        click: function (e) {
                            hs.htmlExpand(null, {
                                pageOrigin: {
                                    x: e.pageX || e.clientX,
                                    y: e.pageY || e.clientY
                                },
                                headingText: this.series.name,
                                maincontentText: Highcharts.dateFormat('%A, %b %e, %Y', this.x) + ':<br/> ' +
                                    this.y + ' sessions',
                                width: 200
                            });
                        }
                    }
                },
                marker: {
                    lineWidth: 1
                }
            }
        },

        series: [{
            name: 'All sessions',
            lineWidth: 4,
            marker: {
                radius: 4
            }
        }, {
            name: 'New users'
        }]
    });
</script>
            </div>
          </div>
            <hr>
            <p class="act"><b>Actual</b>: <span></span></p>
            <p class="prev"><b>Anterior</b>: <span></span></p>
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
