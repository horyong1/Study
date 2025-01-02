package fileupload;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;

/**
 * Servlet implementation class FileUtil
 */
@WebServlet("/FileUtil")
public class FileUtil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	public static MultipartRequest uploadFile(HttpServletRequest req, 
			String saveDirectory, int maxPostSize) {
		// TODO Auto-generated method stub
		try {
			
			return new MultipartRequest(req, saveDirectory, maxPostSize, "UTF-8");
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
