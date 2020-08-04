package SeleniumMethods;

public class Sel_49_CustomizeXpath {

	public static void main(String[] args) {
		// http://demo.guru99.com/v1/
		
		// Xpath is defined XML path. It is a syntax or language for finding any element on the webpage using XML path expression.
		
		// = Select current node 
		
		//tagname[@attribute='value']
		//span[@class=='ilhan']
	/*
	 *  X path Types :
	 *  1.Absolute Type 
	 *	2.Relative Xpath	  
	 * 
	 * Basic XPath
	 * //input[@name='uid']
	 * //input[@type='text']
	 * //input[@onkeyup='validateuserid();']
	 * 
	 * 
	 * ======contains()====
	 * it is used when the value of any attribute changes dynamically, ==partial text
	 * //input[contains(@type,'reset')]
	 * //input[contains(@type,'sub')]
	 * //*[contains(@id,'message')]
	 * 
	 * =====or AND and=========
	 * 
	 * //*[@type='submit' or @name='btnReset']
	 * //*[@type='submit' or @name='btnLogin']
	 * //*[@type='submit' or @name='btnReset']
	 * //*[@type='submit' and @name='btnReset'] does not WORK
	 * 
	 * ====start-with========
	 * //*[starts-with(@id, 'message')]
	 * 
	 * 
	 * =====text ===========
	 * //*[text()='UserID']
	 * //*[contains(text(), 'UserID')]
	 * 
	 * =====following=======
	 * 
	 * it selects all elements in the document of node 
	 * //*[@type='password']//following::input[1]
	 * //*[@type='password']//following::input[2]
	 * 
	 * 
	 * =====ancestor axes============
	 * The ancestor axis selects all ancestor(grandparent, parent, ...) of the current node.
	 * 
	 * //*[text()='Testing']//ancestor::div
	 * //*[text()='Testing']//ancestor::div[1]
	 * //*[text()='Testing']//ancestor::div[2]
	 * 
	 * 
	 * =======child====================
	 * 
	 * //*[@id='java_technologies']//child::li
	 * //*[@id='java_technologies']//child::li[1]
	 * //*[@id='java_technologies']//child::li[2]
	 * 
	 * ========preceding===================
	 * 
	 * it selects all node that come before the current node
	 * 
	 * //input[@type='submit']//preceding::td
	 * //input[@type='submit']//preceding::input
	 * 
	 * 
	 * =========following-sibling=======
	 * 
	 * //input[@type='submit']//following-sibling::input
	 * //input[@type='submit']//following-sibling::input[1]
	 * 
	 * 
	 * =============parent===========
	 * 
	 * 		 
	 * 
	 * 		  
	 * ==============self==============
	 * 
	 * selects the currnet node or 'self' means it indicates the node itself
	 * //input[@type='password']//self::input
	 * 		 
	 * 
	 * 		 
	 */
	
	}

}
