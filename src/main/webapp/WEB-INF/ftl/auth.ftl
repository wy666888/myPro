按钮权限控制<hr/>
<table class="table_1">
					<tr class="tr1">
						<td class="td3" width="25%">集团名称</td>
						<td class="td3" width="25%" colspan='3'><input
							class="easyui-textbox" id="groupname" name="groupname"
							value="${ibEquipmentExport.groupname }"
							labelPosition="left" style="width: 200px"></td>
					</tr>
					<tr class="tr1">
						<td class="td3" width="25%">出口技术装备综述</td>
						<td class="td3" width="25%" colspan='3'><input
							class="easyui-textbox" id="overview" name="overview"
							value="${ibEquipmentExport.overview }"
							labelPosition="left" multiline="true" style="width: 50%; height: 50px"></td>
					</tr>
					<tr class="tr1">
						<td class="td3" width="25%">技术装备名称</td>
						<td class="td3" width="25%" ><input
							class="easyui-textbox" id="equipname" name="equipname"
							value="${ibEquipmentExport.equipname }"
							labelPosition="left" style="width: 200px"></td>
						<td class="td3" width="25%">技术装备出口商</td>
						<td class="td3" width="25%"><input class="easyui-textbox"
							id="exporter" name="exporter"
							value="${ibEquipmentExport.exporter }"
							labelPosition="left" style="width: 200px"></td>
					</tr>
					<tr class="tr1">
						<td class="td3" width="25%">设备制造商</td>
						<td class="td3" width="25%"><input class="easyui-textbox"
							id="manufacturer" name="manufacturer"
							value="${ibEquipmentExport.manufacturer }"
							labelPosition="left" style="width: 200px"></td>
						<td class="td3" width="25%">投产日期</td>
						<td class="td3" width="25%"><input class="easyui-datebox"
							id="productiondate" name="productiondate"
							value="${ibEquipmentExport.productiondate }"
							labelPosition="left" style="width: 200px"></td>
					</tr>
					<tr class="tr1">
						<td class="td3" width="25%">使用状态</td>
						<td class="td3" width="25%"><input class="easyui-textbox"
							id="usestate" name="usestate"
							value="${ibEquipmentExport.usestate }"
							labelPosition="left" style="width: 200px"></td>
						<td class="td3" width="25%">投资额</td>
						<td class="td3" width="25%"><input class="easyui-numberbox"
							id="investmentamount" name="investmentamount"
							value="${ibEquipmentExport.investmentamount }"
							labelPosition="left" style="width: 200px"></td>
					</tr>
					<tr class="tr1">
						<td class="td3" width="25%">产能规模</td>
						<td class="td3" width="25%" colspan='3'><input class="easyui-textbox"
							id="capacityscale" name="capacityscale"
							value="${ibEquipmentExport.capacityscale }"
							labelPosition="left" style="width: 200px"></td>
					</tr>

				</table>
<div class="btn-group billheader">
    <@auth paddingtext="&nbsp;&nbsp;" >
<a class="btn" id="submit" href="#"><i class="icon-plus"></i>提交</a>
<a class="btn" id="audit" href="#"><i class="icon-lock"></i>审核</a>
<a class="btn" id="remove" href="#"><i class="icon-remove"></i>作废</a>
<a class="btn" id="print" href="#"><i class="icon-print"></i>打印</a>
<a class="btn" id="refresh" href="#"><i class="icon-refresh"></i>刷新</a>
</@auth>
</div>