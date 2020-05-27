
# 編譯主程式  ( 需與 pom.xml 同目錄)
 mvn compile

# 打包 , jar 檔會在 target 目錄下 
mvn package

# 執行打包後的 java
java -cp target/NumberGenerator-1.0-SNAPSHOT.jar com.yiibai.App

java -cp  firstMaven-1.0-SNAPSHOT.jar  com.habook.App

