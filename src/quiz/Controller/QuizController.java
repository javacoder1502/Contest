package quiz.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import quiz.service.PlayQuizImp;

@Controller
public class QuizController {

	@RequestMapping(value = "/cat")
	public ModelAndView cat() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("cat");
		return modelAndView;
	}

	@RequestMapping(value = "/question" , method=RequestMethod.GET)
	public ModelAndView question(
			@RequestParam(value = "cat", required = false) String cat,@RequestParam("msisdn") String msisdn,
			@RequestParam(value="question_id", required=false) String question_id,
			@RequestParam(value="user_answer",required=false) String users_answer) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("value of cat is  " + cat);
		System.out.println("value of msisdn is  " + msisdn);
		System.out.println("answer of msisdn is  " + users_answer);
		System.out.println("question_id of msisdn is  " + question_id);
		
		
		PlayQuizImp playQuizImp =  new PlayQuizImp();
		
		
		
		modelAndView.addObject("Quiz", playQuizImp.getQuestionAndOption(msisdn, cat, question_id));
		modelAndView.setViewName("question");
		return modelAndView;
	}
}
