module tree {
	exports tree;
	
	requires java.desktop;
	requires javafx.controls;
	requires transitive javafx.graphics;	
	requires static junit;
	requires static org.junit.jupiter.api;
}