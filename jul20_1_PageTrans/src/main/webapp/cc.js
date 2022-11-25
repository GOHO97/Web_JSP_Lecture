function check(){
	var xFiled = document.f.x;
	var yFiled = document.f.y;
	
	if(reqCk(xFiled) || isNotNumber(xFiled)) {
		alert("only number");
		xFiled.value = "";
		xFiled.focus();
		return false;
	}

	if(reqCk(yFiled) || isNotNumber(yFiled)) {
		alert("only number");
		yFiled.value = "";
		yFiled.focus();
		return false;
	}
	
	return true;
}