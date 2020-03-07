<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Weather</title>
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<table class="table table-bordered" style="width: 60%;margin-top: 10px;">
		<tbody>
			<tr>
				<th>City</th>
				<td><select class="combobox" onchange="initData()" id="city">
						<c:forEach items="${cities }" var="city" varStatus="status">
							<option value="${city }">${city }</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<th>Updated time</th>
				<td id="updatedTime"></td>
			</tr>
			<tr>
				<th>Weather</th>
				<td id="weather"></td>
			</tr>
			<tr>
				<th>Temperature</th>
				<td id="temperature"></td>
			</tr>
			<tr>
				<th>Wind</th>
				<td id="wind"></td>
			</tr>
		</tbody>
	</table>

</body>
<script type="text/javascript">
	function initData () {
		$.ajax({
            type:"get",
            url:"https://free-api.heweather.net/s6/weather/now?key=af1c29a7a1bf44e7ac54537c247b3e4f&location=" + $("#city").val(),
            success: function (data) {
                var weather = data.HeWeather6[0];
                $('#updatedTime').html(weather.update.loc);
                $('#weather').html(weather.now.cond_txt);
                $('#temperature').html(weather.now.tmp + '°C');
                $('#wind').html(weather.now.wind_spd + 'km/h');
            }
        });
	}
	$(document).ready(initData());
	</script>
</html>