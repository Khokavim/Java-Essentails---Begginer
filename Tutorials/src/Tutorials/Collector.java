/**
 * 
 */
package Tutorials;

/**
 * @author mishael
 *
 */
public class Collector {

	String owner;
	String item;
    String color;
	
	Collector(String _owner,String _item,String _color){
		owner=_owner;
		item=_item;
		color=_color;
	}
	
	public void setItemColor(String _color) {
		color=_color;
	}
	
	public void setItem(String _item){
		item=_item;
	}
	
}
