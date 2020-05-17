$(document).ready(function() {
	$("#admdivSelect").change(function() {
		var admdivCode = $("#admdivSelect").val();
		if (admdivCode == '') {
			return;
		}

		$.ajax({
			url : '/operation/ajax/vtcodes/' + admdivCode,
			async : false,
			type : 'get',
			data : {
			},
			success : function(data) {
				var t2 = $("#vtcodeSelect").empty();

				for (var i = 0; i < data.length; i++) {
					t2.append("<option value='" + data[i] + "'>" + data[i] + "</option>");
				}
			}
		})
	});
	
	$("#admdivSelect1").change(function() {
		var admdivCode = $("#admdivSelect1").val();
		if (admdivCode == '') {
			return;
		}

		$.ajax({
			url : '/operation/ajax/vtcodes/' + admdivCode,
			async : false,
			type : 'get',
			data : {
			},
			success : function(data) {
				var t2 = $("#vtcodeSelect1").empty();

				for (var i = 0; i < data.length; i++) {
					t2.append("<option value='" + data[i] + "'>" + data[i] + "</option>");
				}
			}
		})
	});
	
	$("#isExpMenu").click(function() {
		if ($("#isExpMenu").is(':checked')) {
			$.ajax({
				url : '/operation/ajax/menus',
				async : false,
				type : 'get',
				data : {
				},
				success : function(data) {
					var t2 = $("#menuSelect").empty();

					for (var i = 0; i < data.length; i++) {
						t2.append("<option value='" + data[i].id + "'>" + data[i].name + "</option>");
					}
				}
			})
		} else {
			var t2 = $("#menuSelect").empty();
			t2.append("<option value=''>--请选择--</option>");
		}	
	});
	
})

function viewVoucherXML() {
	$.post("/operation/main/",
		{
			name : "Donald Duck",
			city : "Duckburg"
		},
		function(data, status) {
			alert("Data: " + data + "\nStatus: " + status);
		});
}

function exportSql() {
	
	var admdivCode = $("#admdivSelect1").val();
	var vtCode = $("#vtcodeSelect1").val();
	
	if (admdivCode == '--请选择--' || vtCode == '--请选择--') {
		return;
	}
	
	
	var dataObj = {};
	dataObj['admdivCode'] = $("#admdivSelect1").val();
	dataObj['vtCode'] = $("#vtcodeSelect1").val();
	dataObj['expBiz'] = $("#isExpBiz").is(':checked');
	dataObj['expBill'] = $("#isExpBill").is(':checked');
	dataObj['expMenu'] = $("#isExpMenu").is(':checked');
	$.ajax({
		url : '/operation/main/expsql',
		async : false,
		type : 'post',
		data : JSON.stringify(dataObj),
		dataType : 'json',
		headers : {
			'Content-Type' : 'application/json;charset=utf-8'
		},
		success : function(data) {
			var cont = $("#sqlcard").empty();
			for (var i = 0; i < data.length; i++) {
				cont.append("<div class='mysql'><code class='sql'>" + hljs.highlight('sql', data[i]).value + "</code></div>");
			}
		}
	});

}