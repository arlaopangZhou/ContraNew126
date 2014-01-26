package com.player.boxplayer.util;

import java.text.DecimalFormat;

import android.util.Log;
//import com.vst.itv52.v1.app.MyApp;

public class StringUtil {

	/**
	 * ͨ����Դ���Ʒ��ض�Ӧ��ͼ����ԴID
	 * 
	 * @param sourceName
	 * @return
	 */
	public static int sourceStringToResourceID(String sourceName) {
/*		if (sourceName.contains("Ѹ������") || sourceName.contains("lixian")) {
			return R.drawable.source_xunleilx_selector;
		} else if (sourceName.contains("�ſ�") || sourceName.contains("youku")) {
			return R.drawable.source_youku_selector;
		} else if (sourceName.contains("����") || sourceName.contains("funshion")) {
			return R.drawable.source_funshion_selector;
		} else if (sourceName.contains("���") || sourceName.contains("ifeng")) {
			return R.drawable.source_ifeng_selector;
		} else if (sourceName.contains("��6") || sourceName.contains("ku6")) {
			return R.drawable.source_ku6_selector;
		} else if (sourceName.contains("����") || sourceName.contains("letv")) {
			return R.drawable.source_letv_selector;
		} else if (sourceName.contains("��Ӱ��")
				|| sourceName.contains("dianying")
				|| sourceName.contains("m1905")) {
			return R.drawable.source_dianying_selector;
		} else if (sourceName.contains("����") || sourceName.contains("163")
				|| sourceName.contains("wangyi")) {
			return R.drawable.source_163_selector;
		} else if (sourceName.contains("PPS") || sourceName.contains("pps")) {
			return R.drawable.source_pps_selector;
		} else if (sourceName.contains("PPTV") || sourceName.contains("pptv")) {
			return R.drawable.source_pptv_selector;
		} else if (sourceName.contains("����") || sourceName.contains("qiyi")) {
			return R.drawable.source_iqiyi_selector;
		} else if (sourceName.contains("����") || sourceName.contains("sina")) {
			return R.drawable.source_sina_selector;
		} else if (sourceName.contains("�Ѻ�") || sourceName.contains("sohu")) {
			return R.drawable.source_sohu_selector;
		} else if (sourceName.contains("56")) {
			return R.drawable.source_56_selector;
		} else if (sourceName.contains("��Ѷ") || sourceName.contains("QQ")
				|| sourceName.contains("qq")) {
			return R.drawable.source_qq_selector;
		} else if (sourceName.contains("����") || sourceName.contains("tudou")) {
			return R.drawable.source_tudou_selector;
		} else if (sourceName.contains("��¿") || sourceName.contains("dianlv")) {
			return R.drawable.source_dianlv_selector;
		} else if (sourceName.contains("TV189") || sourceName.contains("����")
				|| sourceName.contains("tv189")) {
			return R.drawable.source_tv189_selector;
		} else if (sourceName.contains("����") || sourceName.contains("umi")) {
			return R.drawable.source_umi_selector;
		} else if (sourceName.contains("Ѹ��") || sourceName.contains("xunlei")
				|| sourceName.contains("kankan") || sourceName.contains("����")) {
			return R.drawable.source_xunlei_selector;
		} else if (sourceName.contains("����̨")
				|| sourceName.contains("yinyuetai")) {
			return R.drawable.source_yinyuetai_selector;
		} else if (sourceName.contains("CNTV") || sourceName.contains("cntv")) {
			return R.drawable.source_cntv_selector;
		} else {
			return R.drawable.source_other_selector;
		}*/
		return 0;
	}

