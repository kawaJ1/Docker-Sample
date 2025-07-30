package com.example.mydockersample;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * {@code MessageRepository} は {@link Message} エンティティに対する
 * データアクセス操作（CRUD）を提供するリポジトリインターフェースです。
 * <p>
 * {@link JpaRepository} を継承することで、以下のような標準的な操作が自動で利用可能になります：
 * </p>
 * <ul>
 *   <li>{@code findAll()} 全件取得</li>
 *   <li>{@code findById(Long id)} IDによる検索</li>
 *   <li>{@code save(Message entity)} 新規保存または更新</li>
 *   <li>{@code deleteById(Long id)} IDによる削除</li>
 * </ul>
 *
 * Spring Data JPA によって実装は自動生成されるため、明示的な実装は不要です。
 *
 * @author kawaJ1
 */
public interface MessageRepository extends JpaRepository<Message, Long> {}
