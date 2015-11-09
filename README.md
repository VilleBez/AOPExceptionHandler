# Spring AOP Around Advice 實作 Exception 處理

http://villebez.logdown.com/posts/2015/04/23/spring-aop

緣由：專案內需要將Exception獨立抽出來處理，為了不影響原有的商業邏輯，並且讓code reuse
所以第一時間就想到要用AOP實作，順便回去練一下很久沒碰的Spring AOP，並複習一下觀念

問題：Exception處理

解決方式：Spring AOP Around Advice

好處：
1. 統一錯誤訊息，讓每個工程師各寫各的錯誤處理風格可以得到統一。
2. 讓其他人可以專注在商務邏輯
3. 程式看起來比較簡潔乾淨
