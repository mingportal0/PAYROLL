window.onload = function(){
	// toast UI Grid
	$.ajax({
		url : "/test/getUserData",
		method :"GET",
		dataType : "JSON",
		success : function(result){
			grid.resetData(result);
		} 
	});
    
	let grid = new tui.Grid({
		el: document.getElementById('grid'),
		clientWidth: '100%',
		scrollX: false,
		scrollY: false,
		columns: [
			{header: 'userId', name: 'userId'},
			{header: 'userName', name: 'userName'},
			{header: 'userAuth', name: 'userAuth'}
		]
	});
};