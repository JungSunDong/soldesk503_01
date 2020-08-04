package main.DTO;

import java.util.HashMap;
import java.util.Map;

public class CachedMemberDao {
private static long nextId = 0;
private static Map<String,MemberDTO> map = new HashMap<String,MemberDTO>();
public static long getNextId() {
	return nextId;
}
public static void setNextId(long nextId) {
	CachedMemberDao.nextId = nextId;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
}
public static Map<String, MemberDTO> getMap() {
	return map;
}
public static void setMap(Map<String, MemberDTO> map) {
	CachedMemberDao.map = map;
}


}
