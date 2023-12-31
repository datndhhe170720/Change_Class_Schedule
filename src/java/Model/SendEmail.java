package model;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmail {
    public void SendMailReset(String email) {// forgetPassword
        String emailContent = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "\n"
                + "<head>\n"
                + "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n"
                + "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "  <title>Reset your password</title>\n"
                + "  <!--[if mso]><style type=\"text/css\">body, table, td, a { font-family: Arial, Helvetica, sans-serif !important; }</style><![endif]-->\n"
                + "</head>\n"
                + "\n"
                + "<body style=\"font-family: Helvetica, Arial, sans-serif; margin: 0px; padding: 0px; background-color: #ffffff;\">\n"
                + "  <table role=\"presentation\"\n"
                + "    style=\"width: 100%; border-collapse: collapse; border: 0px; border-spacing: 0px; font-family: Arial, Helvetica, sans-serif; background-color: rgb(239, 239, 239);\">\n"
                + "    <tbody>\n"
                + "      <tr>\n"
                + "        <td align=\"center\" style=\"padding: 1rem 2rem; vertical-align: top; width: 100%;\">\n"
                + "          <table role=\"presentation\" style=\"max-width: 600px; border-collapse: collapse; border: 0px; border-spacing: 0px; text-align: left;\">\n"
                + "            <tbody>\n"
                + "              <tr>\n"
                + "                <td style=\"padding: 40px 0px 0px;\">\n"
                + "                  <div style=\"text-align: left;\">\n"
                + "                    <div style=\"padding-bottom: 20px;\"><img src=\"https://i.ibb.co/Qbnj4mz/logo.png\" alt=\"Company\" style=\"width: 56px;\"></div>\n"
                + "                  </div>\n"
                + "                  <div style=\"padding: 20px; background-color: rgb(255, 255, 255);\">\n"
                + "                    <div style=\"color: rgb(0, 0, 0); text-align: left;\">\n"
                + "                      <h1 style=\"margin: 1rem 0\">Đăng nhập không thành công</h1>\n"
                + "                      <p style=\"padding-bottom: 16px\">Chúng tôi đã nhận được yêu cầu đặt lại mật khẩu cho tài khoản người dùng này.</p>\n"
                + "                      <p style=\"padding-bottom: 16px\"><a href='http://localhost:8080/forgotPassword?email=" + email + "' target=\"_blank\"\n"
                + "                          style=\"padding: 12px 24px; border-radius: 4px; color: #FFF; background: #2B52F5;display: inline-block;margin: 0.5rem 0;text-decoration: none;\">Đặt lại mật khẩu</a></p>\n"
                + "                      <p style=\"padding-bottom: 16px\">Nếu không yêu cầu đặt lại mật khẩu, bạn có thể bỏ qua email này.</p>\n"
                + "                    </div>\n"
                + "                  </div>                \n"
                + "                </td>\n"
                + "              </tr>\n"
                + "            </tbody>\n"
                + "          </table>\n"
                + "        </td>\n"
                + "      </tr>\n"
                + "    </tbody>\n"
                + "  </table>\n"
                + "</body>\n"
                + "\n"
                + "</html>";
        if (email != null || !email.equals("")) {
            // sending otp
//            Random rand = new Random();
//            otpvalue = rand.nextInt(1255650);

            String to = email;// change accordingly
            // Get the session object
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");
            Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("hoangdatnguyen2003@gmail.com", "mqfekpjvveyolmlo");// Put your email
                    // id and
                    // password here
                }
            });
            // compose message
            try {
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(email));// change accordingly
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                message.setSubject("Yêu cầu cấp lại mật khẩu","UTF-8");
//				message.setText("your OTP is: " + otpvalue+"<a href='http://localhost:9999/LoginAndRegisterForm/forgotPasswordX.jsp?name="+email+"'> click me</a>");
//                                message.setText("your OTP is: " + otpvalue);
                message.setContent(emailContent, "text/html;charset=UTF-8");
                // send message
                Transport.send(message);
                System.out.println("Message sent successfully");
            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        SendEmail sendMail = new SendEmail();
        sendMail.SendMailReset("datndhhe170720@fpt.edu.vn");
    }
}
