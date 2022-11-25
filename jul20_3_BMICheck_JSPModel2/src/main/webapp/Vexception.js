function check(){
	var nameFiled = document.f.name;
	var heightFiled = document.f.height;
	var weightFiled = document.f.weight;

	if(reqCk(nameFiled)){
		alert("이름을 입력 해주세요");
		nameFiled.value = "";
		nameFiled.focus();
		return false;
	}
	if(reqCk(heightFiled) || isNotNumber(heightFiled) || heightFiled.value >= 3){
		alert("키를 입력 해주세요");
		heightFiled.value = "";
		heightFiled.focus();
		return false;
	}
	
	if(reqCk(weightFiled) || isNotNumber(weightFiled)){
		alert("몸무게를 입력 해주세요");
		weightFiled.value = "";
		weightFiled.focus();
		return false;
	}
	return true;
}