<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href= "<c:url value="/resources/css-con/bootstrap.css" />" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css-con/hover.css"  />" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css-con/style.css"  />"  rel="stylesheet" type="text/css">
<title>contest-55556</title>
</head>

<body>
	<section class="container">
		<section class="contest_area">
			<section class="row">
				<section class="banner">
					<img src="<c:url value="/resources/img-con/5.png" />" />
				</section>
				<section class="cat-area">
					<section class="row">
						<section class="col-md-6 col-xs-6">
							<section class="link-area">
							<a href="<c:url value ="/question?cat=cat1&msisdn=98" />" >
								<p class="hvr-float-shadow">Bollywood</p>
							</a>
							</section>
						</section>

						<section class="col-md-6 col-xs-6">
							<section class="link-area">
							<a href="<c:url value ="/question?cat=cat2&msisdn=98" />" >
								<p class="hvr-float-shadow">Hollywood</p>
								</a>
							</section>
						</section>

						<section class="col-md-6 col-xs-6">
						
							<section class="link-area">
							<a href="<c:url value ="/question?cat=cat3&msisdn=98" />" >
								<p class="hvr-float-shadow">Tollywood</p>
								</a>
							</section>
						</section>

						<section class="col-md-6 col-xs-6">
							<section class="link-area">
							<a href="<c:url value ="/question?cat=cat4&msisdn=98" />" >
								<p class="hvr-float-shadow">Pollywood</p>
								</a>
							</section>
						</section>

                   </section>


				</section>

			</section>
		</section>
	</section>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="<c:url value="/resources/js-con/bootstrap.js" />"type="text/javascript"></script>
</body>
</html>
