package decorator;
/**
 * @author Dreyson Clark
 *  constructor responsible for adding all of the lines to sections.
 * in each section, it adds a specific set of Strings for the base of the potato head.
 */
public class PotatoeHead extends Character {
   public PotatoeHead() {
    for(int i=0; i<7; i++){
         if(i==0){
             sections.add(" ");
         }  
         if(i==1){
            sections.add("    ____      ");
        }  
        if(i==2){
            sections.add("  /      \\  ");
        }  
        if(i==3){
            sections.add(" |        |  ");
        }  
        if(i==4){
            sections.add(" |        |  ");
        }  
        if(i==5){
            sections.add("  \\      /  ");
        }  
        if(i==6){
            sections.add("   \\____/  ");
        }  
    }
}

}