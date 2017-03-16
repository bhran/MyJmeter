package com.susie.action.equals;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//各种类型的数据
//		String standardData = "{'uid':123,'phone':null,'has_password':{'hight':true,'wight':1},'location':{'province':true,'city':'123'},'cpma':1,'lo':true}";
//		String resData = "{data:{'uid':123,'phone':1,'has_password':{'hight':true,'wight':true},'location':null,'lo':{'pre':true,'ci':ok}}}";

		//打印外层字段
		String standardData = "{'code':0,'data':{\"goods_price\":20,\"pay_price\":26,\"order_items\":[{\"goods_id\":\"257404\",\"goods_item_id\":\"282328\",\"count\":2,\"sale_price\":10,\"pay_price_string\":null,\"group_and_spec_name\":\"\\u89c4\\u683c1\\uff1a\\u89c4\\u683c1\",\"image\":{\"s\":{\"url\":\"http:\\/\\/cdn1.meijiabang.cn\\/public\\/upload\\/goodsspc\\/origin\\/2017\\/02\\/28\\/8846b4152caf6f9e3857df5b8d8e6ea996gMjg.jpg@320w_100Q.webp\",\"width\":320,\"height\":0}},\"is_freebies\":false,\"limited_use_voucher\":false,\"name\":\"\\u63a5\\u53e3\\u81ea\\u52a8\\u5316_\\u4e70\\u8d605_\\u6d3b\\u52a8\\u4e2d\\u65b0\\u5ba2\\u4e13\\u4eab\",\"stock\":10000},{\"goods_id\":\"257401\",\"goods_item_id\":282322,\"sale_price\":0,\"pay_price_string\":null,\"group_and_spec_name\":\"\\u89c4\\u683c1\\uff1a\\u89c4\\u683c1\",\"image\":{\"s\":{\"url\":\"http:\\/\\/cdn1.meijiabang.cn\\/public\\/upload\\/goodsspc\\/origin\\/2017\\/02\\/28\\/8846b4152caf6f9e3857df5b8d8e6ea996gMjg.jpg@320w_100Q.webp\",\"width\":320,\"height\":0}},\"is_freebies\":true,\"limited_use_voucher\":false,\"name\":\"\\u63a5\\u53e3\\u81ea\\u52a8\\u5316_\\u4e70\\u8d60_\\u5e93\\u5b58\\u5145\\u8db3\\u7684\\u8d60\\u54c1\",\"stock\":9999,\"count\":1,\"price\":0}],\"price_grade\":[],\"promotion_discount_amount\":0,\"voucher_count\":0,\"voucher_discount_amount\":0,\"available_voucher_count\":0,\"unavailable_voucher_count\":1,\"voucher_class_groups\":[{\"is_selected\":false,\"name\":\"\\u5168\\u573a\\u5238\",\"classes\":[{\"select_code\":\"\",\"tip\":\"\\u5df2\\u4e70\\u6ee10\",\"name\":\"\\u5168\\u573a\\u4f18\\u60e0\",\"vouchers\":[{\"code\":\"11MK3DPF\",\"amount\":\"1.00\",\"name\":\"\\u6d4b\\u8bd5\\u5e76\\u53d1\",\"tip\":\"\",\"condition\":\"\\u4e0d\\u9650\\u6d88\\u8d39\\u91d1\\u989d\",\"expired_time\":1493518544,\"begin_time\":1487214263,\"availed\":false}]}]}],\"receipt_usable_status\":\"1\",\"receipt_explain\":\"\\u670d\\u52a1\\u5668\\u6682\\u505c\\u5f00\\u53d1\\u7968\\u529f\\u80fd\",\"default_receipt_category_id\":\"4\",\"shipment_fee\":6,\"free_shipment_tip\":\"\\u5b9e\\u4ed8\\u6ee1159\\u514d\\u8fd0\\u8d39\",\"shipping_address\":{\"province\":\"\\u5e7f\\u4e1c\\u7701\",\"city\":\"\\u5e7f\\u5dde\\u5e02\",\"district\":\"\\u767d\\u4e91\\u533a\",\"street\":\"\",\"is_default\":true,\"name\":\"\\u6d4b\\u8bd5\\u7ec4\",\"address_id\":\"48955\",\"phone\":\"13580478329\",\"detail\":\"\\u7684\\u7535\"},\"no_price_off\":false}}";
		String resData = "{'data':{'code':'ok','data':{\"goods_price\":20,\"pay_price\":26,\"order_items\":[{\"goods_id\":\"257404\",\"goods_item_id\":\"282328\",\"count\":2,\"sale_price\":10,\"pay_price_string\":null,\"group_and_spec_name\":\"\\u89c4\\u683c1\\uff1a\\u89c4\\u683c1\",\"image\":{\"s\":{\"url\":\"http:\\/\\/cdn1.meijiabang.cn\\/public\\/upload\\/goodsspc\\/origin\\/2017\\/02\\/28\\/8846b4152caf6f9e3857df5b8d8e6ea996gMjg.jpg@320w_100Q.webp\",\"width\":320,\"height\":0}},\"is_freebies\":false,\"limited_use_voucher\":false,\"name\":\"\\u63a5\\u53e3\\u81ea\\u52a8\\u5316_\\u4e70\\u8d605_\\u6d3b\\u52a8\\u4e2d\\u65b0\\u5ba2\\u4e13\\u4eab\",\"stock\":10000},{\"goods_id\":\"257401\",\"goods_item_id\":282322,\"sale_price\":0,\"pay_price_string\":null,\"group_and_spec_name\":\"\\u89c4\\u683c1\\uff1a\\u89c4\\u683c1\",\"image\":{\"s\":{\"url\":\"http:\\/\\/cdn1.meijiabang.cn\\/public\\/upload\\/goodsspc\\/origin\\/2017\\/02\\/28\\/8846b4152caf6f9e3857df5b8d8e6ea996gMjg.jpg@320w_100Q.webp\",\"width\":320,\"height\":0}},\"is_freebies\":true,\"limited_use_voucher\":false,\"name\":\"\\u63a5\\u53e3\\u81ea\\u52a8\\u5316_\\u4e70\\u8d60_\\u5e93\\u5b58\\u5145\\u8db3\\u7684\\u8d60\\u54c1\",\"stock\":9999,\"count\":1,\"price\":0}],\"price_grade\":[],\"promotion_discount_amount\":0,\"voucher_count\":0,\"voucher_discount_amount\":0,\"available_voucher_count\":0,\"unavailable_voucher_count\":1,\"voucher_class_groups\":[{\"is_selected\":false,\"name\":\"\\u5168\\u573a\\u5238\",\"classes\":[{\"select_code\":\"\",\"tip\":\"\\u5df2\\u4e70\\u6ee10\",\"name\":\"\\u5168\\u573a\\u4f18\\u60e0\",\"vouchers\":[{\"code\":\"11MK3DPF\",\"amount\":\"1.00\",\"name\":\"\\u6d4b\\u8bd5\\u5e76\\u53d1\",\"tip\":\"\",\"condition\":\"\\u4e0d\\u9650\\u6d88\\u8d39\\u91d1\\u989d\",\"expired_time\":1493518544,\"begin_time\":1487214263,\"availed\":false}]}]}],\"receipt_usable_status\":\"1\",\"receipt_explain\":\"\\u670d\\u52a1\\u5668\\u6682\\u505c\\u5f00\\u53d1\\u7968\\u529f\\u80fd\",\"default_receipt_category_id\":\"4\",\"shipment_fee\":6,\"free_shipment_tip\":\"\\u5b9e\\u4ed8\\u6ee1159\\u514d\\u8fd0\\u8d39\",\"shipping_address\":{\"province\":\"\\u5e7f\\u4e1c\\u7701\",\"city\":\"\\u5e7f\\u5dde\\u5e02\",\"district\":\"\\u767d\\u4e91\\u533a\",\"street\":\"\",\"is_default\":true,\"name\":\"\\u6d4b\\u8bd5\\u7ec4\",\"address_id\":\"48955\",\"phone\":\"13580478329\",\"detail\":\"\\u7684\\u7535\"},\"no_price_off\":false}}}";

		EqualsJsonType eqType = new EqualsJsonType();
		boolean result;
		result = eqType.respTypeAssertion(standardData, resData);
		System.out.println(result);

		EqualsJsonValue eqValue = new EqualsJsonValue();
		boolean result2;
		result2 = eqValue.respValueAssertion(standardData, resData);
		System.out.println(result2);
	}

}
