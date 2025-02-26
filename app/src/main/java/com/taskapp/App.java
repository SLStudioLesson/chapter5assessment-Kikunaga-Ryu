package com.taskapp;

import com.taskapp.ui.TaskUI;

public class App {

    public static void main(String[] args) {
        TaskUI ui = new TaskUI();
        ui.displayMenu();
    }
}

/*
 * 設問1
 * ログイン機能
 * メールアドレスとパスワードを入力させる
 * 入力されたものと「users.csv」に入っているデータで合致しているかを確かめる
 * ある場合、メニュー一覧表示
 * ない場合、「AppException」をスローしメッセージを表示、その後再度メールアドレス入力に戻る
 */

 /*
  * 設問2
  * タスク一覧機能
  * ログイン後に表示されるメインメニューから選択できる
  * 「status」に応じて表記を変える(0→未着手、1→着手中、2→完了)
  * タスクを担当するユーザーの名前表記
  * 担当者が今ログインしているなら「あなたが担当しています」と表示
  * そうでなければ担当しているユーザー名を表示
  */