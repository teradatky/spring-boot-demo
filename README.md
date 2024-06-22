# spring-boot-demo

Spring Bootを勉強するための初めてのリポジトリ

## アプリケーションの始め方

1. VSCode でフォルダを開く
1. 「コンテナーで再度開く」をクリック
1. `DemoApplication.java` を開く
1. 画面右上の ▷ `Run Java` をクリック
1. ブラウザで http://localhost:8080/ へアクセス

## 初期設定メモ

VSCode で Spring Boot の開発を始めるための初期設定手順

1. WSL2, Docker Desktop, VSCodeをインストール
1. VSCode に拡張機能「Spring Initializr Java Support」をインストール
1. Ctrl+Shift+P から `>Spring Initializr: Create a Maven Project` を選択
1. Java のバージョンに留意しながらポチポチ設定しプロジェクト作成
1. Ctrl+Shift+P から `>Dev Containers: Open Folder in Container` を選択
1. 同じ Java バージョンを選びポチポチ設定
1. 拡張機能を追加するため `.devcontainer` を編集
1. Ctrl+Shift+P から `>Dev Containers: Rebuild Container` を選択し開発コンテナーをリビルド
1. Ctrl+Shift+P から `>Java: Open Java Formmatter Settings with Preview` を選択し設定確認
1. フォーマッター等設定をいれるため `settings.json` を編集
1. アプリケーションを実行し、ブラウザから「Whitelabel Error Page」が見れることを確認
