package servlet.study;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

@WebServlet(name = "ServletStart", value = "/main")
public class ServletStudyStart extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 아래의 코드가 전혀 이해가 되지 않는다면 java.io.Stream 부분을 공부하면 좋다.
         * 아래에서는 가장 기본적인 출력방식을 이용해서 출력을 해본다.
         */

        // Response를 통해서 화면을 출력하거나 값을 웹페이지쪽으로 넘겨줄 수 있다.
        OutputStream outPut = resp.getOutputStream();
        // 두번째 매개변수에 true값을 넘겨주면 플러쉬를 자동으로 해준다.
        PrintStream printStream = new PrintStream(outPut, true);
        printStream.println("안녕 서블릿아! 반갑다~!!");

    }

}