function check() {
	var nameFiled = document.f.name;
	var priceFiled = document.f.price;
	var weightFiled = document.f.weight;
	var expDateFiled = document.f.expDate;
	var imgFiled = document.f.img;
	
	if(reqCk(nameFiled)) {
		alert("�̸��� �Է����ּ���.");
		nameFiled.focus();
		return false;
	}
	
	if(reqCk(priceFiled) || isNotNumber(priceFiled)) {
		alert("������ ��Ȯ�� �Է����ּ���.");
		priceFiled.value = "";
		priceFiled.focus();
		return false;
	}
	
	if(reqCk(weightFiled) || isNotNumber(weightFiled)) {
		alert("�߷��� ��Ȯ�� �Է����ּ���.");
		weightFiled.value = "";
		weightFiled.focus();
		return false;
	}
	
	if(reqCk(expDateFiled) || lengthCk(expDateFiled, 8) || isNotNumber(expDateFiled) || expDateFiled.value[0] !='2') {
		alert("������� ����� Ȯ�����ּ���.");
		expDateFiled.value = "";
		expDateFiled.focus();
		return false;
	}
	
	if(reqCk(imgFiled) || (fileType(imgFiled, "jpg") && fileType(imgFiled, "png") && fileType(imgFiled, "pdf") && fileType(imgFiled, "gif"))) {
		alert("���������� Ȯ�����ּ���.");
		imgFiled.value = "";
		imgFiled.focus();
		return false;
	}
		
	
}