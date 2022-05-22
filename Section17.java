package exercise;

public class Section17 {

	public static void main(String args[]) {
		/* json format(JAVASCRIPT OBJECT NOTATION) 資料交換格式
		 * 使用於javascript物件的一種標示
		 * []表示陣列
		 * {}表示物件(透過,往下增加), 透過key:value的形式呈現
		 */
		String json = "[{\"animal_id\":\"10305240201056\",\"animal_kind\":\"貓\",\"animal_sex\":\"F\",\"shelter_name\":\"臺北市動物之家\"},"
				+ "{\"animal_id\":\"10508011005002\",\"animal_kind\":\"狗\",\"animal_sex\":\"M\",\"shelter_name\":\"臺中市中途動物醫院\"}]";

		String jsonr = json.replace("[", "").replace("]", "");
		String[] jsona = jsonr.split("},");

		String jsonar1 = jsona[0].replace("{", "").replace("}", "");
		String[] cat = new String[4];
		cat = jsonar1.split(",");

		String jsonar2 = jsona[1].replace("{", "").replace("}", "");
		String[] dog = new String[4];
		dog = jsonar2.split(",");
		
		System.out.println(dog[0]);
	}

}