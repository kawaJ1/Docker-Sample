package com.example.mydockersample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * {@code MessageService} クラスは、メッセージに関する
 * ビジネスロジックを提供するサービスコンポーネントです。
 * <p>
 * メッセージの取得や加工を担当し、コントローラから呼び出されます。
 * </p>
 *
 * @author kawaJ1
 */
@Service
public class MessageService {

    /** メッセージの永続化操作を担うリポジトリ */
    @Autowired
    private MessageRepository repository;

    /**
     * メッセージテーブルに登録されている最初のメッセージを取得します。
     * メッセージが存在しない場合は {@code "No message"} を返します。
     *
     * @return 最初のメッセージ文字列、もしくは存在しない場合のデフォルト文字列
     */
    public String getFirstMessage() {
        return repository.findAll().stream()
                .findFirst()
                .map(Message::getMessage)
                .orElse("No message");
    }
}
