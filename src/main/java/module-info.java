/**
 * 
 */
/**
 * @author nikes
 *
 */
module sxmerger {
	exports com.nikesh.sxmerger;

	requires javafx.base;
	requires javafx.controls;
	requires transitive javafx.graphics;
	
	opens com.nikesh.sxmerger to javafx.fxml;
}