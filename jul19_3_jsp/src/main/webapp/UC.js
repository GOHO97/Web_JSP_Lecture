function check(){
	var numFiled = document.f.num;
	
	if(reqCk(numFiled) || isNotNumber(numFiled)) {
		alert("��ȯ�� ���ڸ� �Է����ּ���.")
		numFiled.value = "";
		numFiled.focus();
		return false;
	}
	
	return true;
}