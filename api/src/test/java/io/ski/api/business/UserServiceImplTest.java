package io.ski.api.business;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import io.ski.api.business.convert.UserConvert;
import io.ski.api.business.dto.UserDto;
import io.ski.api.business.service.user.UserServiceImpl;
import io.ski.api.persistance.entity.User;
import io.ski.api.persistance.repository.user.IUserRepository;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private IUserRepository userRepository;

    private static UserConvert userConvert;
    private static UserDto userDto;
    private static User userEntity;

    @BeforeAll
    static void setUp() {
        userConvert = UserConvert.getInstance();
        userDto = new UserDto();
        userEntity = userConvert.dtoToEntity(userDto);
    }

    @BeforeEach
    void openMock() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Create User")
    void createUser() {
        doReturn(userEntity).when(userRepository).save(any(User.class));
        userService.createUser(new UserDto());
        verify(userRepository, times(1)).save(any(User.class));
    }

    @Test
    @DisplayName("Create User With Exception")
    void createUserWithException() {
        try {
            doThrow(new Exception()).when(userRepository).save(any(User.class));
            userService.createUser(new UserDto());
        } catch (Exception e) {
            assertThrows(Exception.class, () -> userService.createUser(new UserDto()));
        }
    }

    @Test
    @DisplayName("Get All Users")
    void getAllUsers() {
        doReturn(userEntity).when(userRepository).findAll();
        userService.getAllUsers();
        verify(userRepository, times(1)).findAll();
    }

    @Test
    @DisplayName("Get All Users With Exception")
    void getAllUsersWithException() {
        try {
            doThrow(new Exception()).when(userRepository).findAll();
            userService.getAllUsers();
        } catch (Exception e) {
            assertThrows(Exception.class, () -> userService.getAllUsers());
        }
    }

    @Test
    @DisplayName("Get User By Id")
    void getUserById() {
        doReturn(userEntity).when(userRepository).findById(any(Long.class));
        userService.getUserById(any(Long.class));
        verify(userRepository, times(1)).findById(any(Long.class));
    }

    @Test
    @DisplayName("Get User By Id With Exception")
    void getUserByIdWithException() {
        try {
            doThrow(new Exception()).when(userRepository).findById(any(Long.class));
            userService.getUserById(any(Long.class));
        } catch (Exception e) {
            assertThrows(Exception.class, () -> userService.getUserById(any(Long.class)));
        }
    }

    @Test
    @DisplayName("Get User By Username")
    void getUserByUsername() {
        doReturn(userEntity).when(userRepository).findByUsername(any(String.class));
        userService.getUserByUsername(any(String.class));
        verify(userRepository, times(1)).findByUsername(any(String.class));
    }

    @Test
    @DisplayName("Get User By Username With Exception")
    void getUserByUsernameWithException() {
        try {
            doThrow(new Exception()).when(userRepository).findByUsername(any(String.class));
            userService.getUserByUsername(any(String.class));
        } catch (Exception e) {
            assertThrows(Exception.class, () -> userService.getUserByUsername(any(String.class)));
        }
    }

    @Test
    @DisplayName("Modify User")
    void modifyUser() {
        doReturn(userEntity).when(userRepository).save(any(User.class));
        userService.modifyUser(userDto);
        verify(userRepository, times(1)).save(any(User.class));
    }

    @Test
    @DisplayName("Modify User With Exception")
    void modifyUserWithException() {
        try {
            doThrow(new Exception()).when(userRepository).save(any(User.class));
            userService.modifyUser(userDto);
        } catch (Exception e) {
            assertThrows(Exception.class, () -> userService.modifyUser(userDto));
        }
    }

    @Test
    @DisplayName("Delete User")
    void deleteUser() {
        doReturn(userEntity).when(userRepository).deleteById(any(Long.class));
        userService.deleteUser(any(Long.class));
        verify(userRepository, times(1)).deleteById(any(Long.class));
    }

    @Test
    @DisplayName("Delete User With Exception")
    void deleteUserWithException() {
        try {
            doThrow(new Exception()).when(userRepository).deleteById(any(Long.class));
            userService.deleteUser(any(Long.class));
        } catch (Exception e) {
            assertThrows(Exception.class, () -> userService.deleteUser(any(Long.class)));
        }
    }
}