function calcCheck(){
	var xInput = document.calcForm.x;
	var yInput = document.calcForm.y;
	
	if(reqCk(xInput) || isNotNumber(xInput) || reqCk(yInput) || isNotNumber(yInput)) {
		alert("���ϳ�?");
		xInput.value="";
		yInput.value="";
		xInput.focus();
		return false;
	}
	return true;
}