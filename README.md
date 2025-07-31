# Spring Boot × MySQL Docker Sample

## 📌 プロジェクト概要

本プロジェクトは、Spring Boot アプリケーションと MySQL データベースを Docker と Docker Compose を使って簡単に立ち上げるサンプルです。  
初心者でもDockerによる開発環境構築が理解できるよう、最小構成で実装しています。

> 🔗 本プロジェクトの詳しい解説は以下の記事をご覧ください  
> 👉 [Docker(Docker Compose)基礎解説（WindowsのWSLを使用した環境構築編）](https://qiita.com/kawaJ1/items/202c59fa2f4c1b9659fe)

---

## 🗂️ プロジェクト構成

```
```bash
Docker-Sample/
├── docker-compose.yml   ← アプリとDBを連携するためのコンテナ定義ファイル
├── app/                 ← コンテナ1：Spring Boot アプリケーション
│   ├── Dockerfile       ← Spring Bootアプリ用のDockerイメージビルド定義
│   └── mydockersample/
│       ├── pom.xml      ← Mavenのプロジェクト設定ファイル（依存管理など）
│       └── src/
│           ├── main/
│           │   ├── java/
│           │   │   └── com/example/demo/
│           │   │       ├── MydockersampleApplication.java ← Spring Bootのエントリーポイント
│           │   │       ├── Message.java                   ← メッセージ用エンティティクラス
│           │   │       ├── MessageRepository.java         ← DBアクセス用のリポジトリ（JPA）
│           │   │       ├── MessageService.java            ← ビジネスロジック
│           │   │       └── MessageController.java         ← HTTPリクエスト処理（REST API）
│           │   └── resources/
│           │       ├── templates/
│           │       │   └── index.html              ← Web画面のテンプレート（Thymeleaf）
│           │       └── application.properties      ← アプリケーション設定（DB接続など）
│           │
│           └── test/ ← 単体テストコード配置用ディレクトリ
│
└── db/ ← コンテナ2：MySQL データベース
    └── init.sql ← 初期データ投入用SQLファイル（自動実行される）
```

---

## 💻 環境要件

- JDK 17 
- Spring Boot 3.5.4 
- Docker Desktop（Windows）  
- WSL2（Windows11環境）  
- Docker Compose v3.8

