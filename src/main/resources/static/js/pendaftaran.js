function emptyValidation(id) {
	var x = document.getElementById(id).value;
	var y = document.getElementById("label_"+id);
	if (x !='') {
		y.style.visibility="hidden";
	} else {
		y.style.visibility="visible";
	}
}