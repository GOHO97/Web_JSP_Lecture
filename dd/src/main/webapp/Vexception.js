function check(){
	var nameFiled = document.f.name;
	var heightFiled = document.f.height;
	var weightFiled = document.f.weight;

	if(reqCk(nameFiled)){
		alert("�̸��� �Է� ���ּ���");
		nameFiled.value = "";
		nameFiled.focus();
		return false;
	}
	if(reqCk(heightFiled) || isNotNumber(heightFiled) || heightFiled.value >= 3){
		alert("Ű�� �Է� ���ּ���");
		heightFiled.value = "";
		heightFiled.focus();
		return false;
	}
	
	if(reqCk(weightFiled) || isNotNumber(weightFiled)){
		alert("�����Ը� �Է� ���ּ���");
		weightFiled.value = "";
		weightFiled.focus();
		return false;
	}
	return true;
}