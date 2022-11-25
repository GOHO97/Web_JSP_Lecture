function writeCheck(){
	var title = document.bWriteF.title;
	var txt = document.bWriteF.txt;
	
	if(reqCk(title) || reqCk(txt)){
		alert("제목이랑 내용을 입력해주세요");
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
		alert("제목이랑 내용을 입력해주세요");
		title.value = "";
		txt.value = "";
		title.focus();
		return false;
	}
	return true;
}