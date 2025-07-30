package com.example.mydockersample;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * {@code Message} は、メッセージを保持するエンティティクラスです。
 * <p>
 * データベース上では {@code message} テーブルにマッピングされ、
 * メッセージ本文および自動生成されるIDを保持します。
 * </p>
 *
 * @author kawaJ1
 */
@Entity
public class Message {

    /**
     * メッセージの一意な識別子（主キー）。
     * 自動でインクリメントされます。
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * メッセージの本文。
     */
    private String message;

    /**
     * メッセージのIDを取得します。
     *
     * @return メッセージID
     */
    public Long getId() {
        return id;
    }

    /**
     * メッセージのIDを設定します。
     *
     * @param id メッセージID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * メッセージ本文を取得します。
     *
     * @return メッセージの内容
     */
    public String getMessage() {
        return message;
    }

    /**
     * メッセージ本文を設定します。
     *
     * @param message メッセージの内容
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
