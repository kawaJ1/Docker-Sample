# Spring Boot × MySQL Docker Sample（Dev Container 対応）

## 📌 プロジェクト概要

このリポジトリは、Spring Boot アプリケーションと MySQL データベースを Docker / Dev Container 上で動作させる学習用サンプルです。

> 🔗 詳細なセットアップ手順などは以下の記事をご参照ください：  
> 👉 [Docker Dev Container サンプル（Windows環境）](https://qiita.com/kawaJ1/items/2a2cb6355ef9d2552f98)

---

## 🗂️ プロジェクト構成

```text
Docker-Sample/
├── .devcontainer/                 # Dev Container 用設定（VS Code用）
│   ├── Dockerfile                 # Java 17のimage定義
│   ├── devcontainer.json          # DevContainer設定（マウント、拡張機能など）
│   └── docker-compose.yml         # Dev Container 用の Compose（dev + db）
│
├── docker-compose.yml            # 本番（通常）用 Docker Compose（app + db）
│
├── app/
│   └── mydockersample/           # Spring Boot アプリケーション
│       ├── Dockerfile            # 本番用ビルド用 Dockerfile
│       ├── pom.xml               # Maven 設定
│       └── src/
│           ├── main/
│           │   ├── java/com/example/demo/
│           │   │   ├── MydockersampleApplication.java  # エントリポイント
│           │   │   ├── Message.java                    # エンティティ
│           │   │   ├── MessageRepository.java          # リポジトリ
│           │   │   ├── MessageService.java             # サービス層
│           │   │   └── MessageController.java          # REST API
│           │   └── resources/
│           │       ├── templates/index.html            # HTMLテンプレート
│           │       └── application.properties          # DB設定など
│           └── test/                                   # テストコード
│
└── db/
    └── init.sql                  # MySQL 初期データ投入用 SQL（自動実行）
````

---

## 💻 動作環境

| 項目             | バージョン・備考                |
| -------------- | ----------------------- |
| Java           | JDK 17（Dev Containerで定義）|
| Spring Boot    | 3.5.4（Dev Containerで定義） |
| Docker         | Docker Desktop（WSL2 推奨） |
| Docker Compose | v3.8 以降（Dev Containerで定義）|
| 開発エディタ         | Visual Studio Code（推奨）  |
