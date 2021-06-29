# Research_garbled_text_Java
Javaの文字化け調査

## 実行

``` sh
mvn clean compile exec:java ${変換したい文字列} ${文字コード}
```

### ex

``` sh
mvn clean compile
mvn exec:java -Dexec.mainClass="sample.charsetApp" -Dexec.args="'－' 'Unicode'"
mvn exec:java -Dexec.mainClass="sample.charsetApp" -Dexec.args="'－' 'UTF-16BE'"
mvn exec:java -Dexec.mainClass="sample.charsetApp" -Dexec.args="'－' 'UTF-16'"

mvn exec:java -Dexec.mainClass="sample.charsetApp" -Dexec.args="'－' 'Shift_JIS'"
mvn exec:java -Dexec.mainClass="sample.charsetApp" -Dexec.args="'－' 'Cp943C'"
mvn exec:java -Dexec.mainClass="sample.charsetApp" -Dexec.args="'－' 'x-IBM943'"

```