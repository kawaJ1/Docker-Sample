package com.example.mydockersample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * アプリケーションのエントリーポイントとなるクラスです。
 * <p>
 * Spring Boot アプリケーションとして起動され、組み込みサーバー（デフォルトではTomcat）が起動します。
 * </p>
 *
 * <p>このアプリケーションは、Spring Boot、MySQL、Docker を用いたサンプルプロジェクトです。</p>
 *
 * @author kawaJ1
 */
@SpringBootApplication
public class MydockersampleApplication {

	/**
	 * アプリケーションのメインメソッドです。
	 * <p>
	 * このメソッドが JVM によって呼び出され、Spring Boot アプリケーションの起動処理が実行されます。
	 * </p>
	 *
	 * @param args コマンドライン引数（未使用）
	 */
	public static void main(String[] args) {
		SpringApplication.run(MydockersampleApplication.class, args);
	}

}
