<%@ page contentType = "text/html; charset = UTF-8" %>
<%@ taglib prefix = "s" uri = "/struts-tags" %>

<html>
<head>
    <title>Hello World</title>
    <link rel="stylesheet" type="text/css" href="css/Style.css">
</head>
<div id="container" style="width: 1650px; height: 400px;float: right"></div>

<div  id="module" style="height: 800px;background: LightSkyBlue;with: 500px;float: left">
	<h2 style="margin: 40px; font-size: 40px;border-butom: 1px solid back;text-align: center">Modules</h2>
	 <div class="container">
		  <div class="round">
			    <input type="checkbox" id="checkbox" class="test"  name="gender" value="ENR062A3"> ENR062A3 <br>
			    <label for="checkbox"></label>
		  </div>
	</div>
	<div class="container">
		  <div class="round">
			    <input type="checkbox" id="checkbox" class="test"  name="gender" value="ENR062A3"> ENR04CA0 <br>
			    <label for="checkbox"></label>
		  </div>
	</div>
	<div class="container">
		  <div class="round">
			    <input type="checkbox" id="checkbox" class="test"  name="gender" value="ENR062A3"> ENR077A9 <br>
			    <label for="checkbox"></label>
		  </div>
	</div> 
	
</div>

<div id="sub" style="width: 1650px;height: 400px;float: right"></div>

<body>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>

 <script type="text/javascript">

 var dataPs = {       	
	'ENR062A3' : [{
		name : 'ENR062A3',
		data : <s:property value = "psValue023"/>
		},{
		name : 'ENR062A3',
		data : <s:property value = "psValue024"/>
		},{
		name : 'ENR062A3',
		data : <s:property value = "psValue025"/>
		},{
		name : 'ENR062A3',
		data : <s:property value = "psValue026"/>
		},{
		name : 'ENR062A3',
		data : <s:property value = "psValue027"/>
		},{
		name : 'ENR062A3',
		data : <s:property value = "psValue028"/>
		},{
		name : 'ENR062A3',
		data : <s:property value = "psValue029"/>
		},{
		name : 'ENR062A3',
		data : <s:property value = "psValue030"/>
		}],
	'ENR04CA0' : [{
		name : 'ENR04CA0',
		data : <s:property value = "psValue123"/>
		},{
		name : 'ENR04CA0',
		data : <s:property value = "psValue124"/>
		},{
		name : 'ENR04CA0',
		data : <s:property value = "psValue125"/>
		},{
		name : 'ENR04CA0',
		data : <s:property value = "psValue126"/>
		},{
		name : 'ENR04CA0',
		data : <s:property value = "psValue127"/>
		},{
		name : 'ENR04CA0',
		data : <s:property value = "psValue128"/>
		},{
		name : 'ENR04CA0',
		data : <s:property value = "psValue129"/>
		},{
		name : 'ENR04CA0',
		data : <s:property value = "psValue130"/>
		}],
	'ENR077A9' : [{
		name : 'ENR077A9',
		data : <s:property value = "psValue223"/>
		},{
		name : 'ENR077A9',
		data : <s:property value = "psValue224"/>
		},{
		name : 'ENR077A9',
		data : <s:property value = "psValue225"/>
		},{
		name : 'ENR077A9',
		data : <s:property value = "psValue226"/>
		},{
		name : 'ENR077A9',
		data : <s:property value = "psValue227"/>
		},{
		name : 'ENR077A9',
		data : <s:property value = "psValue228"/>
		},{
		name : 'ENR077A9',
		data : <s:property value = "psValue229"/>
		},{
		name : 'ENR077A9',
		data : <s:property value = "psValue230"/>
		}]
 };
