package shop.shop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Controller
public class IndexController implements WebMvcConfigurer {

//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    @GetMapping("/test/login")
//    public @ResponseBody String testLogin(Authentication authentication, @AuthenticationPrincipal PrincipalDetails userDetails) {  // DI(의존성 주입)
//        System.out.println("/test/login =============");
//        //Authentication authentication을 통해 session 정보 얻기
//        PrincipalDetails principalDetails = (PrincipalDetails) authentication.getPrincipal();
//        System.out.println("authentication : " + principalDetails.getUser());
//
//        System.out.println("userDetails : ; " + userDetails.getUser()); // @AuthenticationPrincipal 어노테이션을 통해 회원가입 진행하여 가입한 사람들의 session 얻을 수 있음.
//        return "세션 정보 확인하기";
//
//    }
//
//    @GetMapping("/test/oauth/login")
//    public @ResponseBody String testOAuthLogin(Authentication authentication, @AuthenticationPrincipal OAuth2User oauth) {
//        System.out.println("/test/oauth/login =============");
//        //Authentication authentication을 통해 session 정보 얻기
//        OAuth2User oAuth2User = (OAuth2User) authentication.getPrincipal();
//        System.out.println("authentication : " + oAuth2User.getAttributes());
//
//        System.out.println("oauth2User : " + oauth.getAttributes());    //  @AuthenticationPrincipal OAuth2User oauth을 통해 session정보 얻는 방법
//
//         return "OAuth 세션 정보 확인하기";
//    }

    @GetMapping({"", "/"})
    public String index() {
        return "main";
    }

//    // OAuth 로그인을 해도 PrincipalDetails
//    // 일반 로그인을 해도 PrincipalDetails
//    @GetMapping("/user")
//    public @ResponseBody String user(@AuthenticationPrincipal PrincipalDetails principalDetails) {
//        System.out.println("PrincipalDetails :" + principalDetails.getUser());
//        return "user";
//    }
//    @GetMapping("/admin")
//    public @ResponseBody String admin() {
//        return "admin";
//    }
//    @GetMapping("/seller")
//    public @ResponseBody String manager() {
//        return "manager";
//    }
//
//    // securityconfig 생성 후 작동안함
//    @GetMapping("/loginForm")
//    public String loginForm() {
//        return "loginForm";
//    }
//
//    @GetMapping("/joinForm")
//    public String joinForm() {
//        return "joinForm";
//    }
//
//    @PostMapping("/join")
//    public String join(User user) {
//        System.out.println(user);
//        user.setRole("ROLE_SELLER");
//        String rawPassword = user.getPassword();
//        String encPassword = bCryptPasswordEncoder.encode(rawPassword);
//        user.setPassword(encPassword);
//        userRepository.save(user);    //회원가입 잘됨. 비밀번호 1234일시 시큐리티로 로그인 할 수 없음 이유는 암호화가 안되었기 때문
//
//        return "redirect:/loginForm";
//    }
//
//    @Secured("ROLE_ADMIN")      // admin만 가능한 페이지로 만들어줌 권한을 하나만 걸고 싶을때
//    @GetMapping("/info")
//    public @ResponseBody String info() {
//        return "개인정보";
//    }
//
//    @PreAuthorize("hasRole('ROLE_SELLER')or hasRole('ROLE_ADMIN')")   // data 메서드가 실행되기 직전에 실행됨. 권한을 여러개 걸고 싶을때
//    @GetMapping("/data")
//    public @ResponseBody String data() {
//        return "데이터정보";
//    }
}