# PAYROLL

개발 환경에서 메이븐 빌드 시 아래 코드 입력. 
```cmd
$mvn clean install -P dev
or
$mvn clean package -P dev
```

Spring Boot DevTools  : Java파일이 수정되면 자동으로 반영해줌.

netstat -n : 열려있는 모든 포트 조회
netstat -n | grep 8080

@RestController @Controller 차이
Filter / Interceptor -> DispatcherServlet -> Controller -> Service -> Perspective -> DB
Controller 응답방식 : HTML a -> a.html
RestController 응답방식 : String a -> "a"

해당 ip로 가는 경로 분석
tracert 3.36.36.96

ls 파일 리스트 보기
pwd 유저폴더 /home/ubuntu
whoami 사용자 이름 보기
ls -a 숨김 파일 모두 보기
ls -al 숨김 파일 리스트로 보기
clear 콘솔 지우기
mkdir 폴더 생성
netstat -nlpt : 열린 포트 보기

drwxrwxr-x 2 ubuntu ubuntu 4096 Nov 11 06:39 test
-rw-rw-r-- 1 ubuntu ubuntu    0 Nov 11 06:39 test.txt
앞에 d가 있으면 폴더
