package com.zeta;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SharedData {
	private static final ThreadLocal<Map<String, Object>> threadLocal = ThreadLocal.withInitial(HashMap::new);

	public void clear() {
		threadLocal.remove();
	}

	public void set(String key, Object value) {
		threadLocal.get().put(key, value);
	}

	public Object get(String key) {
		return threadLocal.get().get(key);
	}
	
	public Set<String> getAllData(){
		return threadLocal.get().keySet();
	}
	
	public void remove(String key) {
		threadLocal.get().remove(key);
	}

}
