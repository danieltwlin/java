
# 編譯主程式  ( 需與 pom.xml 同目錄)
 mvn compile

# 打包 , jar 檔會在 target 目錄下 
mvn package

# 執行打包後的 java         
# com.habook.App , 是 package Name，加上 Class Name

java -cp target/NumberGenerator-1.0-SNAPSHOT.jar com.yiibai.App

java -cp  firstMaven-1.0-SNAPSHOT.jar  com.habook.App




