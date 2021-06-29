# Research_garbled_text_Java
Javaの文字化け調査

## 文字列 -> 16進

``` sh
mvn clean compile exec:java -Dexec.mainClass="sample.charset.EncodeSample" -Dexec.args="'${変換したい文字列}' '${文字コード}'"
```

### 実行例

``` sh
mvn clean compile
mvn exec:java -Dexec.mainClass="sample.charset.EncodeSample" -Dexec.args="'－' 'Shift_JIS'"
mvn exec:java -Dexec.mainClass="sample.charset.EncodeSample" -Dexec.args="'－' 'Cp943C'"
mvn exec:java -Dexec.mainClass="sample.charset.EncodeSample" -Dexec.args="'－' 'UTF-16BE'"
```

## 16進 -> 文字列

``` sh
mvn clean compile exec:java -Dexec.mainClass="sample.charset.DecodeSample" -Dexec.args="'${変換したい値}' '${文字コード}'"
```

### 実行例

``` sh
mvn clean compile
mvn exec:java -Dexec.mainClass="sample.charset.DecodeSample" -Dexec.args="'3f' 'Shift_JIS'"
mvn exec:java -Dexec.mainClass="sample.charset.DecodeSample" -Dexec.args="'817c' 'Cp943C'"
mvn exec:java -Dexec.mainClass="sample.charset.DecodeSample" -Dexec.args="'ff0d' 'UTF-16BE'"

```