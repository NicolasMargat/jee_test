<%@ page
	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="pragma" content="no-cache" />

		<link rel="stylesheet" type="text/css" href="assets/styles/style.css" />
		<link rel="stylesheet" type="text/css" href="assets/styles/styleMenu.css" />
		<link rel="stylesheet" type="text/css" href="assets/styles/styleIndex.css" />

		<title>Ma page de test. lol</title>
	</head>
	<body>
		<div class="main">
			<%@ include file="Views/header.html" %>
			<%@ include file="Views/menu.html" %>
			
			<div class="main_wrapper">
				<% if(2 > 1) { out.println("Bonjour"); } %>
				
				<aside class="sidebar">
					<h3>Info 1 :</h3>
					<p class="info">Aenean fermentum elit rutrum, porta odio at, venenatis tellus. Nulla facilisi. Vivamus convallis ullamcorper sapien eu sollicitudin. Nulla odio lacus, laoreet in augue et, euismod.</p>
					<h3>Info 2 :</h3>
					<p class="info">Aenean fermentum elit rutrum, porta odio at, venenatis tellus. Nulla facilisi. Vivamus convallis ullamcorper sapien eu sollicitudin. Nulla odio lacus, laoreet in augue et, euismod.</p>
				</aside>
				<article>
					<p class="news">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus nec metus ac metus malesuada commodo sed nec dolor. Sed fermentum erat nunc, vel viverra mauris fermentum a. Cras molestie ante et placerat pharetra. Morbi varius iaculis arcu eget tempus. Cras eleifend massa nisl, sed sollicitudin purus ultricies non. Vivamus dignissim cursus sem eget cursus. Fusce ornare augue eget vestibulum pharetra. Sed id dui tellus.</p>
					<p class="news">Cras egestas id ante ut dignissim. Duis ac aliquet orci, sit amet mattis lorem. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Mauris fermentum magna in rutrum lobortis. Vivamus vitae vehicula nisi, scelerisque gravida mi. Fusce sagittis arcu lobortis dolor sodales, nec consequat tellus scelerisque. Aenean pretium ut nunc sed vulputate. Maecenas vel justo sem. Aliquam maximus aliquam metus, id euismod dolor pulvinar eu. Vestibulum maximus, nunc ac hendrerit ultrices, lectus odio ultrices tellus, nec venenatis nibh libero tincidunt odio.</p>
					<p class="news">Praesent placerat est nunc, vitae mollis tortor hendrerit ut. Duis sollicitudin neque ante, sit amet imperdiet dui convallis quis. Sed quis semper dolor. Fusce vitae dolor mauris. Maecenas ut felis porttitor, vulputate augue scelerisque, lobortis enim. Curabitur tincidunt metus in tortor fringilla, euismod pretium ex accumsan. Nunc gravida lectus vel massa ullamcorper congue.</p>

					<p class="news">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus nec metus ac metus malesuada commodo sed nec dolor. Sed fermentum erat nunc, vel viverra mauris fermentum a. Cras molestie ante et placerat pharetra. Morbi varius iaculis arcu eget tempus. Cras eleifend massa nisl, sed sollicitudin purus ultricies non. Vivamus dignissim cursus sem eget cursus. Fusce ornare augue eget vestibulum pharetra. Sed id dui tellus.</p>
					<p class="news">Cras egestas id ante ut dignissim. Duis ac aliquet orci, sit amet mattis lorem. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Mauris fermentum magna in rutrum lobortis. Vivamus vitae vehicula nisi, scelerisque gravida mi. Fusce sagittis arcu lobortis dolor sodales, nec consequat tellus scelerisque. Aenean pretium ut nunc sed vulputate. Maecenas vel justo sem. Aliquam maximus aliquam metus, id euismod dolor pulvinar eu. Vestibulum maximus, nunc ac hendrerit ultrices, lectus odio ultrices tellus, nec venenatis nibh libero tincidunt odio.</p>
					<p class="news">Praesent placerat est nunc, vitae mollis tortor hendrerit ut. Duis sollicitudin neque ante, sit amet imperdiet dui convallis quis. Sed quis semper dolor. Fusce vitae dolor mauris. Maecenas ut felis porttitor, vulputate augue scelerisque, lobortis enim. Curabitur tincidunt metus in tortor fringilla, euismod pretium ex accumsan. Nunc gravida lectus vel massa ullamcorper congue.</p>

					<p class="news">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus nec metus ac metus malesuada commodo sed nec dolor. Sed fermentum erat nunc, vel viverra mauris fermentum a. Cras molestie ante et placerat pharetra. Morbi varius iaculis arcu eget tempus. Cras eleifend massa nisl, sed sollicitudin purus ultricies non. Vivamus dignissim cursus sem eget cursus. Fusce ornare augue eget vestibulum pharetra. Sed id dui tellus.</p>
					<p class="news">Cras egestas id ante ut dignissim. Duis ac aliquet orci, sit amet mattis lorem. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Mauris fermentum magna in rutrum lobortis. Vivamus vitae vehicula nisi, scelerisque gravida mi. Fusce sagittis arcu lobortis dolor sodales, nec consequat tellus scelerisque. Aenean pretium ut nunc sed vulputate. Maecenas vel justo sem. Aliquam maximus aliquam metus, id euismod dolor pulvinar eu. Vestibulum maximus, nunc ac hendrerit ultrices, lectus odio ultrices tellus, nec venenatis nibh libero tincidunt odio.</p>
					<p class="news">Praesent placerat est nunc, vitae mollis tortor hendrerit ut. Duis sollicitudin neque ante, sit amet imperdiet dui convallis quis. Sed quis semper dolor. Fusce vitae dolor mauris. Maecenas ut felis porttitor, vulputate augue scelerisque, lobortis enim. Curabitur tincidunt metus in tortor fringilla, euismod pretium ex accumsan. Nunc gravida lectus vel massa ullamcorper congue.</p>

					<p class="news">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus nec metus ac metus malesuada commodo sed nec dolor. Sed fermentum erat nunc, vel viverra mauris fermentum a. Cras molestie ante et placerat pharetra. Morbi varius iaculis arcu eget tempus. Cras eleifend massa nisl, sed sollicitudin purus ultricies non. Vivamus dignissim cursus sem eget cursus. Fusce ornare augue eget vestibulum pharetra. Sed id dui tellus.</p>
					<p class="news">Cras egestas id ante ut dignissim. Duis ac aliquet orci, sit amet mattis lorem. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Mauris fermentum magna in rutrum lobortis. Vivamus vitae vehicula nisi, scelerisque gravida mi. Fusce sagittis arcu lobortis dolor sodales, nec consequat tellus scelerisque. Aenean pretium ut nunc sed vulputate. Maecenas vel justo sem. Aliquam maximus aliquam metus, id euismod dolor pulvinar eu. Vestibulum maximus, nunc ac hendrerit ultrices, lectus odio ultrices tellus, nec venenatis nibh libero tincidunt odio.</p>
					<p class="news">Praesent placerat est nunc, vitae mollis tortor hendrerit ut. Duis sollicitudin neque ante, sit amet imperdiet dui convallis quis. Sed quis semper dolor. Fusce vitae dolor mauris. Maecenas ut felis porttitor, vulputate augue scelerisque, lobortis enim. Curabitur tincidunt metus in tortor fringilla, euismod pretium ex accumsan. Nunc gravida lectus vel massa ullamcorper congue.</p>
				</article>
			</div>
		</div>

		<%@ include file="Views/footer.html" %>
	</body>
</html>