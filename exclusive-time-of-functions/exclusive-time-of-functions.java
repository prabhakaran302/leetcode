class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        
		int[] res = new int[n];
		ArrayDeque<Log> stack = new ArrayDeque<>();
		for (String log : logs) {
			Log objLog = new Log(log);
			if (objLog.type.equals("start")) {
				stack.push(objLog);
			} else {
				int val = objLog.time - stack.pop().time + 1;
				res[objLog.id] += val;
				if (!stack.isEmpty()) {
					res[stack.peek().id] -= val;
				}
			}
		}
		return res;
	
    }
    
    class Log {
		int id;
		String type;
		int time;

		public Log(String log) {
			String[] la = log.split(":");
			id = Integer.parseInt(la[0]);
			type = la[1];
			time = Integer.parseInt(la[2]);
		}
	}
}