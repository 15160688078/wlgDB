//package com.jeeplus.modules.api.utils;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
///**
// * 基本信息配置
// * @author huangh
// *
// */
//public class AlipayConfig {
//
//	//沙箱APPID
//	public static final  String app_id = "2016032401237683";
//	//沙箱私钥
//	public static final  String merchant_private_key = "MIIEwAIBADANBgkqhkiG9w0BAQEFAASCBKowggSmAgEAAoIBAQDZQR5BM5nCwGB5"
//			+ "4p/QBGdnLJg2QMChmw3/gACef9L4b0Yeyu2szPE86d9jssai41TRifBYV/QXwz6T"
//			+ "c00y/DY2uy0lELKjvpBdzxg0S9UWOj47rr0Pv88WSLMoTnwcCQ/mvnw6cNt3Unza"
//			+ "J88m5W854Wp/ydaAKZijHjYJddAjawrJxFdaH+exFJx7mgoPejbnoXQY3vF9MgZL"
//			+ "NtlUIRaU5zZ9wRGZUCSrI+Xt5ANvcuOlBxw4E8O2U+OrOMiI9AYkgeLHlbn8Itbe"
//			+ "oJu9dLcKGOv1eWn/jUgiykJERHCyGG+S+QdIMdkn5qfXsVWdMV9CEVdJOrm4UeoI"
//			+ "SMqmhCarAgMBAAECggEBAKMLW8lTEHI4Li9LBOT4aSHlNdaBgg/Gbhrx1YUeKRaJ"
//			+ "a/ZwFS86H1G3sw7/fFOCiIU5IEcsuuOag7vlLGq3HXi1wIuwnGCHA5FjeqbEwoaL"
//			+ "72ibGwhWyvPOW6ZEQKBJrMVe75xsVkiWf1y5w51NUsv9gA+nSnOkxAinA6bV4/6v"
//			+ "U5+NwSgNSw3uhn/l+ObN6v6RJ5P2WH5tjcPsCKNsfRf6ztRkW2UiGVtQTBj1tDEk"
//			+ "n1v5lZeRAyYXqcsind1BwJA9FV+h2IRGvdprrDrZpn9chizBL/cr6kXHta9vJplJ"
//			+ "3gmlCqs6zygmskamoJBGLUN6PV/215ddtd9Pi2qXBgECgYEA/+yUuGDVI2HFT3PX"
//			+ "KZuSTaRlxXAAbE/qtogfwsg0PC11Vla35qG+zD1UHTHBPh1ehvAdTfNZp72yfhlS"
//			+ "JvkBRGj8p1DaSFYMWxUSRimC7ov/WvXKNLeKwBKwYd8vJzyyeqjsNynq1CxqXyEw"
//			+ "AveuAzQfLZygOQvp+Wo4wi6kfZkCgYEA2VGaYZEeMkNZ2rJAf8hQwA7JjtIFGM5P"
//			+ "E4sorYjRM6fx7GYPv3zTz11wTsQfCb2MCBeNcOgWE7CJqa18J08ou6SMMtHioEDT"
//			+ "BDFFricmvd6Fd6I0+LGhFmDJyR9vx6px09WMH9Ch/U4ms72JnPqW3BZmv8X7USFi"
//			+ "tSvxKfocCOMCgYEAz2tzbawtkqufOzHr5PENtpfTVB3eeeqblKzm8PtKOqutOfi2"
//			+ "u9nDxcy+65pzwGAVSNA7L/5XX7hDfigPiT6vZD6i5wiEobP796YwVWU3lRcqMxKa"
//			+ "e/d2IQ4Eno5ArVBoZzmZmWwDw0rsO4WuX/lVs4r+6fzTbujVDSymK9uZvaECgYEA"
//			+ "v8CsSvjEPy+Egl8UYGv9LGof2SBhlPC9f44jl3OIvF6tLZ0kuh7HukpFRYrxpCOX"
//			+ "ArDdgcmXaUo1Pf2w9fJ4C5H2jwT5RdPNHf7n7/Hl0lUdSWFcAjCh5eADTK6rb+9q"
//			+ "PrNHz+7EcIDbz28nlNbb9Fjj0sU7quudcCTUx+hDgmcCgYEA70PQHO/Y+MsX+RSV"
//			+ "CRt1o1AcyV4E+20VshP5+R3nFROnDCgvCYPqK0avMdYdEYgpNB4yE/AuqMWlEDik"
//			+ "6detK8DlDeu+MUghXcwN8KVMkOsgdV3xste3Z5lN64L1lbFEiMJ61oRFEz6pW9Rn"
//			+ "2FynccsZqEEaogrCocja5MNIxwQ=";
//
//	//VO9vg904KJx1wGYIFjcV4A==
//	//支付宝公钥
//	public static final  String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAksV1BYMEgR3bp2CusDZT4ATT8jW99ZErwqcHjAr99LaTlehJl2ckXlryalevVzSzuNnnR2/tWS2TjuZRKL6i5gR91SVXcvNH3IMrlMMLgFujUapBlUTOrk+QoscwezBasln2mFKelz/2HkMs1A9Is1gW2hFk5m68IYbpB6DeL2C5y7NxTyTjK6bYOSZ+k3sa9uKOOeB1sNiQtswtIQ8mBz6jVfWf1WyQfa2dq9gKXYsgIym2VbRQte6u+fmwKm34zEv7k8h2UDmahFYKarl0htuhJ66LLzzUuW+WX7MVfqMgWgdQPnXXrSlDoLUb2MmOZIC+My8DCPr7Vhcv0P6NGQIDAQAB";
//	//沙箱网关地址
//	public static final  String gatewayUrl = "https://openapi.alipay.com/gateway.do";
//
//   // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
//	public static String notify_url = "http://www.longyan.cn/wap_elongyan/info/index.jsp";
//
//	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
//	public static String return_url = "http://www.longyan.cn/elyManage/api/zhimaxinyongReturnUrl";
//
//	// 签名方式
//	public static String sign_type = "RSA2";
//
//	// 字符编码格式
//	public static String charset = "UTF-8";
//
//	//  format
//	public static String format = "json";
//
//	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
//	public static String transactionId = "ZHHX" + sdf.format(new Date())+Math.round(Math.random()*8999+1000000);
//
//	public static String productCode = "w1010100000000002978";
//	public static String bizCode = "SMART_FACE";
//	public static String linkedMerchantId = "2088721630869411";
//
//}
//
