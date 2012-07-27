addLoadEvent(windowLoadB);

function windowLoadB() {
	document.getElementById("p").onclick = alertp;
}

function alertp() {
	alert("P!!")
}