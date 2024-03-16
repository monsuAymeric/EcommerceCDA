package io.ski.api.business.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.ski.api.business.convert.UserConvert;
import io.ski.api.business.dto.CartDto;
import io.ski.api.business.dto.UserDto;
import io.ski.api.business.service.cart.ICartService;
import io.ski.api.persistance.repository.user.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {
    private IUserRepository userRepository;
    private ICartService cartService;

    public UserServiceImpl(final IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setCartService(final ICartService cartService) {
        this.cartService = cartService;
    }

    @Override
    public void createUser(final UserDto user) {
        CartDto cartDto = new CartDto();
        cartDto.setUser(user);
        cartService.createCart(cartDto);
    }

    @Override
    public List<UserDto> getAllUsers() {
        return UserConvert.getInstance().entityListToDtoList(userRepository.findAll());
    }

    @Override
    public UserDto getUserById(final Long id) {
        return UserConvert.getInstance().entityToDto(userRepository.findById(id).orElse(null));
    }

    @Override
    public List<UserDto> getUserByUsername(final String username) {
        return UserConvert.getInstance().entityListToDtoList(userRepository.findByUsername(username));
    }

    @Override
    public void modifyUser(final UserDto user) {
        userRepository.save(UserConvert.getInstance().dtoToEntity(user));
    }

    @Override
    public void deleteUser(final Long id) {
        CartDto cartDto = cartService.getByUserCart(id);
        cartService.deleteCart(cartDto.getId());
    }
}
