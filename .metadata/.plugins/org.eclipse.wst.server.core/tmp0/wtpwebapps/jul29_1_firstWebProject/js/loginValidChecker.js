function loginCheck(){
	var id = document.loginF.id;
	var pw = document.loginF.pw;
	
	if(reqCk(id)){
		alert("id�� �Է����ּ���");
		id.value = "";
		id.focus();
		
		return false;
	}
	
	if(reqCk(pw)){
		alert("��й�ȣ�� �Է����ּ���");
		pw.value = "";
		pw.focus();
		
		return false;
	}
	
	return true;
}