var dataPa = {
	'ENR062A3' : [{
		name : 'ENR062A3',
		data : <s:property value = "paValue023"/>
		},{
		name : 'ENR062A3',
		data : <s:property value = "paValue024"/>
		},{
		name : 'ENR062A3',
		data : <s:property value = "paValue025"/>
		},{
		name : 'ENR062A3',
		data : <s:property value = "paValue026"/>
		},{
		name : 'ENR062A3',
		data : <s:property value = "paValue027"/>
		},{
		name : 'ENR062A3',
		data : <s:property value = "paValue028"/>
		},{
		name : 'ENR062A3',
		data : <s:property value = "paValue029"/>
		},{
		name : 'ENR062A3',
		data : <s:property value = "paValue030"/>
		}],
	'ENR04CA0' : [{
		name : 'ENR04CA0',
		data : <s:property value = "paValue123"/>
		},{
		name : 'ENR04CA0',
		data : <s:property value = "paValue124"/>
		},{
		name : 'ENR04CA0',
		data : <s:property value = "paValue125"/>
		},{
		name : 'ENR04CA0',
		data : <s:property value = "paValue126"/>
		},{
		name : 'ENR04CA0',
		data : <s:property value = "paValue127"/>
		},{
		name : 'ENR04CA0',
		data : <s:property value = "paValue128"/>
		},{
		name : 'ENR04CA0',
		data : <s:property value = "paValue129"/>
		},{
		name : 'ENR04CA0',
		data : <s:property value = "paValue130"/>
		}],
	'ENR077A9' : [{
		name : 'ENR077A9',
		data : <s:property value = "paValue223"/>
		},{
		name : 'ENR077A9',
		data : <s:property value = "paValue224"/>
		},{
		name : 'ENR077A9',
		data : <s:property value = "paValue225"/>
		},{
		name : 'ENR077A9',
		data : <s:property value = "paValue226"/>
		},{
		name : 'ENR077A9',
		data : <s:property value = "paValue227"/>
		},{
		name : 'ENR077A9',
		data : <s:property value = "paValue228"/>
		},{
		name : 'ENR077A9',
		data : <s:property value = "paValue229"/>
		},{
		name : 'ENR077A9',
		data : <s:property value = "paValue230"/>
		}]
};

var date = [23/10/2016,24/10/2016,25/10/2016,26/10/2016,27/10/2016,28/10/2016,29/10/2016,30/10/2016];


var chart = null;

$('.test').on('click', function () {
	var serie = chart.get($(this).val());
	serie.setVisible(!serie.visible);
	});
	
function draw1() {
	
	chart = Highcharts.chart('container',{
		chart : {
			type : 'column'
			},
			title : {
				text : 'Pa'
			},
			subtitle : {
				text : '24/10/2016-30/10/2016'
			},
			xAxis : {
				categories : ['Mon', 'Tue', 'Web','Thu', 'Fri', 'Sat', 'Sun','Mon'],
				crosshair : true
			},
				yAxis : {
				min : 0,
				title : {
					text : 'Puissance appelee(Kw)'
					}
				},
				tooltip : {
					headerFormat : '<span style="font-size:10px">{point.key} {this.x}</span><table>',
					pointFormat : '<tr><td style="color:{series.color};padding:0">{series.name}: </td>'
											+ '<td style="padding:0"><b>{point.y:.1f} Kw</b></td></tr>',
					footerFormat : '</table>',
					//shared: true,
					useHTML : true
				},
				plotOptions : {
					column : {
					pointPadding : 0.2,
					borderWidth : 0
				},
				series : {
					cursor : 'pointer',
					events : {
						click : function(event) {
							draw2(
								dataPa[event.point.series.name][event.point.index],
								dataPs[event.point.series.name][event.point.index]);
							console.log(this);
							}
						}
					}
				},
				series : [{
					id: 'ENR062A3',
					name : 'ENR062A3',
					data : <s:property value = "paValue0"/>
					}, {
					id: 'ENR04CA0',
					name : 'ENR04CA0',
					data : <s:property value = "paValue1"/>
					}, {
					id: 'ENR077A9',
					name : 'ENR077A9',
					data : <s:property value = "paValue2"/>
					} ]
				});
		}
function draw2(dataPa, dataPs) {
	Highcharts.chart('sub', {
		chart : {
			zoomType : 'x'
		},
		title : {
			text : 'Data Pa, Ps theo ngay'
		},
		tooltip : {
			/* formatter : function() {
				return this.y //+ date.index ;
			} */
		},
		yAxis : {
			min : 0,
			title : {
				text : 'Puissance(Kw)'
			}
		},
		xAxis : {
			type : 'datetime',
			dateTimeLabelFormats : {
				hour : '%H:%M'
			}
		},
		legend : {
			layout : 'vertical',
			align : 'right',
			verticalAlign : 'middle'
		},
			series : [{
			type : 'area',
			name : 'Pa',
			data : dataPa.data,
			pointStart : Date.UTC(0,0,0),
			pointInterval : 60 * 1000 * 10
		}, {
			type : 'line',
			name : 'Ps',
			data : dataPs.data,
			pointStart : Date.UTC(0,0,0),
			pointInterval : 600 * 1000,
			color: '#FF8C00'
		}]
	});
}
draw1();
</script>
</body>
</html>