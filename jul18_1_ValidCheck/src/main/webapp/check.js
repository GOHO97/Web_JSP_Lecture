function check() {
	var idField = document.f.id;
	var pwField = document.f.pw;
	var pwChkField = document.f.pwChk;
	var ageField = document.f.age;
	var photoField = document.f.photo;
	
	if(reqCk(idField) || lengthCk(idField, 4) || korCk(idField)) {
		alert("IDÂÍ");
		idField.value = "";
		idField.focus();		
		return false;
	}
	
	if(reqCk(pwField) || lengthCk(pwField, 4) || pwCrossCk(pwField, pwChkField)
		|| pwPattern(pwField, "1234567890") || pwPattern(pwField, "!@#$%^&*()")) {
		alert("PW?");
		pwField.value = "";
		pwChkField.value = "";
		pwField.focus();
		return false;
	}
	
	if(reqCk(ageField) || isNotNumber(ageField) || isNegative(ageField)) {
		alert("³ªÀÌ?");
		ageField.value = "";
		ageField.focus();
		return false;
	}
	
	if(reqCk(photoField) || fileType(photoField, "png")) {
		alert("ÇÁ»ç?");
		photoField.value = "";
		photoField.focus();
		return false;
	}
	return true;
}