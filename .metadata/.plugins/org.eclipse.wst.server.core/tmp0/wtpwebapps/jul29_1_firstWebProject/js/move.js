function goJoinPage(){
	location.href="JoinController";
}

function goMyInfoPage(){
	location.href= "MemberInfoController";
}

function logOut(){
	location.href="loginController";
}

function goMemberDelete(){
	var really = prompt("��¥ Ż���ҰŸ� 'Ż���ϰڽ��ϴ�.'��� �Է��Ͻÿ�");
	if(really=="Ż���ϰڽ��ϴ�."){
		location.href="MemberDeleteController";
	}
}

function goNftGalleryDelete(no, photo){
	var really = confirm("��¥ ���� �Ͻ÷ƴϱ�?");
	
	if(really){
		location.href = "DeleteController?no=" + no + "&photo=" + photo;
	}
}

function goNftComment(no, page){
	location.href="CommentController?no=" + no + "&pageNum=" + page;
}

function goReplyDelete(no, page){
	var really = confirm("����� �����Ͻðڽ��ϱ�?");
	
	if(really){
		location.href="ReplyDeleteController?cno=" + no + "&pageNum=" + page;
	}
}