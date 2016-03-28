<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value="/resources/css-con/bootstrap.css" />"
	rel="stylesheet" type="text/css">
<link href="<c:url value= "/resources/css-con/hover.css" />"
	rel="stylesheet" type="text/css">
<link href="<c:url value= "/resources/css-con/style.css" />"
	rel="stylesheet" type="text/css">
<title>contest-55556</title>
</head>

<body>
	<section class="container">
		<section class="contest_area">
			<section class="row">
				<section class="banner">
					<img src="<c:url value = "resources/img-con/5.png"  />" />
				</section>
				<section class="score-card">
					<p class="hvr-ripple-out">${Quiz.score}</p>
				</section>
				<section class="cat-area">
					<section class="row">
						<section class="ques-card">
							<h5 class="hvr-underline-from-left">${Quiz.question}</h5>
						</section>
						
						<form action="question">
						
						<input type="hidden" name="question_id" value="${Quiz.question_id}">
						<input type="hidden" name="msisdn" value="${Quiz.msisdn}">
						<input type="hidden" name="cat" value="${Quiz.cat}">
						
							<section class="row">
								<section class="col-md-6 col-xs-6">
									<label class="radio-inline"> <input type="radio"
										name="user_answer" value="a">${Quiz.optionA}
									</label>
								</section>

								<section class="col-md-6 col-xs-6">
									<label class="radio-inline"> <input type="radio"
										name="user_answer" value="b">${Quiz.optionB}
									</label>
								</section>

								<section class="col-md-6 col-xs-6">
									<label class="radio-inline" style="margin-top: 10px;">
										<input type="radio" name="user_answer" value="c">${Quiz.optionC}
									</label>
								</section>

								<section class="col-md-6 col-xs-6">
									<label class="radio-inline" style="margin-top: 10px;">
										<input type="radio" name="user_answer" value="d">${Quiz.optionD}
									</label>
								</section>


							</section>
							<input type="submit" value="submit" id="sub"
								class="hvr-wobble-vertical">
						</form>


					</section>


				</section>

			</section>
		</section>
	</section>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="<c:url value= "/resources/js-con/bootstrap.js" />"
		type="text/javascript"></script>
</body>
</html>
