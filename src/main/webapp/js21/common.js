/**判断是否是数字
 * @param s
 * @returns
 */
function isRealNum(s){
	if(typeof s !== 'number'){
		return false;
	}
	if(!isNaN(s)){
		return true;
	}else{
		return false;
	}
}
/**转换为十进制
 * @param s
 * @param scale
 * @returns
 */
function numToString(s,scale){
	var str;
	if(isRealNum(s)){
		//if(s.indexOf('0x')==0||s.indexOf('0X')==0){
		/*if(scale==16){
			str = "<li>十六进制数"+s.toString(16)+"等于十进制数："+s+"<br/>";
		//}else if(s.indexOf('0')==0){
		}else if(scale==8){
			str = "<li>八进制数"+s.toString(8)+"等于十进制数："+s+"<br/>";
		}else{
			str = "<li>十进制数"+s.toString()+"等于十进制数："+s+"<br/>";
		}*/
		str = "<li>"+scale+"进制数"+s.toString(scale)+"等于十进制数："+s+"<br/>";
		
	}else{
		str = s+"不是数字，无法进行转换！";
	}
	return str;
}
/**校验只要是数字（包含正负整数，0以及正负浮点数）就返回true
 * @param val
 * @returns
 */
function isNumber(val){

    var regPos = /^\d+(\.\d+)?$/; //非负浮点数
    var regNeg = /^(-(([0-9]+\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\.[0-9]+)|([0-9]*[1-9][0-9]*)))$/; //负浮点数
    if(regPos.test(val) || regNeg.test(val)){
        return true;
    }else{
        return false;
    }

}

/**校验正负整数就返回true
 * @param val
 * @returns
 */
function isIntNum(val){
    var regPos = / ^\d+$/; // 非负整数
    var regNeg = /^\-[1-9][0-9]*$/; // 负整数
    if(regPos.test(val) || regNeg.test(val)){
        return true;
    }else{
        return false;
    }
}
/**判断是否是Float
 * @param inputData
 * @returns
 */
function isAFloatNumber(inputData){
	//isNaN(inputData)不能判断空串或一个空格 
	//如果是一个空串或是一个空格，而isNaN是做为数字0进行处理的，而parseInt与parseFloat是返回一个错误消息，这个isNaN检查不严密而导致的。 
	var flag;
	if(parseFloat(inputData).toString()=="NaN"){
		flag = false;
	}else{
		flag = true;
	}
	return flag;
}
/**判断是否是Int(有bug)
 * @param inputData
 * @returns
 */
function isAIntNumber(inputData){
	//isNaN(inputData)不能判断空串或一个空格 
	//如果是一个空串或是一个空格，而isNaN是做为数字0进行处理的，而parseInt与parseFloat是返回一个错误消息，这个isNaN检查不严密而导致的。 
	var flag;
	if(parseInt(inputData).toString()=="NaN"){
		flag = false;
	}else{
		flag = true;
	}
	return flag;
}

/**判断是否是int
 * @param num
 * @returns
 */
function isInteger(num) {
    if (!isNaN(num) && num % 1 === 0) {
      return true;
    } else {
      return false;
    }

  }

/**数组的深层复制(使用concat)
 * @param ary
 * @returns
 */
function aryClone1(ary){
	return ary.concat();
}
/**数组的深层复制(使用slice)
 * @param ary
 * @returns
 */
function aryClone2(ary){
	return ary.slice();
}
/**数组的深层复制(使用遍历push)
 * @param ary
 * @returns
 */
function aryClone3(ary){
	var dest = [];
	var i;
	for(i in ary){
		dest.push(ary[i]);
	}
	return dest;
}
/**确定是对象的情况下可用
 * @param obj
 * @returns
 */
function objClone1(obj){
	var dest = {};
	var i;
	for(i in obj){
		dest[i] = obj[i];
	}
	return dest;
}
/**普遍适用（包括数组）
 * @param obj
 * @returns
 */
function objClone2(obj){
	return JSON.parse(JSON.stringify(obj));
}
function arySort(ary){
	return ary.sort(function(a,b){
		return a-b;
	});
}