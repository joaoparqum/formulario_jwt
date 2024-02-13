package com.api.formulariocontrol.dto;

import com.api.formulariocontrol.user.UserRole;

public record RegisterDto(String login, String password, UserRole role) {
}
