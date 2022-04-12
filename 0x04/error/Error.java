public class Error {


    public User createUser(User user){
        try {
            loadUser(user.getId());
            throw new UserExistsException(user.getId())
        }
        catch (UserNotFoundException exception){
          
        }
        resolveGroup(user);
        return userRepository.save(user);
    }

    public Object createUser(User user){

        if(loadUser(user.getId()) instanceof User){
        
            return USER_ALREADY_EXISTS; 
            return 101;
        };

        resolveGroup(user);
        return userRepository.save(user);
    }


    public void validate(String id){
        if(ownerRepo.count(id) == 0){
            throw new ValidationException("ocorreu uma exceção ...")
        }
    }
  
    public void validate(String id){
        if(ownerRepo.count(id) == 0){
            throw new ValidationException("id: " + id + " não foi informado, deveria ser informado...")
        }
    }



    public User createUser(User user){

        if(loadUser(user.getId()) instanceof User){
          
            return null;
        };

        resolveGroup(user);
        return userRepository.save(user);
    }
    
    public User createUser(User user){

        try {
            loadUser(user.getId());
            throw new UserExistsException(user.getId())
        }
        catch (UserNotFoundException exception){
          
        }

        resolveGroup(user);
        return userRepository.save(user);
    }

}