package SpringSecurity.service;

import SpringSecurity.dto.UserDTO;
import SpringSecurity.entity.UserEntity;
import SpringSecurity.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserDetailServiceImpl userDetailService;

    ModelMapper modelMapper = new ModelMapper();

    public boolean addUser(UserDTO userDTO) {
        UserEntity user = modelMapper.map(userDTO, UserEntity.class);
        user = this.userRepository.save(user);

        return user.getId() != null;
    }

    public boolean login(UserDTO userDTO) {
        UserEntity userEntity = userRepository.findUserEntityByUsernameAndPassword(userDTO.getUsername(), userDTO.getPassword());

        System.out.println("--------------");
        System.out.println(userEntity);
        System.out.println("--------------");

        if (userEntity != null) {
            return userDetailService.loadUserByUsername(userEntity.getUsername()).getUsername().equals(userEntity.getUsername());
        }
        return false;
    }
}