	public static int getSourceTag(String sourceName) {
/*		if (sourceName.contains("Ѹ������") || sourceName.contains("lixian")) {
			return R.drawable.source_xunleilx_focus;
		} else if (sourceName.contains("�ſ�") || sourceName.contains("youku")) {
			return R.drawable.source_youku_focus;
		} else if (sourceName.contains("����") || sourceName.contains("funshion")) {
			return R.drawable.source_funshion_focus;
		} else if (sourceName.contains("���") || sourceName.contains("ifeng")) {
			return R.drawable.source_ifeng_focus;
		} else if (sourceName.contains("��6") || sourceName.contains("ku6")) {
			return R.drawable.source_ku6_focus;
		} else if (sourceName.contains("����") || sourceName.contains("letv")) {
			return R.drawable.source_letv_focus;
		} else if (sourceName.contains("��Ӱ��")
				|| sourceName.contains("dianying")
				|| sourceName.contains("m1905")) {
			return R.drawable.source_dianying_focus;
		} else if (sourceName.contains("����") || sourceName.contains("163")
				|| sourceName.contains("wangyi")) {
			return R.drawable.source_163_focus;
		} else if (sourceName.contains("PPS") || sourceName.contains("pps")) {
			return R.drawable.source_pps_focus;
		} else if (sourceName.contains("PPTV") || sourceName.contains("pptv")) {
			return R.drawable.source_pptv_focus;
		} else if (sourceName.contains("����") || sourceName.contains("qiyi")) {
			return R.drawable.source_iqiyi_focus;
		} else if (sourceName.contains("����") || sourceName.contains("sina")) {
			return R.drawable.source_sina_focus;
		} else if (sourceName.contains("�Ѻ�") || sourceName.contains("sohu")) {
			return R.drawable.source_sohu_focus;
		} else if (sourceName.contains("56")) {
			return R.drawable.source_56_focus;
		} else if (sourceName.contains("��Ѷ") || sourceName.contains("QQ")
				|| sourceName.contains("qq")) {
			return R.drawable.source_qq_focus;
		} else if (sourceName.contains("����") || sourceName.contains("tudou")) {
			return R.drawable.source_tudou_focus;
		} else if (sourceName.contains("��¿") || sourceName.contains("dianlv")) {
			return R.drawable.source_dianlv_focus;
		} else if (sourceName.contains("TV189") || sourceName.contains("����")
				|| sourceName.contains("tv189")) {
			return R.drawable.source_tv189_focus;
		} else if (sourceName.contains("����") || sourceName.contains("umi")) {
			return R.drawable.source_umi_focus;
		} else if (sourceName.contains("Ѹ��") || sourceName.contains("xunlei")
				|| sourceName.contains("kankan") || sourceName.contains("����")) {
			return R.drawable.source_xunlei_focus;
		} else if (sourceName.contains("����̨")
				|| sourceName.contains("yinyuetai")) {
			return R.drawable.source_yinyuetai_focus;
		} else if (sourceName.contains("CNTV") || sourceName.contains("cntv")) {
			return R.drawable.source_cntv_focus;
		} else {
			return R.drawable.source_other_focus;
		}*/
		return 0;
	}

	public static int getSharpByName(String name) {
/*		if (name.equals("����")) {
			return R.drawable.osd_superhd_selector;
		} else if (name.equals("����")) {
			return R.drawable.osd_biaohd_selector;
		} else if (name.equals("����")) {
			return R.drawable.osd_sd_selector;
		} else if (name.equals("����")) {
			return R.drawable.osd_hd_selector;
		} else if (name.equals("����")) {
			return R.drawable.osd_blue_selector;
		}
		return R.drawable.osd_sd_selector;*/
		return 0;
	}

	public static String stringForTime(long timeMs) {
		long totalSeconds = timeMs / 1000;

		long seconds = totalSeconds % 60;
		long minutes = (totalSeconds / 60) % 60;
		long hours = totalSeconds / 3600;
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}

	public static String longToSec(long timeMS) {
		float seconds = (float) timeMS / 1000.0f;
		return new DecimalFormat("#.#").format(seconds) + "��";
	}

	public static String longTimeToString(long timeMs) {
		long totalSeconds = timeMs / 1000;

		long seconds = totalSeconds % 60;
		long minutes = (totalSeconds / 60) % 60;
		long hours = totalSeconds / 3600;
		String stringTime = null;
		if (hours == 0 && minutes == 0) {
			stringTime = seconds + "��";
		} else if (hours == 0 && minutes != 0) {
			stringTime = minutes + "��" + seconds + "��";
		} else if (hours != 0) {
			stringTime = hours + "Сʱ" + minutes + "��";
		}
		return stringTime;

	}

