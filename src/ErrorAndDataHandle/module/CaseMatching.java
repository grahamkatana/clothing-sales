
package ErrorAndDataHandle.module;

/**
 *
 * @author katana
 */
public class CaseMatching {
    private String lettersCapital;
    private String lettersLowerCase;
    
    public void setCapitalize(String parameter){
       this.lettersCapital = parameter.substring(0, 11).toUpperCase();
       this.lettersLowerCase=parameter.substring(1).toLowerCase();
    }
    
   public String getSerializedLetters(){
       return lettersCapital+lettersLowerCase;
   } 
}
