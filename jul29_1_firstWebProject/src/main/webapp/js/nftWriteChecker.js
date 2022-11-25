function nftWriteCheck(){
	var title = document.nftWriteF.title;
	var photo = document.nftWriteF.photo;
	var txt = document.nftWriteF.txt;
	
	if(reqCk(title) || lengthCk(title, 5)) {
		alert("�ּ� ���� �� 5���� �Դϴ�.");
		title.value = "";
		title.focus();
		
		return false;
	}
	
	if(reqCk(photo) || fileType(photo, img) || fileType(photo, png) || fileType(photo, jpg)){
		alert("������ Ȯ�����ּ���.");
		photo.value = "";
		photo.focus();
		
		return false;
	}
	
	if(reqCk(txt) || lengthCk(txt, 10)) {
		alert("�ּ� ���� �� 10���� �Դϴ�.");
		txt.value = "";
		txt.focus();
		
		return false;
	}
	
	return true;
}

function nftReWriteCheck(){
	var title = document.nftReWriteF.title;
	var photo = document.nftREWriteF.photo;
	var txt = document.nftReWriteF.txt;
	
	if(reqCk(title) || lengthCk(title, 5)) {
		alert("�ּ� ���� �� 5���� �Դϴ�.");
		title.value = "";
		title.focus();
		
		return false;
	}
	
	if(fileType(photo, img) || fileType(photo, png) || fileType(photo, jpg)){
		alert("���� ������ Ȯ�����ּ���.");
		photo.value = "";
		photo.focus();
		
		return false;
	}
	
	if(reqCk(txt) || lengthCk(txt, 10)) {
		alert("�ּ� ���� �� 10���� �Դϴ�.");
		txt.value = "";
		txt.focus();
		
		return false;
	}
	
	return true;
}

function nftSelectCheck(){
	var serch = document.nftSelectF.serch;
	
	if(reqCk(serch)){
		alert("�˻�� �Է����ּ���");
		serch.value= "";
		serch.focus();
		
		return false;
	}	
	return true;
}

function nftCommentCheck(){
	var comment = document.commentF.txt;
	
	if(reqCk(comment) || lengthCk(comment, 5)){
		alert("�ּ� 5����");
		comment.value = "";
		comment.focus();
		
		return false;
	}
	return true;
}