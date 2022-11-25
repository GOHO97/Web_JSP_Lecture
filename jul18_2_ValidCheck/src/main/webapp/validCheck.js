function check() {
	var nameFiled = document.f.name;
	var priceFiled = document.f.price;
	var weightFiled = document.f.weight;
	var expDateFiled = document.f.expDate;
	var imgFiled = document.f.img;
	
	if(reqCk(nameFiled)) {
		alert("이름을 입력해주세요.");
		nameFiled.focus();
		return false;
	}
	
	if(reqCk(priceFiled) || isNotNumber(priceFiled)) {
		alert("가격을 정확히 입력해주세요.");
		priceFiled.value = "";
		priceFiled.focus();
		return false;
	}
	
	if(reqCk(weightFiled) || isNotNumber(weightFiled)) {
		alert("중량을 정확히 입력해주세요.");
		weightFiled.value = "";
		weightFiled.focus();
		return false;
	}
	
	if(reqCk(expDateFiled) || lengthCk(expDateFiled, 8) || isNotNumber(expDateFiled) || expDateFiled.value[0] !='2') {
		alert("유통기한 양식을 확인해주세요.");
		expDateFiled.value = "";
		expDateFiled.focus();
		return false;
	}
	
	if(reqCk(imgFiled) || (fileType(imgFiled, "jpg") && fileType(imgFiled, "png") && fileType(imgFiled, "pdf") && fileType(imgFiled, "gif"))) {
		alert("파일형식을 확인해주세요.");
		imgFiled.value = "";
		imgFiled.focus();
		return false;
	}
		
	
}