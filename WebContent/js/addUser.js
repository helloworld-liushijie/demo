/**
 * 用户添加
 * @returns
 */
function addUser() {
	$.post(
		'/demo/add_user.json',
		{'name':""+$('#userName').val()+""},
		function(data){
			console.log(data);
		}
	);
}

/**
 * 文件上传
 * @returns
 */
function upload_file() {
	var file = $("input[type='file']")[0].files;
	//已经选择文件
	if(file.length) { 
		var mime = file[0].type.slice(0,file[0].type.indexOf('/'));
		if(mime === 'image') {
			$.ajax({
				url:'http://localhost:8080/demo'+'/upload_file.json',
				type:'post',
				data:{'file':file},
				contentType:false,
	            processData:false,
				success:function(data) {
					console.log(data);
				}
			})
		} else {
			alert('只能上传图片文件');
		}
	}
}

