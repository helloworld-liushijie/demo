function addUser() {
	$.post(
		'/demo/add_user.json',
		{'name':""+$('#userName').val()+""},function(data){
			console.log(data);
		});
}