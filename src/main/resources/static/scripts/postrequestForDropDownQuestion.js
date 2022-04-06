$(document).ready(
		function() {

			// SUBMIT FORM
			$("#questionForm").submit(function(event) {
				// Prevent the form from submitting via the browser.
				event.preventDefault();
				ajaxPost();
			});

			function ajaxPost() {

				// PREPARE FORM DATA
				var formData = {
					question : $("#surveyQuestion").val(),
					option1 : $("#choiceOne").val(),
					option2 : $("#choiceTwo").val()
				}

				// DO POST
				$.ajax({
					type : "POST",
					contentType : "application/json",
					url : "saveDropDownQuestion",
					data : JSON.stringify(formData),
					dataType : 'json',
					success : function(result) {

						console.log(result);
					},
					error : function(e) {
						alert("Error!")
						console.log("ERROR: ", e);
					}
				});

			}

		})