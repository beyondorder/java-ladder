# 🚀 2단계 - 사다리(생성)

## 기능 요구사항

- 사다리 게임에 참여하는 사람에 이름을 최대5글자까지 부여할 수 있다. 사다리를 출력할 때 사람 이름도 같이 출력한다.
- 사람 이름은 쉼표(,)를 기준으로 구분한다.
- 사람 이름을 5자 기준으로 출력하기 때문에 사다리 폭도 넓어져야 한다.
- 사다리 타기가 정상적으로 동작하려면 라인이 겹치지 않도록 해야 한다.
    - `|-----|-----|` 모양과 같이 가로 라인이 겹치는 경우 어느 방향으로 이동할지 결정할 수 없다.

## 프로그래밍 요구사항

- **자바 8의 스트림과 람다를 적용해 프로그래밍한다.**
- **규칙 6: 모든 엔티티를 작게 유지한다.**

#### 실행 결과

- 위 요구사항에 따라 4명의 사람을 위한 5개 높이 사다리를 만들 경우, 프로그램을 실행한 결과는 다음과 같다.

```plaintext
참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)
pobi,honux,crong,jk

최대 사다리 높이는 몇 개인가요?
5

실행결과

pobi  honux crong   jk
    |-----|     |-----|
    |     |-----|     |
    |-----|     |     |
    |     |-----|     |
    |-----|     |-----|
```

## 기능 목록

* [x] 사다리
    * [x] 이름
        * [x] 이름을 5글자 까지 가질 수 있다
        * [x] 이름을 공백을 가질 수 없다
    * [x] 라인
        * [x] 입력된 숫자 만큼 좌표값 리스트를 가진다
        * [x] 인접한 좌표들중에 생성된 좌표 중 이동 가능한 좌표가 있는지 확인 가능하다
        * [x] 라인을 그릴 수 있다
    * [x] 높이
        * [x] 1 이상의 숫자를 받을 수 있다
