<%@ page contentType = "text/html; charset = UTF-8" %>
<%@ taglib prefix = "s" uri = "/struts-tags" %>

<html>
<head>
    <title>Hello World</title>
</head>
<div id="container" style="height: 400px"></div>
<div id="container1" style="height: 400px"></div>

<body>
 
 <script src="https://code.highcharts.com/highcharts.js"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
 <script type="text/javascript">
function drawchart(type,id){
	Highcharts.chart(id, {
	    chart: {
	        type: type
	    },
	    title: {
		      text:'Pa'
		  },
		  subtitle: {
		      text: '(23/10/2016 - 30/10/2016)'
		  },
	    xAxis: {
	        categories: [
		        	            '23/10/2016',
		        	            '24/10/2016',
		        	            '25/10/2016',
		        	            '26/10/2016',
		        	            '27/10/2016',
		        	            '28/10/2016',
		        	            '29/10/2016',
		        	            '30/10/2016',
		        	           
		        	        ],
	    },
			yAxis: {
		     min: 0,
		     title: {
		     		text: 'Pa value (kW)'
		        	}
		  },
		  tooltip: {
		     headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
		     pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
		        	            '<td style="padding:0"><b>{point.y:.1f} kW</b></td></tr>',
		     footerFormat: '</table>',
		     shared: true,
		     useHTML: true
		   },
	    plotOptions: {
	    		column: {
		     			pointPadding: 0.2,
		     			borderWidth: 0
	        },
	        series: {
	            cursor: 'pointer',
	            point: {
	                events: {
	                    click: function () {
	                       drawchart('area','container1');
	                    }
	                }
	            }
	        }
	    },

	   series: [{
		     name: 'ENR062A3',
		     data: <s:property value = "paValue0"/>
		 
		 }, {
		    name: 'ENR04CA0',
		    data: <s:property value = "paValue1"/>
		   
		 }, {
		    name: 'ENR077A9',
		    data: <s:property value = "paValue2"/>
		
		    }]
	});
	}
	drawchart('column','container');
 </script>
</body>
</html>