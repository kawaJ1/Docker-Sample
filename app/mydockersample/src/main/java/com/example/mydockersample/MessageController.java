package com.example.mydockersample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * {@code MessageController} は、メッセージの表示に関する
 * Webリクエストを処理する Spring MVC コントローラクラスです。
 * <p>
 * 主にルートパス（"/"）と "/show" パスに対するリクエストを受け取り、
 * サービスクラスを通じてデータを取得し、ビューへ渡します。
 * </p>
 *
 * <p>このコントローラでは、以下の2つのリクエストマッピングを扱います：</p>
 * <ul>
 *   <li>{@code GET /}：初期画面を表示（空のメッセージ）</li>
 *   <li>{@code POST /show}：最初のメッセージを取得して表示</li>
 * </ul>
 *
 * @author kawaJ1
 */
@Controller
public class MessageController {

    /** メッセージ取得処理を担うサービスクラス */
    @Autowired
    private MessageService service;

    /**
     * ルート（"/"）への GET リクエストに対応するメソッドです。
     * 空のメッセージをモデルに追加し、初期表示用のビュー（index.html）を返します。
     *
     * @param model Thymeleaf などのテンプレートエンジンに渡すモデル情報
     * @return 表示するビュー名（"index"）
     */
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", null);
        return "index";
    }

    /**
     * "/show" への POST リクエストに対応するメソッドです。
     * {@link MessageService#getFirstMessage()} によって取得したメッセージを
     * モデルに追加し、ビューを再表示します。
     *
     * @param model モデルにメッセージを追加
     * @return 表示するビュー名（"index"）
     */
    @PostMapping("/show")
    public String showMessage(Model model) {
        model.addAttribute("message", service.getFirstMessage());
        return "index";
    }
}
