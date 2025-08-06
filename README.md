# Spring Boot × MySQL Docker Sample（Dev Container 対応）

## 📌 プロジェクト概要

このリポジトリは、Spring Boot アプリケーションと MySQL データベースを Docker / Dev Container 上で動作させる学習用サンプルです。

特に以下の2構成で比較・体験できるようになっています：

| 構成               | 説明 |
|--------------------|------|
| 🧱 通常の Docker構成   | 本番環境を想定した、Spring Boot の Docker 実行構成 |
| 🛠️ Dev Container構成 | VS Code + Dev Container を使った開発用構成（ホットリロード可） |

> 🔗 詳細なセットアップ手順などは以下の記事をご参照ください：  
> 👉 [Docker Dev Container サンプル（Windows環境）]()

---

## 🗂️ プロジェクト構成

```text
Docker-Sample/
├── .devcontainer/                 # Dev Container 用設定（VS Code用）
│   ├── Dockerfile                 # Java 17 + bash 等の開発環境
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
| Java           | JDK 17                  |
| Spring Boot    | 3.5.4                   |
| Docker         | Docker Desktop（WSL2 推奨） |
| Docker Compose | v3.8 以降                 |
| 開発エディタ         | Visual Studio Code（推奨）  |
| 拡張機能           | Dev Containers          |

---

## 🚀 実行方法

### ✅ 通常の Docker 構成（本番想定）

```bash
# プロジェクトルートで実行
docker-compose up --build
```

* Spring Boot：`app/mydockersample` の Dockerfile でビルド・実行
* MySQL：`db/init.sql` により初期化（DB: `sampledb`, ユーザー: `user/pass`）
* アクセス：

  * アプリケーション → [http://localhost:8081](http://localhost:8081)
  * DB → `localhost:3307`（外部接続可）

---

## 🔄 構成比較：通常 vs Dev Container

| 項目          | 通常構成（app + db）    | Dev Container構成（dev + db）       |
| ----------- | ----------------- | ------------------------------- |
| アプリ実行       | Docker コンテナ上で自動実行 | Dev Container 上で手動実行            |
| ビルド・ホットリロード | 毎回再ビルドが必要         | ホットリロード対応（mvn spring-boot\:run） |
| デバッグ・補完     | 非対応               | VS Code 統合デバッグ / 補完可能           |
| 対象用途        | 本番・検証用            | ローカル開発・学習用                      |

---

## ✅ 補足

* 初回起動時は Maven の依存解決があるため少し時間がかかります。
* `init.sql` により DB は自動初期化されます。
* Dev Container の Java 拡張機能により、コード補完や Spring Boot 補助が効きます。
