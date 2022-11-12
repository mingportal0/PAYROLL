let user = {
	init: function(){
		$("#btn-save").on("click", ()=>{
			this.save();
		});
	},	
	save: function(){
		let data = {
			userId: $("#userId").val(),
			userInfo: $("#userInfo").val()
		};
		$.ajax({
			type:"POST",
			url: "/test/saveUserInfo",
			data: JSON.stringify(data),
			contentType: "application/json; charset=utf-8"
		}).done(function(resp){
			alert("저장되었습니다");
			location.href="/test/userInfo";
		}).fail(function(error){
			alert(JSON.stringify(error));
		});
	}
}

window.onload = function(){
	$('.summernote').summernote({
		tabsize: 2,
		height: 300,
		lang: "ko-KR"
	});
	
	user.init();
}