function writeCheck(){
	var title = document.bWriteF.title;
	var txt = document.bWriteF.txt;
	
	if(reqCk(title) || reqCk(txt)){
		alert("�����̶� ������ �Է����ּ���");
		title.value = "";
		txt.value = "";
		title.focus();
		return false;
	}
	return true;
}
function reWriteCheck(){
	var title = document.reWriteF.title;
	var bContent = document.reWriteF.bContent;
	
	if(reqCk(title) || reqCk(bContent)){
		alert("�����̶� ������ �Է����ּ���");
		title.value = "";
		txt.value = "";
		title.focus();
		return false;
	}
	return true;
}