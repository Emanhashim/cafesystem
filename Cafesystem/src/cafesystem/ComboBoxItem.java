/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafesystem;

/**
 *
 * @author Nathan
 */
public class ComboBoxItem {

    private final int codeValue;
    private final String displayText;

    public ComboBoxItem(int code, String text) {
        this.codeValue = code;
        this.displayText = text;

    }

    /**
     * @return the codeValue
     */
    public int getCodeValue() {
        return codeValue;
    }

    /**
     * @return the displayText
     */
    public String getDisplayText() {
        return displayText;
    }
    @Override
    public String toString(){
        return this.displayText;
    }
}
