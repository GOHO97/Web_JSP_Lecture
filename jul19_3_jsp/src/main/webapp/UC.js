function check(){
	var numFiled = document.f.num;
	
	if(reqCk(numFiled) || isNotNumber(numFiled)) {
		alert("변환할 숫자를 입력해주세요.")
		numFiled.value = "";
		numFiled.focus();
		return false;
	}
	
	return true;
}