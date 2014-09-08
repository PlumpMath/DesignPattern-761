/**
 * 
 */
package com.designPattern.Bridge;

/**
 * @author zibin
 *
 */
public abstract class Girl {

	/**
	 * 
	 */
	
	private SweetWord sweetWord;
	public Girl(SweetWord sweetWord) {
		this.setSweetWord(sweetWord);
	}
	
	public abstract void sayHi();

	public SweetWord getSweetWord() {
		return sweetWord;
	}

	public void setSweetWord(SweetWord sweetWord) {
		this.sweetWord = sweetWord;
	}
}
