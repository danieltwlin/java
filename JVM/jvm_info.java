public class jvm_info {
public static void main(String[] args) {
	System.out.println("JVM Info");
	System.out.println("HEAP Xmx:" + Runtime.getRuntime().maxMemory()); 
	System.out.println("HEAP Free:" + Runtime.getRuntime().freeMemory()); 
	System.out.println("HEAP Total:" + Runtime.getRuntime().totalMemory()); 
}
}



# 編譯和執行
# javac jvm_info.java
# java jvm_info
