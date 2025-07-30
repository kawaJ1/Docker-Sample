-- 文字コードをutf8mb4に設定（MySQLクライアントと接続の文字コード同期）
SET NAMES utf8mb4;

-- messageテーブルを作成（存在しない場合のみ）
-- 文字コードはutf8mb4、照合順序はutf8mb4_unicode_ciを指定
CREATE TABLE IF NOT EXISTS message (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,  -- 自動採番の主キー
  message VARCHAR(255)                   -- メッセージ内容（最大255文字）
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- 初期データを挿入
INSERT INTO message (message) VALUES ('初期メッセージ');