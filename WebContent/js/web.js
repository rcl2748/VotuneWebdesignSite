//init
currentPage = document.getElementById("nav_home");
pageUpdate = "switchpage";
login = "";
register = "";

function clearText(field) {
	if (field.defaultValue == field.value) {
		field.value = '';
	} else if (field.value == '') {
		field.value = field.defaultValue;
	}
}
function switchPage(page) {
	currentPage.removeAttribute("class");
	currentPage = page;
	currentPage.setAttribute("class", "current");
	
	// ajax
	$.post(pageUpdate, {
		page : page.id
	}, function(data) {
		recievedPage = data;
	});
	
	// animate
	$("#content").animate({
		opacity : 0
	}, 500, function() {
		$("#content").html(recievedPage);
		$("#content").animate({
			opacity : 1
		}, 500, function() {
			
		});
	});
	
}
