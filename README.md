TDDBC in Sendai 3rdで打ったコード

数学の整数の区間を題材にJavaを使用しＴＤＤでコーディング
ネタ元はこちら
http://devtesting.jp/tddbc/?TDDBC%E4%BB%99%E5%8F%B003%2F%E8%AA%B2%E9%A1%8C



TDDBC for Java with JUnit
====================================

これは、TDDBCのJava向けJUnitプロジェクトです。

## gradleを使う場合

### インストール(wrapperを使わない場合)
```bash
# Mac
brew install gradle
または、
gvm install gradle

# Unix
gvm install gradle
```
gvmについては、以下のURLを参考にしてインストールしてください

http://gvmtool.net/

#### Windows
以下のURLを参考にしてインストールしてください。

http://gradle.monochromeroad.com/docs/userguide/installation.html

### gradle wrapperの準備
```bash
# Mac, Unix
chmod +x gradlew
./gradlew -v

# Windows
gradlew.bat -v
```

wrapperを利用する際は、以下のgradleコマンドを **./gradlew** または **gradlew.bat** に置き換えて利用してください。

### プロジェクトの変換
```bash
# for. IntelliJ IDEA
gradle idea

# for. Eclipse
gradle eclipse
```

### テストの実行
```bash
gradle test
```


## mavenを使う場合
### インストール
```bash
# Mac
brew install maven
```
#### Windows, Unix
以下のURLを参考にしてインストールしてください。

http://maven.apache.org/download.cgi#Installation

### プロジェクトの変換
```bash
# for. IntelliJ IDEA
mvn idea:idea

# for. Eclipse
mvn eclipse:eclipse
```

### テストの実行
```bash
mvn test
```

## その他

動作環境、IDE等については[Wiki](https://github.com/tddbc/java_junit/wiki)を参照してください。

## ライセンス
Apache License, Version 2.0です (詳しくはプロジェクト直下の LICENSE-2.0.txt をご覧ください)
