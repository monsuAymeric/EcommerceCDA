package io.ski.api.business.service.cart;

import io.ski.api.business.convert.CartConvert;
import io.ski.api.business.dto.CartDto;
import io.ski.api.persistance.repository.cart.ICartRepository;

import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements ICartService {
    private ICartRepository cartRepository;

    public CartServiceImpl(final ICartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public void createCart(final CartDto cart) {
        cartRepository.save(CartConvert.getInstance().dtoToEntity(cart));
    }

    @Override
    public CartDto getByUserCart(long id) {
        return CartConvert.getInstance().entityToDto(cartRepository.findByUser(id));
    }

    @Override
    public CartDto modifyCart(CartDto cart) {
        CartDto cartDto = CartConvert.getInstance()
                .entityToDto(cartRepository.save(CartConvert.getInstance().dtoToEntity(cart)));
        if (cartDto != null) {
            return cartDto;
        }
        return null;
    }

    @Override
    public void deleteCart(long id) {
        cartRepository.deleteById(id);
    }
}
