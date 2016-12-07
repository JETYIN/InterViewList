package Try;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
/**hashmap遍历方法有keyset和entryset（更快）**/
public class bianlihashmap {
	public static void main(String[] args) {
		Map map = new HashMap();

		Iterator iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry enter = (Map.Entry) iter.next();
			Object key = enter.getKey();
			Object val = enter.getValue();
		}
	}
}