	public static int[] getWeaResByWeather(String weather) {
		String[] strs = weather.split("ת|��");
		int[] resIds = new int[strs.length];
		for (int i = 0; i < strs.length; i++) {
			resIds[i] = getWeaResByWeather1(strs[i]);
			Log.i("info", "��ֺ��������" + strs[i]);
		}
		if (resIds.length == 3) {
			if (resIds[0] == 0) {
				int[] newResids = new int[2];
				newResids[0] = resIds[1];
				newResids[1] = resIds[2];
				resIds = newResids;
			}
		} else if (resIds.length == 1) {
			int[] newResids = new int[2];
			newResids[0] = resIds[0];
			newResids[1] = 0;
			resIds = newResids;
		}
		return resIds;
	}

	public static int getWeaResByWeather1(String weather) {
/*		if (weather.equals("��")) {
			return R.drawable.ic_weather_cloudy_l;
		} else if (weather.equals("����")) {
			return R.drawable.ic_weather_partly_cloudy_l;
		} else if (weather.equals("��")) {
			return R.drawable.ic_weather_clear_day_l;
		} else if (weather.equals("С��")) {
			return R.drawable.ic_weather_chance_of_rain_l;
		} else if (weather.equals("����")) {
			return R.drawable.ic_weather_rain_xl;
		} else if (weather.equals("����")) {
			return R.drawable.ic_weather_heavy_rain_l;
		} else if (weather.equals("����")) {
			return R.drawable.ic_weather_heavy_rain_l;
		} else if (weather.equals("����")) {
			return R.drawable.ic_weather_heavy_rain_l;
		} else if (weather.equals("�ش���")) {
			return R.drawable.ic_weather_heavy_rain_l;
		} else if (weather.equals("����")) {
			return R.drawable.ic_weather_chance_storm_l;
		} else if (weather.equals("������")) {
			return R.drawable.ic_weather_thunderstorm_l;
		} else if (weather.equals("Сѩ")) {
			return R.drawable.ic_weather_chance_snow_l;
		} else if (weather.equals("��ѩ")) {
			return R.drawable.ic_weather_flurries_l;
		} else if (weather.equals("��ѩ")) {
			return R.drawable.ic_weather_snow_l;
		} else if (weather.equals("��ѩ")) {
			return R.drawable.ic_weather_snow_l;
		} else if (weather.equals("����")) {
			return R.drawable.ic_weather_icy_sleet_l;
		} else if (weather.equals("���ѩ")) {
			return R.drawable.ic_weather_icy_sleet_l;
		} else if (weather.equals("��")) {
			return R.drawable.ic_weather_windy_l;
		} else if (weather.equals("�����")) {
			return R.drawable.ic_weather_windy_l;
		} else if (weather.equals("��")) {
			return R.drawable.ic_weather_fog_l;
		}*/
		return 0;
	}

	/**
	 * ���� url
	 * 
	 * @return
	 */
	public static String getCateUrl() {
		/*String base = MyApp.baseServer;
		if (base != null) {
			System.out.println(base);
			return base;
		}*/
		return null;
	}

	/**
	 * ���� url
	 * 
	 * @param id
	 * @return
	 */
	public static String getDetailUrl(int id) {
		/*String base = MyApp.baseServer;
		if (base != null) {
			System.out.println(base);
			return base + "?data=info&id=" + id;
		}*/
		return null;
	}

	/**
	 * ���� url
	 * 
	 * @param wd
	 * @return
	 */
	public static String getSearchUrl(String wd) {
		/*String base = MyApp.baseServer;
		if (base != null) {
			System.out.println(base);
			return base + "?data=so&wd=" + wd;
		}*/
		return null;
	}

	/**
	 * 
	 * @param wd
	 * @return
	 */
	public static String getTypeUrl(String wd) {
		/*String base = MyApp.baseServer;
		if (base != null) {
			System.out.println(base);
			return base + "?data=so&wd=" + wd;
		}*/
		return null;
	}

	public static String getNewsUrl() {
		/*String base = MyApp.baseServer;
		if (base != null) {
			System.out.println(base);
			return base + "?data=play_newslist";
		}*/
		return null;
	}
	/**
	 * ���ַ���תΪ16����
	 * @param s
	 * @return
	 */
	public static String toHexString(String s) {  
		   String str = "";  
		   for (int i = 0; i < s.length(); i++) {  
		    int ch = (int) s.charAt(i);  
		    String s4 = Integer.toHexString(ch);  
		    str = str + s4;  
		   }  
		   return str;  
		}
}
