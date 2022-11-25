function check(){
	var no = document.f.no;
	
	if(reqCk(no) || lengthCk(no, 3) || isNotNumber(no)){
		alert("숫자를 정확히 입력해주세요");
		no.value = "";
		no.focus();
		return false;
	}
	
	var no2 = no.value;
	if(no2[0] == no2[1] || no2[0] == no2[2] || no2[1] == no2[2]){
		alert("모든 자릿수에 중복된 숫자는 입력할 수 없습니다.");
		no.value = "";
		no.focus();
		return false;
	}
	
	return true;
}