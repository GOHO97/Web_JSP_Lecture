function check(){
	var no = document.f.no;
	
	if(reqCk(no) || lengthCk(no, 3) || isNotNumber(no)){
		alert("���ڸ� ��Ȯ�� �Է����ּ���");
		no.value = "";
		no.focus();
		return false;
	}
	
	var no2 = no.value;
	if(no2[0] == no2[1] || no2[0] == no2[2] || no2[1] == no2[2]){
		alert("��� �ڸ����� �ߺ��� ���ڴ� �Է��� �� �����ϴ�.");
		no.value = "";
		no.focus();
		return false;
	}
	
	return true;
}