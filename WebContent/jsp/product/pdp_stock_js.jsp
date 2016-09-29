<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script>
	var global_item = null;
	var itemInfo_json = null;
	try {
		itemInfo_json = {
			"price" : 0,
			"sale" : 0,
			"mark" : 0.0,
			"review" : 0,
			"itemYN" : "Y",
			"optionValueCode" : "818099-402",
			"deliveryExpensePolicyNo" : 0,
			"ea" : {
				"a" : [ "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" ]
			},
			"items" : {
				"item" : [
						{
							"code" : "스타일값(818099)",
							"color" : "블랙/화이트-안트라사이트-다크 그레이",
							"optionValueCode" : "818099-001",
							"size" : {
								"a" : [
										"240*|*COL*|*818099-001*|*블랙/화이트-안트라사이트-다크 그레이*|*0*|*NK31068567001*|*30*|*0*|*0",
										"245*|*COL*|*818099-001*|*블랙/화이트-안트라사이트-다크 그레이*|*0*|*NK31068567002*|*30*|*0*|*0",
										"250*|*COL*|*818099-001*|*블랙/화이트-안트라사이트-다크 그레이*|*9*|*NK31068567003*|*10*|*0*|*0",
										"255*|*COL*|*818099-001*|*블랙/화이트-안트라사이트-다크 그레이*|*12*|*NK31068567004*|*10*|*0*|*0",
										"260*|*COL*|*818099-001*|*블랙/화이트-안트라사이트-다크 그레이*|*18*|*NK31068567005*|*10*|*0*|*0",
										"265*|*COL*|*818099-001*|*블랙/화이트-안트라사이트-다크 그레이*|*22*|*NK31068567006*|*10*|*0*|*0",
										"270*|*COL*|*818099-001*|*블랙/화이트-안트라사이트-다크 그레이*|*27*|*NK31068567007*|*10*|*0*|*0",
										"275*|*COL*|*818099-001*|*블랙/화이트-안트라사이트-다크 그레이*|*19*|*NK31068567008*|*10*|*0*|*0",
										"280*|*COL*|*818099-001*|*블랙/화이트-안트라사이트-다크 그레이*|*13*|*NK31068567009*|*10*|*0*|*0",
										"285*|*COL*|*818099-001*|*블랙/화이트-안트라사이트-다크 그레이*|*5*|*NK31068567010*|*10*|*0*|*0",
										"290*|*COL*|*818099-001*|*블랙/화이트-안트라사이트-다크 그레이*|*4*|*NK31068567011*|*10*|*0*|*0",
										"295*|*COL*|*818099-001*|*블랙/화이트-안트라사이트-다크 그레이*|*2*|*NK31068567012*|*10*|*0*|*0",
										"300*|*COL*|*818099-001*|*블랙/화이트-안트라사이트-다크 그레이*|*1*|*NK31068567013*|*10*|*0*|*0",
										"305*|*COL*|*818099-001*|*블랙/화이트-안트라사이트-다크 그레이*|*0*|*NK31068567014*|*30*|*0*|*0",
										"310*|*COL*|*818099-001*|*블랙/화이트-안트라사이트-다크 그레이*|*0*|*NK31068567015*|*30*|*0*|*0",
										"320*|*COL*|*818099-001*|*블랙/화이트-안트라사이트-다크 그레이*|*0*|*NK31068567016*|*30*|*0*|*0",
										"330*|*COL*|*818099-001*|*블랙/화이트-안트라사이트-다크 그레이*|*0*|*NK31068567017*|*30*|*0*|*0" ]
							},
							"imgs" : {
								"img" : [
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_1_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_1_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_1_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_2_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_2_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_2_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_3_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_3_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_3_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_4_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_4_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_4_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_5_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_5_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_5_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_6_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_6_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-001_6_2000.png"
										} ],
								"rotationImg" : []
							},
							"investmentQuantity" : 132,
							"opt_dc_prc" : "0",
							"itemSaleStateCode" : "10",
							"histMarkYn" : "N",
							"masterItemYn" : "N"
						},
						{
							"code" : "스타일값(818099)",
							"color" : "블랙/베얼리 그린-컨코드-일렉트릭 그린",
							"optionValueCode" : "818099-003",
							"size" : {
								"a" : [
										"240*|*COL*|*818099-003*|*블랙/베얼리 그린-컨코드-일렉트릭 그린*|*0*|*NK31068567018*|*30*|*0*|*0",
										"245*|*COL*|*818099-003*|*블랙/베얼리 그린-컨코드-일렉트릭 그린*|*0*|*NK31068567019*|*30*|*0*|*0",
										"250*|*COL*|*818099-003*|*블랙/베얼리 그린-컨코드-일렉트릭 그린*|*1*|*NK31068567020*|*30*|*0*|*0",
										"255*|*COL*|*818099-003*|*블랙/베얼리 그린-컨코드-일렉트릭 그린*|*1*|*NK31068567021*|*10*|*0*|*0",
										"260*|*COL*|*818099-003*|*블랙/베얼리 그린-컨코드-일렉트릭 그린*|*1*|*NK31068567022*|*10*|*0*|*0",
										"265*|*COL*|*818099-003*|*블랙/베얼리 그린-컨코드-일렉트릭 그린*|*0*|*NK31068567023*|*30*|*0*|*0",
										"270*|*COL*|*818099-003*|*블랙/베얼리 그린-컨코드-일렉트릭 그린*|*1*|*NK31068567024*|*30*|*0*|*0",
										"275*|*COL*|*818099-003*|*블랙/베얼리 그린-컨코드-일렉트릭 그린*|*2*|*NK31068567025*|*10*|*0*|*0",
										"280*|*COL*|*818099-003*|*블랙/베얼리 그린-컨코드-일렉트릭 그린*|*1*|*NK31068567026*|*10*|*0*|*0",
										"285*|*COL*|*818099-003*|*블랙/베얼리 그린-컨코드-일렉트릭 그린*|*1*|*NK31068567027*|*10*|*0*|*0",
										"290*|*COL*|*818099-003*|*블랙/베얼리 그린-컨코드-일렉트릭 그린*|*0*|*NK31068567028*|*30*|*0*|*0",
										"295*|*COL*|*818099-003*|*블랙/베얼리 그린-컨코드-일렉트릭 그린*|*0*|*NK31068567029*|*30*|*0*|*0",
										"300*|*COL*|*818099-003*|*블랙/베얼리 그린-컨코드-일렉트릭 그린*|*0*|*NK31068567030*|*30*|*0*|*0",
										"305*|*COL*|*818099-003*|*블랙/베얼리 그린-컨코드-일렉트릭 그린*|*0*|*NK31068567031*|*30*|*0*|*0",
										"310*|*COL*|*818099-003*|*블랙/베얼리 그린-컨코드-일렉트릭 그린*|*0*|*NK31068567032*|*30*|*0*|*0",
										"320*|*COL*|*818099-003*|*블랙/베얼리 그린-컨코드-일렉트릭 그린*|*0*|*NK31068567033*|*30*|*0*|*0",
										"330*|*COL*|*818099-003*|*블랙/베얼리 그린-컨코드-일렉트릭 그린*|*0*|*NK31068567034*|*30*|*0*|*0" ]
							},
							"imgs" : {
								"img" : [
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_1_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_1_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_1_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_2_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_2_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_2_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_3_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_3_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_3_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_4_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_4_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_4_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_5_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_5_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_5_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_6_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_6_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-003_6_2000.png"
										} ],
								"rotationImg" : []
							},
							"investmentQuantity" : 6,
							"opt_dc_prc" : "47700",
							"itemSaleStateCode" : "10",
							"histMarkYn" : "Y",
							"masterItemYn" : "Y"
						},
						{
							"code" : "스타일값(818099)",
							"color" : "스쿼드론 블루/화이트-블루 그레이-토탈 크림슨",
							"optionValueCode" : "818099-401",
							"size" : {
								"a" : [
										"240*|*COL*|*818099-401*|*스쿼드론 블루/화이트-블루 그레이-토탈 크림슨*|*0*|*NK31068567035*|*30*|*0*|*0",
										"245*|*COL*|*818099-401*|*스쿼드론 블루/화이트-블루 그레이-토탈 크림슨*|*0*|*NK31068567036*|*30*|*0*|*0",
										"250*|*COL*|*818099-401*|*스쿼드론 블루/화이트-블루 그레이-토탈 크림슨*|*0*|*NK31068567037*|*30*|*0*|*0",
										"255*|*COL*|*818099-401*|*스쿼드론 블루/화이트-블루 그레이-토탈 크림슨*|*0*|*NK31068567038*|*30*|*0*|*0",
										"260*|*COL*|*818099-401*|*스쿼드론 블루/화이트-블루 그레이-토탈 크림슨*|*0*|*NK31068567039*|*30*|*0*|*0",
										"265*|*COL*|*818099-401*|*스쿼드론 블루/화이트-블루 그레이-토탈 크림슨*|*0*|*NK31068567040*|*30*|*0*|*0",
										"270*|*COL*|*818099-401*|*스쿼드론 블루/화이트-블루 그레이-토탈 크림슨*|*1*|*NK31068567041*|*10*|*0*|*0",
										"275*|*COL*|*818099-401*|*스쿼드론 블루/화이트-블루 그레이-토탈 크림슨*|*0*|*NK31068567042*|*30*|*0*|*0",
										"280*|*COL*|*818099-401*|*스쿼드론 블루/화이트-블루 그레이-토탈 크림슨*|*2*|*NK31068567043*|*10*|*0*|*0",
										"285*|*COL*|*818099-401*|*스쿼드론 블루/화이트-블루 그레이-토탈 크림슨*|*0*|*NK31068567044*|*30*|*0*|*0",
										"290*|*COL*|*818099-401*|*스쿼드론 블루/화이트-블루 그레이-토탈 크림슨*|*0*|*NK31068567045*|*30*|*0*|*0",
										"295*|*COL*|*818099-401*|*스쿼드론 블루/화이트-블루 그레이-토탈 크림슨*|*0*|*NK31068567046*|*30*|*0*|*0",
										"300*|*COL*|*818099-401*|*스쿼드론 블루/화이트-블루 그레이-토탈 크림슨*|*0*|*NK31068567047*|*30*|*0*|*0",
										"305*|*COL*|*818099-401*|*스쿼드론 블루/화이트-블루 그레이-토탈 크림슨*|*0*|*NK31068567048*|*30*|*0*|*0",
										"310*|*COL*|*818099-401*|*스쿼드론 블루/화이트-블루 그레이-토탈 크림슨*|*0*|*NK31068567049*|*30*|*0*|*0",
										"320*|*COL*|*818099-401*|*스쿼드론 블루/화이트-블루 그레이-토탈 크림슨*|*0*|*NK31068567050*|*30*|*0*|*0",
										"330*|*COL*|*818099-401*|*스쿼드론 블루/화이트-블루 그레이-토탈 크림슨*|*0*|*NK31068567051*|*30*|*0*|*0" ]
							},
							"imgs" : {
								"img" : [
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_1_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_1_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_1_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_2_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_2_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_2_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_3_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_3_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_3_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_4_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_4_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_4_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_5_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_5_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_5_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_6_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_6_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-401_6_2000.png"
										} ],
								"rotationImg" : []
							},
							"investmentQuantity" : 3,
							"opt_dc_prc" : "47700",
							"itemSaleStateCode" : "10",
							"histMarkYn" : "Y",
							"masterItemYn" : "N"
						},
						{
							"code" : "스타일값(818099)",
							"color" : "블랙/화이트-포토 블루-레이서 블루-블루 틴트",
							"optionValueCode" : "818099-014",
							"size" : {
								"a" : [
										"240*|*COL*|*818099-014*|*블랙/화이트-포토 블루-레이서 블루-블루 틴트*|*0*|*NK31068567052*|*30*|*0*|*0",
										"245*|*COL*|*818099-014*|*블랙/화이트-포토 블루-레이서 블루-블루 틴트*|*0*|*NK31068567053*|*30*|*0*|*0",
										"250*|*COL*|*818099-014*|*블랙/화이트-포토 블루-레이서 블루-블루 틴트*|*9*|*NK31068567054*|*10*|*0*|*0",
										"255*|*COL*|*818099-014*|*블랙/화이트-포토 블루-레이서 블루-블루 틴트*|*16*|*NK31068567055*|*10*|*0*|*0",
										"260*|*COL*|*818099-014*|*블랙/화이트-포토 블루-레이서 블루-블루 틴트*|*26*|*NK31068567056*|*10*|*0*|*0",
										"265*|*COL*|*818099-014*|*블랙/화이트-포토 블루-레이서 블루-블루 틴트*|*32*|*NK31068567057*|*10*|*0*|*0",
										"270*|*COL*|*818099-014*|*블랙/화이트-포토 블루-레이서 블루-블루 틴트*|*32*|*NK31068567058*|*10*|*0*|*0",
										"275*|*COL*|*818099-014*|*블랙/화이트-포토 블루-레이서 블루-블루 틴트*|*24*|*NK31068567059*|*10*|*0*|*0",
										"280*|*COL*|*818099-014*|*블랙/화이트-포토 블루-레이서 블루-블루 틴트*|*18*|*NK31068567060*|*10*|*0*|*0",
										"285*|*COL*|*818099-014*|*블랙/화이트-포토 블루-레이서 블루-블루 틴트*|*9*|*NK31068567061*|*10*|*0*|*0",
										"290*|*COL*|*818099-014*|*블랙/화이트-포토 블루-레이서 블루-블루 틴트*|*5*|*NK31068567062*|*10*|*0*|*0",
										"295*|*COL*|*818099-014*|*블랙/화이트-포토 블루-레이서 블루-블루 틴트*|*1*|*NK31068567063*|*10*|*0*|*0",
										"300*|*COL*|*818099-014*|*블랙/화이트-포토 블루-레이서 블루-블루 틴트*|*3*|*NK31068567064*|*10*|*0*|*0",
										"305*|*COL*|*818099-014*|*블랙/화이트-포토 블루-레이서 블루-블루 틴트*|*0*|*NK31068567065*|*30*|*0*|*0",
										"310*|*COL*|*818099-014*|*블랙/화이트-포토 블루-레이서 블루-블루 틴트*|*0*|*NK31068567066*|*30*|*0*|*0",
										"320*|*COL*|*818099-014*|*블랙/화이트-포토 블루-레이서 블루-블루 틴트*|*0*|*NK31068567067*|*30*|*0*|*0",
										"330*|*COL*|*818099-014*|*블랙/화이트-포토 블루-레이서 블루-블루 틴트*|*0*|*NK31068567068*|*30*|*0*|*0" ]
							},
							"imgs" : {
								"img" : [
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_1_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_1_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_1_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_2_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_2_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_2_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_3_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_3_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_3_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_4_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_4_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_4_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_5_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_5_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_5_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_6_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_6_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-014_6_2000.png"
										} ],
								"rotationImg" : []
							},
							"investmentQuantity" : 175,
							"opt_dc_prc" : "0",
							"itemSaleStateCode" : "10",
							"histMarkYn" : "N",
							"masterItemYn" : "N"
						},
						{
							"code" : "스타일값(818099)",
							"color" : "나이트 머룬/화이트-토탈 크림슨",
							"optionValueCode" : "818099-600",
							"size" : {
								"a" : [
										"240*|*COL*|*818099-600*|*나이트 머룬/화이트-토탈 크림슨*|*0*|*NK31068567069*|*30*|*0*|*0",
										"245*|*COL*|*818099-600*|*나이트 머룬/화이트-토탈 크림슨*|*0*|*NK31068567070*|*30*|*0*|*0",
										"250*|*COL*|*818099-600*|*나이트 머룬/화이트-토탈 크림슨*|*3*|*NK31068567071*|*10*|*0*|*0",
										"255*|*COL*|*818099-600*|*나이트 머룬/화이트-토탈 크림슨*|*4*|*NK31068567072*|*10*|*0*|*0",
										"260*|*COL*|*818099-600*|*나이트 머룬/화이트-토탈 크림슨*|*7*|*NK31068567073*|*10*|*0*|*0",
										"265*|*COL*|*818099-600*|*나이트 머룬/화이트-토탈 크림슨*|*8*|*NK31068567074*|*10*|*0*|*0",
										"270*|*COL*|*818099-600*|*나이트 머룬/화이트-토탈 크림슨*|*9*|*NK31068567075*|*10*|*0*|*0",
										"275*|*COL*|*818099-600*|*나이트 머룬/화이트-토탈 크림슨*|*6*|*NK31068567076*|*10*|*0*|*0",
										"280*|*COL*|*818099-600*|*나이트 머룬/화이트-토탈 크림슨*|*5*|*NK31068567077*|*10*|*0*|*0",
										"285*|*COL*|*818099-600*|*나이트 머룬/화이트-토탈 크림슨*|*3*|*NK31068567078*|*10*|*0*|*0",
										"290*|*COL*|*818099-600*|*나이트 머룬/화이트-토탈 크림슨*|*2*|*NK31068567079*|*10*|*0*|*0",
										"295*|*COL*|*818099-600*|*나이트 머룬/화이트-토탈 크림슨*|*0*|*NK31068567080*|*30*|*0*|*0",
										"300*|*COL*|*818099-600*|*나이트 머룬/화이트-토탈 크림슨*|*0*|*NK31068567081*|*30*|*0*|*0",
										"305*|*COL*|*818099-600*|*나이트 머룬/화이트-토탈 크림슨*|*0*|*NK31068567082*|*30*|*0*|*0",
										"310*|*COL*|*818099-600*|*나이트 머룬/화이트-토탈 크림슨*|*0*|*NK31068567083*|*30*|*0*|*0",
										"320*|*COL*|*818099-600*|*나이트 머룬/화이트-토탈 크림슨*|*0*|*NK31068567084*|*30*|*0*|*0",
										"330*|*COL*|*818099-600*|*나이트 머룬/화이트-토탈 크림슨*|*0*|*NK31068567085*|*30*|*0*|*0" ]
							},
							"imgs" : {
								"img" : [
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_1_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_1_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_1_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_2_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_2_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_2_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_3_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_3_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_3_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_4_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_4_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_4_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_5_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_5_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_5_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_6_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_6_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-600_6_2000.png"
										} ],
								"rotationImg" : []
							},
							"investmentQuantity" : 47,
							"opt_dc_prc" : "0",
							"itemSaleStateCode" : "10",
							"histMarkYn" : "N",
							"masterItemYn" : "N"
						},
						{
							"code" : "스타일값(818099)",
							"color" : "포토 블루/블랙-블루 글로우-화이트-블루 틴트",
							"optionValueCode" : "818099-400",
							"size" : {
								"a" : [
										"240*|*COL*|*818099-400*|*포토 블루/블랙-블루 글로우-화이트-블루 틴트*|*0*|*NK31068567086*|*30*|*0*|*0",
										"245*|*COL*|*818099-400*|*포토 블루/블랙-블루 글로우-화이트-블루 틴트*|*0*|*NK31068567087*|*30*|*0*|*0",
										"250*|*COL*|*818099-400*|*포토 블루/블랙-블루 글로우-화이트-블루 틴트*|*3*|*NK31068567088*|*10*|*0*|*0",
										"255*|*COL*|*818099-400*|*포토 블루/블랙-블루 글로우-화이트-블루 틴트*|*4*|*NK31068567089*|*10*|*0*|*0",
										"260*|*COL*|*818099-400*|*포토 블루/블랙-블루 글로우-화이트-블루 틴트*|*7*|*NK31068567090*|*10*|*0*|*0",
										"265*|*COL*|*818099-400*|*포토 블루/블랙-블루 글로우-화이트-블루 틴트*|*9*|*NK31068567091*|*10*|*0*|*0",
										"270*|*COL*|*818099-400*|*포토 블루/블랙-블루 글로우-화이트-블루 틴트*|*10*|*NK31068567092*|*10*|*0*|*0",
										"275*|*COL*|*818099-400*|*포토 블루/블랙-블루 글로우-화이트-블루 틴트*|*6*|*NK31068567093*|*10*|*0*|*0",
										"280*|*COL*|*818099-400*|*포토 블루/블랙-블루 글로우-화이트-블루 틴트*|*5*|*NK31068567094*|*10*|*0*|*0",
										"285*|*COL*|*818099-400*|*포토 블루/블랙-블루 글로우-화이트-블루 틴트*|*3*|*NK31068567095*|*10*|*0*|*0",
										"290*|*COL*|*818099-400*|*포토 블루/블랙-블루 글로우-화이트-블루 틴트*|*2*|*NK31068567096*|*10*|*0*|*0",
										"295*|*COL*|*818099-400*|*포토 블루/블랙-블루 글로우-화이트-블루 틴트*|*0*|*NK31068567097*|*30*|*0*|*0",
										"300*|*COL*|*818099-400*|*포토 블루/블랙-블루 글로우-화이트-블루 틴트*|*0*|*NK31068567098*|*30*|*0*|*0",
										"305*|*COL*|*818099-400*|*포토 블루/블랙-블루 글로우-화이트-블루 틴트*|*0*|*NK31068567099*|*30*|*0*|*0",
										"310*|*COL*|*818099-400*|*포토 블루/블랙-블루 글로우-화이트-블루 틴트*|*0*|*NK31068567100*|*30*|*0*|*0",
										"320*|*COL*|*818099-400*|*포토 블루/블랙-블루 글로우-화이트-블루 틴트*|*0*|*NK31068567101*|*30*|*0*|*0",
										"330*|*COL*|*818099-400*|*포토 블루/블랙-블루 글로우-화이트-블루 틴트*|*0*|*NK31068567102*|*30*|*0*|*0" ]
							},
							"imgs" : {
								"img" : [
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_1_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_1_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_1_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_2_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_2_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_2_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_3_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_3_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_3_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_4_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_4_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_4_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_5_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_5_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_5_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_6_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_6_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_6_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_7_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_7_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-400_7_2000.png"
										} ],
								"rotationImg" : []
							},
							"investmentQuantity" : 49,
							"opt_dc_prc" : "0",
							"itemSaleStateCode" : "10",
							"histMarkYn" : "N",
							"masterItemYn" : "N"
						},
						{
							"code" : "스타일값(818099)",
							"color" : "블랙/브라이트 시트러스-울프 그레이-화이트",
							"optionValueCode" : "818099-008",
							"size" : {
								"a" : [
										"240*|*COL*|*818099-008*|*블랙/브라이트 시트러스-울프 그레이-화이트*|*0*|*NK31068567103*|*30*|*0*|*0",
										"245*|*COL*|*818099-008*|*블랙/브라이트 시트러스-울프 그레이-화이트*|*0*|*NK31068567104*|*30*|*0*|*0",
										"250*|*COL*|*818099-008*|*블랙/브라이트 시트러스-울프 그레이-화이트*|*5*|*NK31068567105*|*10*|*0*|*0",
										"255*|*COL*|*818099-008*|*블랙/브라이트 시트러스-울프 그레이-화이트*|*7*|*NK31068567106*|*10*|*0*|*0",
										"260*|*COL*|*818099-008*|*블랙/브라이트 시트러스-울프 그레이-화이트*|*12*|*NK31068567107*|*10*|*0*|*0",
										"265*|*COL*|*818099-008*|*블랙/브라이트 시트러스-울프 그레이-화이트*|*15*|*NK31068567108*|*10*|*0*|*0",
										"270*|*COL*|*818099-008*|*블랙/브라이트 시트러스-울프 그레이-화이트*|*13*|*NK31068567109*|*10*|*0*|*0",
										"275*|*COL*|*818099-008*|*블랙/브라이트 시트러스-울프 그레이-화이트*|*11*|*NK31068567110*|*10*|*0*|*0",
										"280*|*COL*|*818099-008*|*블랙/브라이트 시트러스-울프 그레이-화이트*|*8*|*NK31068567111*|*10*|*0*|*0",
										"285*|*COL*|*818099-008*|*블랙/브라이트 시트러스-울프 그레이-화이트*|*4*|*NK31068567112*|*10*|*0*|*0",
										"290*|*COL*|*818099-008*|*블랙/브라이트 시트러스-울프 그레이-화이트*|*2*|*NK31068567113*|*10*|*0*|*0",
										"295*|*COL*|*818099-008*|*블랙/브라이트 시트러스-울프 그레이-화이트*|*1*|*NK31068567114*|*10*|*0*|*0",
										"300*|*COL*|*818099-008*|*블랙/브라이트 시트러스-울프 그레이-화이트*|*1*|*NK31068567115*|*10*|*0*|*0",
										"305*|*COL*|*818099-008*|*블랙/브라이트 시트러스-울프 그레이-화이트*|*0*|*NK31068567116*|*30*|*0*|*0",
										"310*|*COL*|*818099-008*|*블랙/브라이트 시트러스-울프 그레이-화이트*|*0*|*NK31068567117*|*30*|*0*|*0",
										"320*|*COL*|*818099-008*|*블랙/브라이트 시트러스-울프 그레이-화이트*|*0*|*NK31068567118*|*30*|*0*|*0",
										"330*|*COL*|*818099-008*|*블랙/브라이트 시트러스-울프 그레이-화이트*|*0*|*NK31068567119*|*30*|*0*|*0" ]
							},
							"imgs" : {
								"img" : [
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_1_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_1_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_1_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_2_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_2_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_2_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_3_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_3_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_3_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_4_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_4_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_4_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_5_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_5_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_5_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_6_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_6_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-008_6_2000.png"
										} ],
								"rotationImg" : []
							},
							"investmentQuantity" : 79,
							"opt_dc_prc" : "0",
							"itemSaleStateCode" : "10",
							"histMarkYn" : "N",
							"masterItemYn" : "N"
						},
						{
							"code" : "스타일값(818099)",
							"color" : "로얄 블루/블루 글로우-다크 퍼플 더스트",
							"optionValueCode" : "818099-402",
							"size" : {
								"a" : [
										"240*|*COL*|*818099-402*|*로얄 블루/블루 글로우-다크 퍼플 더스트*|*0*|*NK31068567120*|*30*|*0*|*0",
										"245*|*COL*|*818099-402*|*로얄 블루/블루 글로우-다크 퍼플 더스트*|*0*|*NK31068567121*|*30*|*0*|*0",
										"250*|*COL*|*818099-402*|*로얄 블루/블루 글로우-다크 퍼플 더스트*|*3*|*NK31068567122*|*10*|*0*|*0",
										"255*|*COL*|*818099-402*|*로얄 블루/블루 글로우-다크 퍼플 더스트*|*5*|*NK31068567123*|*10*|*0*|*0",
										"260*|*COL*|*818099-402*|*로얄 블루/블루 글로우-다크 퍼플 더스트*|*8*|*NK31068567124*|*10*|*0*|*0",
										"265*|*COL*|*818099-402*|*로얄 블루/블루 글로우-다크 퍼플 더스트*|*10*|*NK31068567125*|*10*|*0*|*0",
										"270*|*COL*|*818099-402*|*로얄 블루/블루 글로우-다크 퍼플 더스트*|*8*|*NK31068567126*|*10*|*0*|*0",
										"275*|*COL*|*818099-402*|*로얄 블루/블루 글로우-다크 퍼플 더스트*|*7*|*NK31068567127*|*10*|*0*|*0",
										"280*|*COL*|*818099-402*|*로얄 블루/블루 글로우-다크 퍼플 더스트*|*5*|*NK31068567128*|*10*|*0*|*0",
										"285*|*COL*|*818099-402*|*로얄 블루/블루 글로우-다크 퍼플 더스트*|*3*|*NK31068567129*|*10*|*0*|*0",
										"290*|*COL*|*818099-402*|*로얄 블루/블루 글로우-다크 퍼플 더스트*|*2*|*NK31068567130*|*10*|*0*|*0",
										"295*|*COL*|*818099-402*|*로얄 블루/블루 글로우-다크 퍼플 더스트*|*1*|*NK31068567131*|*10*|*0*|*0",
										"300*|*COL*|*818099-402*|*로얄 블루/블루 글로우-다크 퍼플 더스트*|*1*|*NK31068567132*|*10*|*0*|*0",
										"305*|*COL*|*818099-402*|*로얄 블루/블루 글로우-다크 퍼플 더스트*|*0*|*NK31068567133*|*30*|*0*|*0",
										"310*|*COL*|*818099-402*|*로얄 블루/블루 글로우-다크 퍼플 더스트*|*0*|*NK31068567134*|*30*|*0*|*0",
										"320*|*COL*|*818099-402*|*로얄 블루/블루 글로우-다크 퍼플 더스트*|*0*|*NK31068567135*|*30*|*0*|*0",
										"330*|*COL*|*818099-402*|*로얄 블루/블루 글로우-다크 퍼플 더스트*|*0*|*NK31068567136*|*30*|*0*|*0" ]
							},
							"imgs" : {
								"img" : [
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_1_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_1_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_1_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_2_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_2_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_2_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_3_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_3_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_3_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_4_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_4_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_4_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_5_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_5_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_5_2000.png"
										},
										{
											"thumb" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_6_50.png",
											"normal" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_6_400.png",
											"extend" : "/goods/asset/itemDetail/extend/p0.png",
											"detail" : "http://image.nike.co.kr/goods/31/06/85/67/818099_COL_818099-402_6_2000.png"
										} ],
								"rotationImg" : []
							},
							"investmentQuantity" : 53,
							"opt_dc_prc" : "0",
							"itemSaleStateCode" : "10",
							"histMarkYn" : "N",
							"masterItemYn" : "N"
						} ]
			}
		};

	} catch (e) {
		//단품이 한개도 없으면 스크립트 오류 발생
	}

	$(document)
			.ready(
					function() {
						var opt = itemInfo_json.optionValueCode;

						// 대표단품
						if (opt == "" || opt == null) {
							for (var i = 0; i < itemInfo_json.items.item.length; i++) {
								if (itemInfo_json.items.item[i].masterItemYn == "Y") {
									opt = itemInfo_json.items.item[i].optionValueCode;
									break;
								}
							}
						}
						if (!opt) {
							try {
								if ($("#colorList ul").eq(0).find(">li").size() > 0) {
									opt = $("#colorList ul").eq(0)
											.find(">li>a").attr("title");
								} else if ($("#colorList ul").eq(1).find(">li")
										.size() > 0) {
									opt = $("#colorList ul").eq(1)
											.find(">li>a").attr("title");
								} else {
									opt = itemInfo_json.items.item[0].optionValueCode;
								}
							} catch (e) {
								opt = null;
							}
						}

						if (opt != null && "" != opt) {
							var flagOn = false;
							$("#colorList ul")
									.each(
											function() {
												$(this)
														.find(">li")
														.each(
																function() {
																	if ($(this)
																			.find(
																					">a")
																			.attr(
																					"title") == opt) {
																		$(this)
																				.find(
																						">a")
																				.addClass(
																						'on');
																		flagOn = true;
																	}
																});
											});
							if (!flagOn) {
								$(".color_option2 ul")
										.each(
												function() {
													$(this)
															.find(">li")
															.each(
																	function() {
																		if ($(
																				this)
																				.find(
																						">a")
																				.attr(
																						"title") == opt) {
																			$(
																					this)
																					.find(
																							">a")
																					.addClass(
																							'on');
																		}
																	});
												});
							}
						}
						fn_set_goods_pic(opt);
						if ("10" === "10") {
							$("#colorList ul").eq(0).find(">li>a")
									.on(
											"tap, click",
											function(e) {
												fn_set_goods_pic($(this).attr(
														"title"));

												if (rsvpChk != 'Y') {
													$("#selectSize")
															.html('사이즈');
													$("#selectQty").html('수량');
												}
												resetEvent();
												fn_catalystEvent('color', $(
														this).attr("title"));

												$('.item-list ul li a')
														.removeClass('on');
												$(this).addClass('on');

												$('.jqzoom').jqzoom({
													zoomWidth : 384,
													zoomHeight : 620,
													preloadImages : false,
													title : false
												});

												return false;
											});
						} else {
							$("#colorList ul li a").attr("href", "#");
							$("#colorList ul li a")
									.on(
											"tap, click",
											function(e) {
												$("#itemNo").val("");
												$("#itemSize").val("");
												$("#orderQuantity").val("");

												$("#selectSize").html('사이즈');
												$("#selectQty").html('수량');

												fn_set_goods_pic($(this).attr(
														"title")); // 상품 이미지 처리
												resetEvent();
												fn_catalystEvent('color', $(
														this).attr("title"));
											});
						}


						zoomImgReplace();
						resetEvent();
						// 실측사이즈 초기값 셋팅
						changeRealSize($("#realSizeIninSizeCode").val());
					});

	// RSVP 상품 사이즈와 수량 초기화
	function initOptionSet() {
		var size_info = $("#sizeList li").eq(0).find(">a").attr("title").split(
				"@");
		var qty_info = $("#qtyList li").eq(0).find(">a").attr("title");
		$("#selectSize").html('사이즈(<strong>' + size_info[0] + '</strong>)');
		$("#itemNo").val(size_info[1]);
		$("#itemSize").val(size_info[0]);
		$("#orderQuantity").val('1');
		$("#selectQty").html('수량(<strong>' + qty_info + '</strong>)');
	}

	// zoom 이미지 50으로 리로드 후 원래 사이즈 2000 으로 원복
	function zoomImgReplace() {
		$zoomCon.find(".imgBoard .img-area .image").each(function() {
			$(this).find(">li").each(function() {
				var img = $(this).find("img");
				img.attr("src", img.attr("src").replace("_50.", "_2000."));
			});
		});
	}

	function resetEvent() {
		// detaill.js의 function..
		renderInitSize();
		renderInitQuan();

		// 사이즈 옵션 선택 이벤트
		$("#sizeList li a")
				.on(
						"click",
						function(e) {

							if ($(this).hasClass("out")) {
								return;
							}

							var size_info = $(this).attr("title").split("@");
							$("#selectSize").html(
									'사이즈(<strong>' + size_info[0]
											+ '</strong>)');
							$("#itemNo").val(size_info[1]);
							$("#itemSize").val(size_info[0]);
							$("#sizeAlertLine").hide();
							$("#sizeAlert").hide();

							// 수량 셀렉트 박스 처리
							var select_size = $("#itemNo").val();
							var select_qty = $("#qtyList");
							var qty_option = "";

							var size_arr = null;
							for (var i = 0; i < global_item.size.a.length; i++) {
								size_arr = global_item.size.a[i].split("*|*");
								//console.log("size_arr : select_size : " + size_arr[5] + ":" + select_size);

								if (size_arr[5] == select_size) {
									var min = size_arr[8];
									if (rsvpChk == "Y") { // RSVP 상품의 경우 최소구매수량은 항상 1개 고정
										min = 1;
										qty_option += '<li><a href="#" title="1" class="out">1</a></li>';
									} else {
										if (!min || min < 1) {
											min = 1;
										}
										if (min <= size_arr[4]) {
											for (var j = min; j <= 10; j++) {
												if (size_arr[4] >= j) {
													qty_option += '<li><a href="#" title="' + j + '">'
															+ j + '</a></li>';
												} else {
													qty_option += '<li><a href="#" title="' + j + '" class="out">'
															+ j + '</a></li>';
												}
											}
										}
									}
									select_qty.html(qty_option);
									$("#orderQuantity").val(min);
									$("#selectQty").html(
											'수량(<strong>' + min + '</strong>)');
									//$("#orderQuantity").val("");
									//$("#selectQty").html('수량');
									resetEvent();
									break;
								}
							}
						});

		$("#qtyArea").on("click", function(e) {
			checkSize();
			return false;
		});

		// 사이즈 옵션 선택 이벤트
		$("#qtyList li a").on("click", function(e) {

			if ($(this).hasClass("out")) {
				return false;
			}

			var qty_info = $(this).attr("title");
			$("#orderQuantity").val(qty_info);
			$("#selectQty").html('수량(<strong>' + qty_info + '</strong>)');
			$("#qtyAlertLine").hide();
			$("#qtyAlert").hide();

			return false;
		});

		// 실측사이즈 사이즈 선택 이벤트
		$("#sizeList2 li a").on("click", function(e) {

			if ($(this).hasClass("out")) {
				return;
			}

			changeRealSize($(this).text());
		});
	}

	function changeRealSize(sizeCode) {
		$("tr[name=realSizeTgt]").each(function() {
			var trId = $(this).prop("id") + '_' + sizeCode;
			$(this).html($("#" + trId).html());
		});
	}

	function fn_set_goods_pic(optionValueCode) {
		if (!optionValueCode) {
			return;
		}

		$("#sizeAlertLine").hide();
		$("#sizeAlert").hide();
		$("#qtyAlertLine").hide();
		$("#qtyAlert").hide();

		var item = null;
		var goodsPrice = "159000";
		var zoomIdx = 0; // Zoom 영역 image 선책

		var discountText = "";
		if ("N" == "Y") {
			discountText = "&nbsp;";
			//discountText = "할인가&nbsp;";
		}
		var onlySaleItemShowCnt = 0;
		for (var i = 0; i < itemInfo_json.items.item.length; i++) {
			//console.log(itemInfo_json.items.item[i].optionValueCode === optionValueCode);
			if (itemInfo_json.items.item[i].optionValueCode === optionValueCode) {
				item = itemInfo_json.items.item[i];
				global_item = item;
				zoomIdx = i;
				onlySaleItemShowCnt = 1;

				// 품절 단품의 경우 숨김처리
				if (itemInfo_json.items.item[i].investmentQuantity <= 0) {
					$("#itemBtnArea").hide();
				} else {
					$("#itemBtnArea").show();
				}

				// 2015.07.23 추가 - 단순하게 옵션할인이 적용된 경우에도 비교가격이 표기되어야 한다.
				if ("N" == "Y" && ("N" == "Y" || "N" == "Y")) {
					$("#itemOriAmtArea").show();
					$("#itemPriceArea").addClass('txt_orange');
				} else {

					// 세일x, 가격인하x, 옵션할인o & 직전 20일이력이 충족된 경우
					if (item.histMarkYn == 'Y' && Number(item.opt_dc_prc) > 0) {
						$("#itemOriAmtArea").show();
						$("#itemPriceArea").addClass('txt_orange');
					} else {
						$("#itemOriAmtArea").hide();
						$("#itemPriceArea").removeClass('txt_orange');
					}
				}

				if ("0" != item.opt_dc_prc) {
					goodsPrice = Number(goodsPrice) - Number(item.opt_dc_prc);
				}

				$("#itemPriceArea").html(
						discountText + numberFormat(goodsPrice) + "원");

				// %컬러명% 스타일-컬러 #%컬러옵션값코드%
				$("#selectOptionValue")
						.html(
								"<div class='fll'><span>"
										+ item.size.a[0].split("*|*")[3]
										+ "</span></div> <div class='flr'>스타일-컬러 #<span>&nbsp;"
										+ item.size.a[0].split("*|*")[2]
										+ "</span></div>");
				$("#colorName").val(item.size.a[0].split("*|*")[3]);
				$("#prop20").val(item.size.a[0].split("*|*")[2]); // 2016.08.18 
				break;
			}
		}

		// Zoom 영역 image 선택
		renderDetailThumb(zoomIdx);

		// 이미지
		var thumbImgList = "";
		var detailImgList = "";
		var noImage = 'http://image.nike.co.kr/';
		var mainImg = "";

		for (var i = (item.imgs.img.length > 1 ? 1 : 0); i < item.imgs.img.length; i++) {
			mainImg = item.imgs.img[i].detail.replace('_2000.', '_750.');
			thumbImgList += '<li><a href="#" class="" title=""><img src="' + item.imgs.img[i].thumb + '" alt="" onerror="this.src=\' ' + noImage + '/web/no-img/50x50.gif\'"/></a></li>';
			// Midas - 572 [나이키] 상품상세 리사이징 사이즈 변경 요청 :: 기존의 2000사이즈 이미지를 노출하던 상세이미지영역에 750사이즈를 노출 (확대이미지에는 그대로 2000사이즈 사용)
			detailImgList += '<li style="display:none;"><a href="' + item.imgs.img[i].detail + '" class="jqzoom" title=""><img src="' + mainImg + '" alt="" onerror="this.src=\' ' + noImage + '/web/no-img/400x400.gif\'" width="520" style="padding:50px" /></a></li>';
			//detailImgList += '<li style="display:none;"><a href="' + item.imgs.img[i].detail + '" class="jqzoom" title=""><img src="' + item.imgs.img[i].detail + '" alt="" onerror="this.src=\' ' + noImage + '/web/no-img/400x400.gif\'" width="520" style="padding:50px" /></a></li>';
			//detailImgList += '<li style="display:none;"><a href="#" class="" title=""><img src="' + item.imgs.img[i].normal + '" alt="" onerror="this.src=\' ' + noImage + '/web/no-img/400x400.gif\'"/></a></li>';
		}
		$("#thumbImgList").html(thumbImgList);
		initialDetail(5); //부가이미지 화살표 처리

		$("#detailImgList").html(detailImgList);
		$("#detailImgList li").eq(0).show();

		$('.jqzoom').jqzoom({
			zoomWidth : 384,
			zoomHeight : 620,
			preloadImages : false,
			title : false
		});

		addClickThumb();

		// 상품설명 영역 이미지(상품 설명의 상품 image를 보여줄 영역이 있을 경우에만...)
		if ($("#goodsDescImg").length > 0) {
			$("#goodsDescImg")
					.html(
							'<img src=" ' +item.imgs.img[0].normal  + ' " alt="" width="240" height="240" onerror="this.src=\' ' + noImage + '/web/no-img/400x400.gif\'" />');
		}

		// 사이즈 셀렉트 박스 처리
		var select_size = $("#sizeList");
		var select_qty = $("#qtyList");
		var size_option = "";
		var qty_option = "";
		var size_arr = null;

		/*
		 * 사이즈 *|* 컬러옵션코드 *|* 컬러옵션값코드 *|* 컬러옵션텍스트명 *|*
		 * 재고수량 *|* 아이템넘버 *|* 아이템판매상태*|*아이템가격(옵션할인적용)*|*최소 주문수량
		 * ex) S*|*COL*|*137*|*BLACK CHECK*|*50*|*MJ0001432*|*10*|*30000*|*2
		 */
		size_arr = item.size.a[0].split("*|*");

		if (rsvpChk == 'Y') { //RSVP 상품의 경우 사이즈, 수량 고정
			if ("10" === "10" && item.itemSaleStateCode === "10") {

				size_arr = item.size.a[0].split("*|*");
				var rsvpItemSize = "";
				var rsvpItemQty = "";

				rsvpItemSize += '<a href="#" class="btn-pdp-type1 btn-pdp-rsvp size">';
				rsvpItemSize += '<span id="selectSize">사이즈(<strong>'
						+ size_arr[0] + '</strong>)</span>'; //당첨된 한가지 사이즈
				rsvpItemSize += '</a>';

				rsvpItemQty += '<a href="#" class="btn-pdp-type1 btn-pdp-rsvp quantity">';
				rsvpItemQty += '<span id="selectQty">수량(<strong>1</strong>)</span>'; //수량은 1로 픽스
				rsvpItemQty += '</a>';

				$("#sizeArea").empty().html(rsvpItemSize);
				$("#qtyArea").empty().html(rsvpItemQty);

				$("#itemNo").val(size_arr[5]); //단품번호
				$("#itemSize").val(size_arr[0]); //사이즈
				$("#orderQuantity").val("1"); //수량

				addClickThumb();
				setDataIndex();
			}
		} else {
			if ("10" === "10" && item.itemSaleStateCode === "10") {
				// 사이즈가 없거나 하나인 상품
				if (item.size.a.length == 1) {
					//console.log("사이즈가 없거나 하나인 상품");
					size_option += '<li><a href="#" title="' + size_arr[0] +'@'+ size_arr[5] + '">'
							+ size_arr[0] + '</a></li>';
					for (var i = 0; i < 10; i++) {
						if (size_arr[4] >= i) {
							qty_option += '<li><a href="#" title="' + (i + 1)
									+ '">' + (i + 1) + '</a></li>';
						} else {
							qty_option += '<li><a href="#" title="' + (i + 1)
									+ '" class="out">' + (i + 1) + '</a></li>';
						}
					}

				} else {
					//console.log("사이즈가 있는 상품");
					for (var i = 0; i < item.size.a.length; i++) {
						size_arr = item.size.a[i].split("*|*");
						//console.log(size_arr);
						// 판매중이고 재고가 있는 사이즈일 경우만 선택 가능
						if (size_arr[6] != "10" || size_arr[4] <= 0
								|| size_arr[4] < size_arr[8]) {
							size_option += '<li><a href="#" title="' + size_arr[0] +'@'+ size_arr[5] + '" class="out">'
									+ size_arr[0] + '</a></li> \n';
						} else {
							size_option += '<li><a href="#" title="' + size_arr[0] +'@'+ size_arr[5] + '">'
									+ size_arr[0] + '</a></li>';
						}
					}

					for (var i = 1; i <= 10; i++) {
						qty_option += '<li><a href="#" title="' + i + '" class="out">'
								+ i + '</a></li>';
					}

				}

				$("#itemNo").val("");
				$("#itemSize").val("");
				$("#orderQuantity").val("");

			} else {

				// 상품의 '품절', '판매종료' 모든 단품의 웹재고=0, '전시안함' 일 때
				// 모든 사이즈 옵션 표시
				size_option = "";
				for (var i = 0; i < item.size.a.length; i++) {
					size_arr = item.size.a[i].split("*|*");
					size_option += '<li><a href="#" title="' + size_arr[0] +'@'+ size_arr[5] + '">'
							+ size_arr[0] + '</a></li>';
				}

				for (var i = 1; i <= 10; i++) {
					qty_option += '<li><a href="#" title="' + i + '">' + i
							+ '</a></li>';
				}
				$("#cartArea").hide();
			}

			select_size.html(size_option);
			select_qty.html(qty_option);
			addClickThumb();
			setDataIndex();

		}

		//상품리뷰 사이즈
		var reviewSize = $("#reviewSize");
		var reviewOption = "";
		var purSizeVal = $("#assessmentForm #purSizeValue").val();

		if (rsvpChk == 'Y') { //RSVP 상품의 경우 사이즈, 수량 고정
			if ("10" === "10" && item.itemSaleStateCode === "10") {
				if (purSizeVal != '') {
					reviewOption += ' <p class="sortTxt">' + purSizeVal
							+ '</p> ';
				} else {
					reviewOption += ' <p class="sortTxt">선택</p> ';
				}
				reviewOption += '<ul>';

				size_arr = item.size.a[0].split("*|*");

				if (purSizeVal == size_arr[0]) {
					reviewOption += '<li><input type="radio" name="purSizeVal" id="purSizeVal" value=""><span>선택</span></li>';
					reviewOption += '<li class="on"><input type="radio" name="purSizeVal" id="purSizeVal" checked="checked" value="'+size_arr[0]+'">';
					reviewOption += ' <span>' + size_arr[0] + '</span></li>';
				} else {
					reviewOption += ' <li><input type="radio" name="purSizeVal" id="purSizeVal" value="'+size_arr[0]+'">';
					reviewOption += ' <span>' + size_arr[0] + '</span></li>';
				}

			}
		} else {
			if (purSizeVal != '') {
				reviewOption += ' <p class="sortTxt">' + purSizeVal + '</p> ';
			} else {
				reviewOption += ' <p class="sortTxt">선택</p> ';
			}
			reviewOption += '<ul>';
			for (var i = 0; i < item.size.a.length; i++) {
				size_arr = item.size.a[i].split("*|*");
				if (size_arr[6] != "10" || size_arr[4] <= 0
						|| size_arr[4] < size_arr[8]) {
				} else {
					if (purSizeVal == size_arr[0]) {
						reviewOption += '<li><input type="radio" name="purSizeVal" id="purSizeVal" value=""><span>선택</span></li>';
						reviewOption += '<li class="on"><input type="radio" name="purSizeVal" id="purSizeVal" checked="checked" value="'+size_arr[0]+'">';
						reviewOption += ' <span>' + size_arr[0]
								+ '</span></li>';
					} else {
						reviewOption += ' <li><input type="radio" name="purSizeVal" id="purSizeVal" value="'+size_arr[0]+'">';
						reviewOption += ' <span>' + size_arr[0]
								+ '</span></li>';
					}
				}
				//reviewOption += '	<li ><input type="radio" name="reviewSort" ><span>' + size_arr[0] + '</span></li>';
			}
		}
		reviewOption += '</ul>';
		reviewSize.html(reviewOption);

	}

	// 사이즈를 선택하지 않고 수량을 선택할 경우
	function checkSize() {
		if ($("#itemNo").val() == "") {
			$("#sizeAlertLine").show();
			$("#sizeAlert").show();
			return;
		}
		renderQuantity();
	}

	// ceres-6182
	// 바로구매- 특정 고객 대상 프로모션 체크
	function checkDirectBuy() {
		/* var form = document.getElementById("submitForm");
		
		form.action="http://lecs.nike.co.kr/aws/goods/checkSpcfCstmrPromotionAjax.lecs"; 
		IframeSubmitter.submit(form, "handleResultPromotion", "submitFrame"); */
		//	var goodsNo = "NK31068567";
		var ajaxUrl = "http://lecs.nike.co.kr/aws/goods/checkSpcfCstmrPromotionAjax.lecs?storeNo=2&siteNo=14218&goodsNo=NK31068567&memberNo=&purchaseQuantityLimitYn=N&maximumLimitQuantity=0";

		$.ajax({
			type : "GET",
			url : ajaxUrl,
			dataType : 'jsonp',
			jsonpCallback : "callback",
			xhrFields : {
				withCredentials : true
			},
			crossDomain : true,
			success : function(result) {
				handleResultPromotion(result);
			}
		});
	}

	// 바로구매- 특정 고객 대상 프로모션 체크 callback
	function handleResultPromotion(result) {
		if (result.PromGoodsFlag == "Y") {
			if (result.PromMemberFlag == "X") {
				// 프로모션 상품이며 비로그인한 경우
				if (confirm("선택하신 상품은 특정 회원에 한해 구매 가능한 상품입니다.\n프로모션 대상자 확인을 위해 로그인이 필요합니다.")) {
					loginType("A", "");
				} else {
					// 메인으로 이동
					document.location.href = "http://www.nike.co.kr/";
				}
			} else if (result.PromMemberFlag == "N") {
				//alert("죄송합니다. 고객님.\n해당 상품은 "+result.PromDetailContents+" 대상 프로모션 상품으로 구매가 불가합니다.");           
				//alert("죄송합니다. 고객님.\n해당 상품은 [RSVP 참가자] 대상 프로모션 상품으로 구매가 불가합니다.");   
				alert("THE DRAW ‘더 드로우’ 당첨자만 구매 가능합니다. 다음 THE DRAW ‘더 드로우’ 응모에 참여해 보세요.");
				// 메인으로 이동
				document.location.href = "http://www.nike.co.kr/";
			} else if (result.PromMemberFlag == "Y") {
				if (result.PromUnitCd == "08" && result.PromGoodsOrderYn == "N") {
					alert("THE DRAW ‘더 드로우’에 당첨된 상품을 구매하였습니다. 구매 이력은 my쇼핑정보>주문배송조회 메뉴에서 확인하세요.");
					// 메인으로 이동
					document.location.href = "http://www.nike.co.kr/";
				} else {
					cartSubmit("20");
				}
			}
		} else if (result.PromGoodsFlag == "N") {
			cartSubmit("20");
		}
	}

	// 장바구니 담기 (바로구매도 사용 2014.03.)
	function cartSubmit(cartSectionCode) {
		var form = document.getElementById("submitForm");

		if ($("#itemNo").val() == "") {
			$("#sizeAlertLine").show();
			$("#sizeAlert").show();
			return;
		} else if ($("#orderQuantity").val() == "") {
			$("#qtyAlertLine").show();
			$("#qtyAlert").show();
			return;
		}

		if (rsvpChk == 'Y' && $("#orderQuantity").val() != "1") {
			alert("비정상적인 접근입니다. 메인으로 이동합니다.");
			// 메인으로 이동
			document.location.href = "http://www.nike.co.kr/";
		}

		// ceres-6042 : 자격정지 체크
		if ($("#memberIdForGen").val() != "") {
			var condiParam = "memberNo=" + $("#memberNo").val();
			if (cartSectionCode == "20") { // 바로구매인 경우 자격정지 체크-2015.02.04 수정요청으로 추가함.

				$
						.ajax({
							type : "get",
							dataType : "jsonp",
							jsonp : "callback",
							//url:  "/mobile/goods/memberRightLimitAjax.lecs",
							url : "http://lecs.nike.co.kr/aws/goods/memberRightLimitAjax.lecs",
							xhrFields : {
								withCredentials : true
							},
							crossDomain : true,
							success : function(result) {
								if (result) {
									document.location.href = "/display/displayShop.lecs?displayNo=NK1A43A02";
								} else {
									$("#cartSectionCode").val(cartSectionCode); //장바구니,바로구매 구분

									form.action = "http://lecs.nike.co.kr/cart/createCart.lecs";
									IframeSubmitter.submit(form,
											"handleResultCart", "submitFrame");
								}
							}
						});
			} else {
				$("#cartSectionCode").val(cartSectionCode); //장바구니,바로구매 구분

				form.action = "http://lecs.nike.co.kr/cart/createCart.lecs";
				IframeSubmitter.submit(form, "handleResultCart", "submitFrame");
			}
		} else {
			$("#cartSectionCode").val(cartSectionCode); //장바구니,바로구매 구분

			form.action = "http://lecs.nike.co.kr/cart/createCart.lecs";
			IframeSubmitter.submit(form, "handleResultCart", "submitFrame");
		}

		fbq('track', 'AddToCart', {
			content_ids : 'NK31068567',
			content_type : 'product'
		});
	}

	//장바구니 담기 확인 callback
	function handleResultCart(result) {
		if (result.success) {
			//바로구매는 cartSn 조회
			if ($("#cartSectionCode").val() == '20') {
				var form = document.getElementById("submitForm");
				form.action = "http://lecs.nike.co.kr/cart/getMaxCartSnAjax.lecs";
				IframeSubmitter.submit(form, "handleResultCart20",
						"submitFrame");
			} else {
				//장바구니
				callRecentCart();
				fn_catalystCart();
				return;
			}
		} else if (result.lecsYn == "Y") {
			alert(result.message);
			return;
		} else {
			//저장중 오류가 발생하였습니다.
			alert("저장중 오류가 발생하였습니다.");
			return;
		}
	}

	//바로구매는 cartSn 조회 callback
	function handleResultCart20(result) {
		if (result.success) {
			//alert('___'+result.sn);
			if (result.sn == "0" || result.sn == null) {
				alert("주문이 실패 하였습니다.");
				return;
			} else {
				fn_catalystDirectBuy(); //카탈리스트 바로구매 2016.08.18
				//바로구매는 로그인 여부 체크
				var totalQty = $("#orderQuantity").val();
				var totalPrice = totalQty * 159000;
				var prodNo = $("#prop20").val();

				var returnUrl = encodeURIComponent("https://secure.nike.co.kr/order/list.lecs?cartSectionCode=20&cartSn="
						+ result.sn);
				if ($("#memberIdForGen").val() == '') { //로그인 하지 않은 상태 // 2016.08.18 변수 추가 
					loginType("S", "member/showLogin.lecs?catalystSalePrice="
							+ totalPrice + "&catalystProductNo=" + prodNo
							+ "&catalystQty=" + totalQty
							+ "&detailDirectOrder=Y&flag=1&returnUrl="
							+ returnUrl);
					return;
				} else {
					document.location.href = 'https://secure.nike.co.kr/order/list.lecs?cartSectionCode=20&cartSn='
							+ result.sn;
					return;
				}
				;
			}//if
		} else if (result.lecsYn == "Y") {
			alert(result.message);
		} else {
			alert("주문이 실패 하였습니다.");
		}
	}

	// 이투데이 공유
	function sendMe2day(goodsName) {
		var url = "http://www.nike.co.kr/goods/showGoodsDetail.lecs?goodsNo=NK31068567";
		window.open('http://me2day.net/posts/new?new_post[body]="'
				+ encodeURIComponent("나이키 에어 줌 보메로 11") + '":' + url, '');
	}

	// 마이라커에 보관하기 클릭
	function insertMyLocker() {

		if ($("#memberIdForGen").val() == '') { //로그인 하지 않은 상태
			alert("로그인 후 진행 가능합니다.");
			openLogin();
			return;
		} else {
			if (!$('#submitForm').find('#itemNo').val()) {
				$("#sizeAlertLine").show();
				$("#sizeAlert").show();
				return;
			}

			//var form = document.getElementById("submitForm");
			//form.action='/goods/createMyLocker.lecs';

			var wishListForm = document.wishListForm;
			wishListForm.action = "http://lecs.nike.co.kr/wishlist/createWish.lecs";
			$("input[name=itemNo]", wishListForm).val(
					$('#submitForm').find('#itemNo').val());
			IframeSubmitter.submit(wishListForm, "insertMyLockerCallback",
					"submitFrame");
		}
	}

	function insertMyLockerCallback(result) {
		if (result.success) {
			$("#myLockerImg").html(
					$("#thumbImgList li").eq(0).find(">a").html().replace(
							'_1_50.', '_110.').replace('/web/no-img/50x50.gif',
							'/web/no-img/110x110.gif'));
			$("#myLockerTitle").html($("#goodsName").val());
			$("#myLockerColor").html($("#colorName").val());
			$("#myLockerSize").html("Size : " + $("#itemSize").val());
			$("#myLockerPrice").find(">strong").html(
					$("#itemPriceArea").html().replace("할인가", "").replace("원",
							""));

			//renderLocker();

			$(".layer-cart").stop(true, false).animate({
				top : "100px"
			}, 1300, function() {
				setTimeout(function() {
					$(".layer-cart").stop(true, false).animate({
						top : "-187px"
					}, 1300);
				}, 3000);
			});

			// [ceres:5064] 나이키 사이트 카탈리스트 추가
			fn_catalystAddLocker();
		} else {
			if (result.message.indexOf("등록된") > -1) {
				alert('선택하신 상품이 위시리스트 내 존재합니다.');
			} else {
				alert(result.message);
			}
			return;
		}
	}

	//Text clear
	function clearText(obj) {
		if (obj.defaultValue == obj.value) {
			obj.value = '';
		}
	}

	function viewSendEmail() {

		if ($("#memberIdForGen").val() == '') { //로그인 하지 않은 상태
			openLogin();
			return;
		} else {
			document.fEmailForm.reset();
			renderPopEmail();
		}
	}

	function sendEmail() {
		//  var fromAddress = $("#fromAddress").val();
		//  var email = $("#email").val();
		//  var emailMessage = $("#emailMessage").val();

		var fromAddress = document.getElementById("fromAddress");
		var email = document.getElementById("email");
		var emailMessage = document.getElementById("emailMessage");

		if (fromAddress.defaultValue == fromAddress.value) {
			alert('보내는 분의 이메일을 입력하세요.');
			return;
		} else if (email.defaultValue == email.value) {
			alert('받는 분의 이메일을 입력하세요.');
			return;
		} else if (emailMessage.defaultValue == emailMessage.value) {
			alert('메시지를 입력하세요.');
			return;
		}

		var msg = emailMessage.value;
		msg = msg.replace(/^\s*/, ''); // 앞 공백제거
		msg = msg.replace(/\s*$/, ''); // 뒤 공백제거

		if (fromAddress.value == "") {
			alert('보내는 분의 이메일을 입력하세요.');
			return;
		} else if (email.value == "") {
			alert('받는 분의 이메일을 입력하세요.');
			return;
		} else if (msg == "") {
			alert('메시지를 입력하세요.');
			return;
		} else {

			if (!checkEmail(fromAddress.value)) {
				alert("이메일 형식이 올바르지 않습니다.");
				$("#fromAddress").val('');
				$("#fromAddress").focus();
				return;
			}

			var emailList = email.value.replace(/ /gi, "").split(",");

			for (var i = 0; i < emailList.length; i++) {
				if (!checkEmail(emailList[i])) {
					alert("이메일 형식이 올바르지 않습니다.");
					$("#email").val('');
					$("#email").focus();
					return;
				}
			}

			var form = document.getElementById("fEmailForm");
			form.action = "/goods/sendGoodsInfoMail.lecs";
			IframeSubmitter.submit(form, "callBackSendGoodsInfoMail",
					"submitFrame");
		}
	}

	//메일 전송 후 callback 함수
	function callBackSendGoodsInfoMail(result) {
		if (result.success) {
			alert("요청하신 메일 주소로 상품정보가 전송되었습니다.");
			$(".email-pop").slideUp(200);
			hideDim();
			document.fEmailForm.reset();
		} else {
			alert(result.message);
			return;
		}
	}

	function checkEmail(emailVal) {

		var isValid = true;

		if (checkNull(emailVal)) {
			return isValid;
		}
		var inxSpace = emailVal.indexOf(" ");
		var comma = emailVal.indexOf(",");
		var dot = emailVal.indexOf(".");
		var inx = emailVal.indexOf("@");
		var mailId = emailVal.substring(0, inx);
		var mailDomain = emailVal.substring(inx + 1, emailVal.length);

		if (inxSpace > -1) {
			isValid = false;
			return isValid;
		}
		if (comma > -1) {
			isValid = false;
			return isValid;
		}
		if (dot < 0) {
			isValid = false;
			return isValid;
		}
		if (inx <= 0 || inx == emailVal.length - 1) {
			isValid = false;
			return isValid;
		}
		if (checkValidStr(mailId,
				'0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_')) {
			isValid = false;
			return isValid;
		}
		if (checkValidStr(mailDomain,
				'0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz._')) {
			isValid = false;
			return isValid;
		}
		return isValid;
	}

	function checkNull(toCheck) {
		var chkStr = toCheck + "";
		var isSpace = true;
		if ((chkStr == "") || (chkStr == null))
			return (true);
		for (var j = 0; isSpace && (j < chkStr.length); j++) {
			if (chkStr.substring(j, j + 1) != " ") {
				isSpace = false;
			}
		}
		return (isSpace);
	}

	function checkValidStr(checkStr, excludeStr) {
		var isValid = false;
		for (var i = 0; i < checkStr.length; i++) {
			ch = checkStr.charAt(i);
			for (var j = 0; j < excludeStr.length; j++) {
				if (ch == excludeStr.charAt(j)) {
					return (isValid);
					break;
				}
			}
		}
		isValid = true;
		return (isValid);
	}

	function goodsDetailPrintPopup(goodsNo) {
		showWindowsPopup(
				"/goods/goodsDetailPrintPopup.lecs?nolayout=yes&goodsNo="
						+ goodsNo, "700px", "600px",
				"scrollbars=yes, toolbar=no, menubar=no, location=no");
	}

	function setZoomAreaPrice(optionValueCode) {

		if (!optionValueCode) {
			return;
		}

		var item = null;
		var goodsPrice = "159000";

		for (var i = 0; i < itemInfo_json.items.item.length; i++) {
			if (itemInfo_json.items.item[i].optionValueCode === optionValueCode) {
				item = itemInfo_json.items.item[i];
				if ("0" != item.opt_dc_prc) {
					goodsPrice = Number(goodsPrice) - Number(item.opt_dc_prc);
				}
				$("#zoomGoodsPrice").html(numberFormat(goodsPrice) + "원");
				break;
			}
		}
	}

	//천단위 콤마 넣는 함수 생성
	function numberFormat(num) {
		num = num.toString();
		return num.replace(/(\d)(?=(?:\d{3})+(?!\d))/g, '$1,');
	}

	//카탈리스트  이벤트(prop - color:컬러, img:상품보기 이미지)
	function fn_catalystEvent(prop, colorOption) {
		$("#prop20").val(colorOption);

		s.linkTrackVars = 'prop28,products';
		if (prop == 'color')
			s.prop28 = 'colorway changed';
		else
			s.prop28 = 'alt image selected';
		s.products = ';' + $("#prop20").val();
		s.tl(true, 'o', 'PDP Interactions');
	}

	//카탈리스트 리뷰 남기기
	function fn_catalystReview() {
		s.linkTrackVars = 'events,products';
		s.linkTrackEvents = 'event14';
		s.events = 'event14';
		s.products = ';' + $("#prop20").val();
		s.tl(true, 'o', 'Product Review Submitted');
	}

	//카탈리스트 바로구매 2016.08.18
	function fn_catalystDirectBuy() {
		try {
			s.linkTrackVars = 'events,products,eVar38';
			s.linkTrackEvents = 'scCheckout,event36,event39';
			s.events = 'scCheckout:' + '86517204b83b43818cbb'
					+ ',event36,event39';
			//로그인 전/후에 따라 분기처리
			if ($("#memberIdForGen").val() == '') {
				s.eVar38 = 'guest';
			} else {
				s.eVar38 = 'registered';
			}
			var totalQty = $("#orderQuantity").val();
			var totalPrice = totalQty * 159000;
			s.products = ';' + $("#prop20").val() + ';;;event36=' + totalQty
					+ '|event39=' + totalPrice;
			s.tl(true, 'o', 'Check out');
		} catch (e) {
		}
	}

	//카탈리스트 장바구니 담기
	function fn_catalystCart() {
		try {
			s.linkTrackVars = 'events,products';
			s.linkTrackEvents = 'scOpen,scAdd,event34,event48';
			s.events = 'scOpen:' + '86517204b83b43818cbb'
					+ ',scAdd,event34,event48';
			var totalQty = $("#orderQuantity").val();
			var totalPrice = totalQty * 159000;
			s.products = ';' + $("#prop20").val() + ';;;event34=' + totalPrice
					+ '|event48=' + totalQty;
			s.tl(true, 'o', 'Add to Cart');
		} catch (e) {
		}
	}

	//카탈리스트..미투데이..이메일...프린트
	function fn_catalystSns(clss) {
		s.linkTrackVars = 'events,eVar61';
		s.linkTrackEvents = 'event43';
		s.events = 'event43';
		if (clss == 'metoday')
			s.eVar61 = 'metoday:share:nike.co.kr';
		else if (clss == 'email')
			s.eVar61 = 'email:share:nike.co.kr';
		else if (clss == 'print')
			s.eVar61 = 'print:share:nike.co.kr';
		s.tl(true, 'o', 'Social Interaction Type');
	}

	//카탈리스트 사이즈 선택기
	function fn_catalystSizeList() {
		$pdp = $(".Pdp");
		//$pdp.find(".size-area").on("click", function(e){
		var size_arr = null;
		var var51 = "";
		for (var i = 0; i < global_item.size.a.length; i++) {
			size_arr = global_item.size.a[i].split("*|*");
			var stockYn = 'n';
			if (size_arr[4] > 0)
				stockYn = 'y';
			var51 += size_arr[0] + ":" + stockYn;
			if (var51.length > 0 && i < global_item.size.a.length - 1)
				var51 += '|';
		}
		s.linkTrackVars = 'prop45,eVar51,products';
		s.prop45 = "size run:" + $("#prop20").val() + ":open";
		s.eVar51 = var51;
		s.products = ';' + $("#prop20").val();
		s.tl(true, 'o', 'Size Run Selections');
		//});
	}

	//카탈리스트2차 마이라커 보관하기
	function fn_catalystAddLocker() {
		try {
			// [ceres:5064] 나이키 사이트 카탈리스트 추가...2013.12.09... 오스카 Start  -->
			s.linkTrackVars = 'events,products';
			s.linkTrackEvents = 'event6,event44,event45';
			s.events = 'event6,event44,event45';
			s.products = ';' + $("#prop20").val() + ';;;event44=' + 159000
					+ '|event45=' + $("#selectQty").val();
			s.tl(true, 'o', 'Add to MyLocker');
			// [ceres:5064] 나이키 사이트 카탈리스트 추가...2013.12.09... 오스카 End  -->
		} catch (Exception) {
		}
	}

	function goMainFromDetail() {
		document.location.href = "/"; // 메인 이동
	}

	var goodsStatus = '10';
	var itemStatus = '10';
	var saleStatusMsg = '';
	var reserveIngStatus = 'N';

	var isGoHome = false;
	var finalAlert = '품절된 상품입니다.';

	//alert(finalAlert+'  goodsStatus :: '+goodsStatus +'  itemStatus :: '+itemStatus+'    saleStatusMsg :: '+saleStatusMsg);

	if (saleStatusMsg != '') {
		if (saleStatusMsg.indexOf('판매되지 않는 상품입니다.') > -1) { // 상품:전시안함, 상품:판매종료, 판매기간전/후

			if ('' == 'N') {
				finalAlert = '판매중인 상품이 아닙니다.'; // 판매기간전/후
			}
			isGoHome = true;
		} else if (saleStatusMsg.indexOf('품절된 상품입니다.') > -1) { // 상품:품절, 예약상품 단품 없는경우(품절,qty=0)
			isGoHome = true;
		} else if (reserveIngStatus != 'A' && goodsStatus == '20'
				|| goodsStatus == '30') { //  품절
			isGoHome = true;
		}

		if (isGoHome && reserveIngStatus != 'A') {
			do_catalyst();
			alert(finalAlert);
			goMainFromDetail();
		}
	} else {
		// 화면에 노출할 컬러가 전혀 없는 경우 처리 (판매종료와 품절만으로 이루어진 경우)

	}

	function do_catalyst() {
		s.manageVars("clearVars");
		var chl = $("#pgNameView").val();
		var sectChl;
		if (chl == null || chl == undefined
				|| (chl.replace(/^\s*|\s*$/g, "")).length == 0)
			return;
		var pgNm = "nikestorekr>" + chl;
		s.currencyCode = "KRW";
		s.linkInternalFilters += ",nike.co.kr";
		s.pageName = pgNm;
		if (chl.indexOf(">") != -1)
			sectChl = chl.substring(0, chl.indexOf('>'));
		else
			sectChl = chl;
		s.channel = sectChl;
		s.prop2 = "nikestorekr";
		s.prop10 = "commerce";
		s.prop12 = $("#sportsPropView").val();
		s.prop14 = "kr";
		s.prop15 = "ko";
		s.prop17 = "nikestorekr:" + $("#pgTypeView").val();
		s.eVar4 = "not logged in";
		//사이트 카탈리스트2차[ceres-5064]...2013.12.09..Cesil
		s.events = "event4,event38";
		s.prop1 = $("#prop1View").val();
		s.prop20 = $("#prop20").val();
		var products = '';
		products += ';' + $("#prop20").val() + ';;;;event38=' + '159000'
				+ '|evar20=out of stock' + '|evar26=' + '4.6' + '|evar32='
				+ $("#evar32View").val();
		products += '|evar27=' + '14' + '|evar69=browse';
		s.products = products;
		void (s.t());
	}

	$(document).ready(function() {
		$('.jqzoom').jqzoom({
			zoomWidth : 384,
			zoomHeight : 620,
			preloadImages : false,
			title : false
		});
	});
</script>

