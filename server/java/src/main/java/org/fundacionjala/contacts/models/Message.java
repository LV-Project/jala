package org.fundacionjala.contacts.models;

/**
 * @author Luis Becerra
 */
public class Message { private Long id; private Long userId; private String content; public Message() { } public Message(Long id, Long userId, String content) { this.id = id; this.userId = userId; this.content = content; } public Long getId() { return id; } public void setId(Long id) { this.id = id; } public Long getUserId() { return userId; } public void setUserId(Long userId) { this.userId = userId; } public String getContent() { return content; } public void setContent(String content) { this.content = content; } }
