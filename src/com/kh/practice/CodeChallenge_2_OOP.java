package com.kh.practice;
// ★★★★반드시 @author란에 별명 만들어서 코드 식별하게끔 작성 바랍니다.
/**
 * @author 별명입력해주세요.
 *
 */
public class CodeChallenge_2_OOP {

        public static void main(String[] args) {
                // 1. non public class - User 선언하기
                // User라는 객체 생성하세요. id, pw, name, age를 저장하는 객체 선언하기
                //  -> 객체 선언시 해당 코드 가장 아래에 생성하세요. // 미리 틀 만들었습니다.
                // User user = new User(id,pw,name,age);

                // 제약 1.private로 멤버변수 한정하고, getter, setter 생성하기.
                // 제약 2.생성자는 기본형과 4가지 인자 모두 초기화하는 객체 선언하기
                // 제약 3.toString 사용하기
                // private String id;
                // private String pw;
                // private String name;
                // private int age;

                // public User(){}
                // public User(String id, String pw, String name,int age){
                //      this.id = id;
                //      this.pw = pw;
                //      this.name = name;
                //      this.age = age;
                // }

                // public String getId(){
                //      return id;
                // }
                // public void setId(String id){
                //      this.id = id;
                // }
                // public String getPw(){
                //      return pw;
                // }
                // public void setId(String pw){
                //      this.id = pw;
                // }
                // public String getName(){
                //      return name;
                // }
                // public void setId(String Name){
                //      this.id = name;
                // }
                // public int getAge(){
                //      return age;
                // }
                // public void setAge(String age){
                //      this.age = age;
                // }

                //@Override
                //    public String toString() {
                //        return "User{" +
                //                "id ='" + id + '\'' +
                //                ", pw ='" + pw + '\'' +
                //                ", name ='" + name + '\'' +
                //                ", age =" + age +
                //                '}';
                //    }

                // 2. 객체 생성하고 출력하기
                // 각자 다른 2가지 instance(객체)를 생성해보세요.
                // 기본 생성자 사용과 4가지 인자 초기화 하는 생성자로 생성하세요.
                // 생성한 값을 sysout으로 출력해주세요.

                // 3. 객체 배열 사용하기
                // ID, 이름 모두 다른 사용자를 10명을 생성하여 배열로 저장해주세요.
                // 나이는 2명씩 다르게 생성해주세요. (홍길동1 - 20, 홍길동2 - 20  홍길동3 - 25 ... )
                // 그리고 배열을 순회하여 10명 모두 출력하세요.

                // 4. 객체 배열 순회하기
                // ID/PW를 입력받고, 10개에 데이터 중 존재하는지 ID로 확인하고, 로그인 가능한지 확인해주세요.

                // 5. 객체 배열 변경하기
                // ID와 이름을 입력받고 ID가 존재하면 이름을 변경해 줍니다.

                // 6. 객체 배열 값 삭제하고 가운데 null 없게끔 만들기. -> 어려우면 Skip 가능
                // ID를 입력받고, 배열에서 ID가 탐색되지 않도록 삭제합니다.
                // 단 Null error가 발생하지 않도록 객체를 당겨주시고, 사이즈를 조절하세요.

                // 컬랙션 문제
                // 7. List 계열을 생성하고 앞서 만든 배열로 초기화 해주세요.

                // 8. List에 새로운 아이디 10개를 더 추가하세요. 단 ID는 중복되지 않습니다.

                // 11. 맨 앞에 새로운 ID를 생성해서 넣으세요.

                // 9. 임의의 ID 하나를 탐색하세요.

                // 10. 탐색된 ID를 지우세요.

                // 12. List의 순서를 랜덤으로 섞으세요. Hint : Collections 활용

                // 13. 객체에 Comparable를 구현하여 ID 기준으로 정렬하세요.

                // 14. 객체에 Comparator를 익명 클래스 구현하여 나이-이름 순 정렬하세요.


                // 15. List 새로 다시 생성하고, 기존 리스트 데이터를 2번 반복해서 입력하세요.
                //     (2번씩 입력하여 중복을 만들어주세요!)

                // 16. ID의 중복이 존재하는 List를 Set을 통해 제거하고, 다시 ID 순으로 정렬하세요.

                // 17. List의 빠른 탐색을 위해 Map을 생성하세요. Map에 Key는ID , Value는 User로 선언하세요.

                // 18. Map에 List를 넣어주세요. 단 15번에 생성된 중복된 List를 활용하세요.

                // 19. 임의 ID를 Map으로 탐색하세요. 단 존재하지 않는 경우 '존재하지 않는다'로 프린트해주세요.

                // 20. Map의 Key를 모두 출력하세요.

                // 21. 새로운 객체를 2개 생성하여 Map에 넣어주는데, ID가 중복된 객체, 중복하지 않는 객체를 생성하세요.

                // 22. Map에 새로 생성된 객체를 삭제하세요.


                // File

                // 23. List로 저장된 객체를 다시 배열로 변환하고, Object채 저장하세요.
                //     ※ 주의) 객체에 Serializable을 구현하여 사용하세요.

                // 24. 저장된 객체를 다시 읽어와서 프린트해주세요.

                // 25. 저장된 File을 삭제해주세요.


                // API

                String str = "아이디 : test, 이름 : 홍길동, 나이 : 23, 비밀번호 : 1234 / 아이디 : test2, 이름 : 김길동, 나이 : 32, 비밀번호 : 1234";

                // 26. 앞서 선언된 문자열에 '홍길동'을 찾아주세요.

                // 27. 앞서 선언된 문자열에 '이름'의 인덱스를 모두 출력하세요.

                // 28. 앞서 선언된 문자열에 '홍길동'을 '최길동'으로 바꿔주세요.

                // 29. 앞서 선언된 문자열을 '/' 기준으로 잘라주세요.

                // 30. 앞서 선언된 문자열을 파싱하여 객체로 저장하세요.
                //     ex) User 활용하여 객체 2개로 생성.


                // Date

                // 31. 오늘 날짜를 출력하세요.

                // 32. 오늘 날짜를 '2021년 9월 18일, 오후 5시 10분'으로 출력하세요.

        }
}

// class User{}


