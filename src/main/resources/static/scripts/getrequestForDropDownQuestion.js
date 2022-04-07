GET: $(document).ready(
		function() {

			// GET REQUEST
			$("#getDDQuestions").click(function(event) {
				event.preventDefault();
				ajaxGet();
			});

			// DO GET
			function ajaxGet() {
				$.ajax({
					type : "GET",
					url : "getDropDownQuestions",
					success : function(result) {
						if (result.status == "success") {
							$('#getResultDiv ul').empty();
							var custList = "";
							$.each(result.data,
									function(i, question) {
										var user = "<label for='questions'>" + question.question +  "</label> "
												+ "<select name='questions' id='questions'>"
												+ "<option value='option1'>" + question.option1 + "</option>"
												+ "<option value='option2'>" + question.option2 + "</option></select>"
												+ "<br>";
										$('#getResultDDDiv .list-group').append(
												user)
									});
							console.log("Success: ", result);
						} else {
							$("#getResultDiv").html("<strong>Error</strong>");
							console.log("Fail: ", result);
						}
					},
					error : function(e) {
						$("#getResultDiv").html("<strong>Error</strong>");
						console.log("ERROR: ", e);
					}
				});
			}
		})