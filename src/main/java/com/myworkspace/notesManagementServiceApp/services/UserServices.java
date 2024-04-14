package com.myworkspace.notesManagementServiceApp.services;

import com.myworkspace.notesManagementServiceApp.data.model.User;
import com.myworkspace.notesManagementServiceApp.dtos.requests.*;
import com.myworkspace.notesManagementServiceApp.dtos.responses.*;

import java.util.List;

public interface UserServices {
    long getNumberOfUsers();

    RegistrationResponse register(RegisterUserRequest registerRequest);

     LoginResponse login(LoginUserRequest loginRequest);

    LogoutResponse logout(LogoutUserRequest logoutRequest);

    List<User> findAll();

    User findUserByUsername(String username);

    CreateNoteResponse createNote(CreateNoteRequest createNoteRequest);

    UpdateNoteResponse updateNote(UpdateNoteRequest updateNoteRequest);

    DeleteNoteResponse deleteNote(DeleteNoteRequest deleteNoteRequest);
}
