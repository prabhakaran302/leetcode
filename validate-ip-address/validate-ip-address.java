class Solution {
    public String validIPAddress(String IP) {
		if (IP.indexOf(":") != -1) {
			return checkForIP6(IP);
		} else if (IP.indexOf(".") != -1) {
			return checkForIP4(IP);
		}
		return "Neither";
	}

	private String checkForIP6(String ip) {
        
		String a[] = ip.split(":");
        
        if (ip.startsWith(":") || ip.endsWith(":") || a.length != 8)
			return "Neither";
        
		Set<Character> set = new HashSet<>();
		set.add('A');
		set.add('B');
		set.add('C');
		set.add('D');
		set.add('E');
		set.add('F');
		set.add('a');
		set.add('b');
		set.add('c');
		set.add('d');
		set.add('e');
		set.add('f');
		for (int i = 0; i <= 9; i++)    {
			char c1 = (char)(i+'0'); 
            set.add(c1);
        }
		for (String cur : a) {
           
			if (cur.length() < 1 || cur.length() > 4)
				return "Neither";
            

			if (!checkHexa(cur, set))
				return "Neither";
		}
		return "IPv6";
	}

	private boolean checkHexa(String cur, Set<Character> set) {
		for (char c : cur.toCharArray())
			if (!set.contains(c))
				return false;

		return true;
	}

	private String checkForIP4(String ip) {
        
		String a[] = ip.split("\\.");
        if (ip.startsWith(".") || ip.endsWith(".") || a.length != 4)
			return "Neither";
		for (String cur : a) {
			try {
				if (cur.startsWith("0") && !cur.equals("0"))
					return "Neither";

				int val = Integer.parseInt(cur);
                if(val == 0)
                    continue;
                
				if (val < 1 || val > 255)
					return "Neither";

			} catch (NumberFormatException e) {
				return "Neither";
			}
		}
		return "IPv4";
	}
}