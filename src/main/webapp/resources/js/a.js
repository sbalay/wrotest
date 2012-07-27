addLoadEvent(windowLoadA);

function windowLoadA() {
	document.getElementById("h1").onclick = alerth;
}

function addLoadEvent(func) { 
	var oldonload = window.onload; 
	if (typeof window.onload != 'function') { 
		window.onload = func; 
	} else { 
		window.onload = function() { 
			if (oldonload) { 
				oldonload(); 
			} 
			func(); 
		} 
	} 
}

function alerth() {
	alert("H1!!")
}