class Solution {
    public String reformat(String s) {
        

		

		char[] temp = s.toCharArray();

		Queue<Character> dl = new LinkedList<>();
		Queue<Character> dc = new LinkedList<>();

		for (char te : temp)
			if (Character.isDigit(te))
				dl.offer(te);
			else
				dc.offer(te);

		if (Math.abs(dl.size() - dc.size()) > 1)
			return "";

		boolean digitflag = true;

		Queue<Character> front = dl.size() > dc.size() ? dl : dc;
		Queue<Character> last = dl.size() > dc.size() ? dc : dl;

		for (int curIndex = 0; curIndex < temp.length; curIndex++) {
			temp[curIndex] = digitflag ? front.poll() : last.poll();
			digitflag = !digitflag;
		}

		return String.valueOf(temp).toString();
	
	
    }
}