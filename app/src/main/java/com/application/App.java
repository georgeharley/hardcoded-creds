/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.application;

public class App {

    private static final String MY_SENDER_ID = "sender";
    private static final String MY_SENDER_PASSWORD = "<PASSWORD>";

    private final String _senderId;
    private final String _senderPassword;

    public App() {
        _senderId = MY_SENDER_ID;
        _senderPassword = MY_SENDER_PASSWORD;
    }

    public String getSenderPass() {
        return this._senderPassword;
    }

    public static void main(String[] args) {
        App app = new App();
        Something something = new Something();
        something.setSenderPassword(app.getSenderPass());
        System.out.println("Sender password is " + something.getSenderPassword());
        System.out.println("All done");
    }


    static class Something {
        private String senderPass;
        private String sender;

        public String getSenderPassword() {
            return senderPass;
        }

        public void setSenderPassword(String password) {
            this.senderPass = password;
        }

        public String getSender() {
            return sender;
        }

    }
}
